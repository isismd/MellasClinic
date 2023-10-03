# Relatório

Alunas: Isis Daron, Julia Gomes e Tuliana Andrade

### **Visão Geral do Sistema**

Esse sistema foi desenvolvido para viabilizar o gerenciamento do estabelecimento MellasClinics, um renomado PetShop. Esta plataforma oferece funcionalidades que possibilitam o cadastro, listagem e a exclusão de itens de um array, bem como a listagem, persistência e limpeza de informações em um arquivo físico.

Os produtos comercializados estão categorizados em três principais grupos:

- Alimentos
- Roupas
- Brinquedos

Cada categoria de produto apresenta uma política de desconto única, projetada para incentivar a escolha do MellasClinics como a opção preferencial de compra por parte dos clientes. Adicionalmente, há uma distinção entre os vendedores dedicados às áreas de produtos alimentícios (alimentos) e não alimentícios (vestuário e brinquedos). Cada vendedor recebe uma comissão que varia conforme a área na qual atua.

### Uso de Encapsulamento

O encapsulamento foi aplicado no sistema para proteger os dados e garantir o acesso controlado a eles. Todas as classes do sistema definem atributos privados e fornecem métodos públicos para acessar e modificar esses atributos. Por exemplo, a classe **`Produto`** possui atributos protegidos como ID, nome, preço e estoque e métodos públicos para definir e obter esses atributos.

Além dos tradicionais métodos de obtenção e definição (getters e setters), o encapsulamento também é utilizado para determinar se um cliente é elegível para desconto ou não. Isso é realizado de modo que, ao listar as informações de um cliente específico, essa informação esteja acessível. A variável **`elegivelDesconto`** é mantida como privada, impedindo o acesso direto de fora da classe **`Cliente`**. O método **`tornarElegivelParaDesconto()`** possibilita a alteração controlada do estado da variável **`elegivelDesconto`**, enquanto o método **`elegivelParaDesconto()`** permite consultar esse estado de maneira controlada.

```java
public void tornarElegivelParaDesconto() {
	elegivelDesconto = true;
}

public String elegivelParaDesconto() {
	if (elegivelDesconto) {
		return "Sim";
	} else {
		return "Não";
	}
}
```

O método **`toString()`** proporciona uma representação textual do objeto **`Cliente`** e acessa o estado **`elegivelDesconto`** por meio do método **`elegivelParaDesconto()`**. Dessa forma, o encapsulamento é preservado, pois não há exposição direta da variável **`elegivelDesconto`**.

```java
@Override
public String toString() {
	return "Cliente ID => " + getID_pessoa() + "\nNome = " + getNome() + "\nTelefone = " + getTelefone() + "\nEmail = " + getEmail() + "\nCidade = " + getCidade() + "\nEndereco = " + getEndereco() + "\nElegivel para desconto = " + elegivelParaDesconto();
}
```

### **Relação de Herança**

A hierarquia de classes no sistema foi estruturada com base na relação de herança. As classes `Alimentos`, `Brinquedos` e `Roupas` herdam atributos e comportamentos essenciais da classe `Produto`. Da mesma forma, as classes `VendedorNaoAlimenticio` e `VendedorAlimenticios` herdam características específicas da classe `Vendedor`, que, por sua vez, estende a classe `Pessoa`, incorporando seus atributos e métodos.

Não apenas os vendedores, mas também os clientes são parte dessa hierarquia, uma vez que a classe `Cliente` também herda diretamente da classe `Pessoa`. Essa abordagem oferece uma maneira eficaz de reutilizar código, evitando a redundância de implementações comuns a diferentes entidades do sistema.

Ao adotar essa estratégia de herança, cria-se uma estrutura hierárquica que reflete a relação intrínseca entre os diversos tipos de produtos e pessoas no contexto do sistema. Essa organização não só promove a coesão e consistência no código, mas também simplifica a manutenção e expansão do sistema ao longo do tempo.

### **Classe Abstrata**

As classes abstratas, denominadas Produto e Pessoa, foram criadas para servirem de modelo para suas respectivas classes filhas. A classe Produto define um método abstrato chamado `calcularDesconto()`, o qual deve ser implementado pelas classes derivadas. Essa abordagem visa promover a consistência e a conformidade com as regras de desconto. Dessa forma, ao estabelecer métodos abstratos em classes abstratas, busca-se padronizar o comportamento das classes filhas, proporcionando uma estrutura coerente e facilitando a manutenção do sistema.

### **Sobrescrita/Polimorfismo**

A classe abstrata `Produto` possui um método abstrato `calcularDesconto()` que está sendo aplicado em suas classes filhas `Alimentos`, `Brinquedos` e `Roupas`.  Cada uma das classes filhas realiza uma sobrescrita do método `calcularDesconto()`, aplicando sua própria lógica para calcular o desconto apropriado. Por exemplo, na classe `Alimentos`, a sobrescrita desse método resulta em um cálculo de desconto específico para produtos alimentícios. Esse mecanismo de sobrescrita permite que cada subclasse forneça uma implementação personalizada do método, adaptando-o às suas próprias necessidades e comportamentos.

```java
@Override
public double calcularDesconto() {
	return this.getPreco() - (this.getPreco() * 0.05);
}
```

O uso do polimorfismo nesse contexto significa que, embora todas essas classes compartilhem um método comum com o mesmo nome (`calcularDesconto()`), o comportamento desse método varia dependendo do tipo de objeto ao qual ele é aplicado. Isso proporciona flexibilidade e extensibilidade ao sistema, permitindo que diferentes tipos de produtos se comportem de maneira distinta, mesmo quando invocam o mesmo método.

### **Uso de Interface**

No sistema, fazemos uso da interface `Gratificação` para atribuir bônus salariais aos nossos vendedores, levando em consideração o setor comercial ao qual estão vinculados. Como exemplo, na classe `VendedoresAlimenticios`, empregamos o método `bonificacao()` proveniente dessa interface. Isso resulta em um acréscimo de R$ 100,00 no salário do vendedor, como forma de reconhecimento pelo desempenho notável no setor de alimentos.

O mesmo princípio se aplica à classe `VendedoresNaoAlimenticios`, embora o valor do bônus possa variar, refletindo as particularidades do setor com o qual o vendedor está envolvido.

Esse uso de interfaces possibilita uma abordagem flexível para estender o comportamento das classes, permitindo que diferentes implementações sejam aplicadas em contextos distintos. Isso contribui para a adaptação e aprimoramento do sistema, garantindo que os bônus salariais sejam atribuídos de maneira adequada, de acordo com o setor de atuação de cada vendedor.

### Conclusão

Em resumo, a implementação deste sistema exemplifica a aplicação eficaz de princípios da programação orientada a objetos (POO), como encapsulamento, herança, classes abstratas, sobrescrita, polimorfismo e o uso de interfaces. Esse sistema oferece uma solução organizada e escalável para o gerenciamento do MellasClinics, garantindo a proteção de dados, reutilização de código e flexibilidade para adaptações futuras, tornando-se uma ferramenta eficiente para o gerenciamento de produtos, vendedores e clientes.
