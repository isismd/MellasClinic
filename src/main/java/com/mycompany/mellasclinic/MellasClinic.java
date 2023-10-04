package com.mycompany.mellasclinic;

import ClassesNew.Brinquedos;
import ClassesNew.Cliente;
import ClassesNew.Roupas;
import ClassesNew.Alimentos;
import ClassesNew.Pessoa;
import ClassesNew.Produto;
import ClassesNew.VendedorAlimenticios;
import ClassesNew.VendedorNaoAlimenticio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MellasClinic {

    public List<VendedorAlimenticios> listaVendedoresAlimenticios = new ArrayList<>();
    public List<VendedorNaoAlimenticio> listaVendedoresNaoAlimenticios = new ArrayList<>();
    public List<Cliente> listaClientes = new ArrayList<>();
    public List<Roupas> listaRoupas = new ArrayList<>();
    public List<Alimentos> listaAlimentos = new ArrayList<>();
    public List<Brinquedos> listaBrinquedos = new ArrayList<>();

    int idPessoa = 0;
    int idProduto = 0;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new MellasClinic();
    }

    private MellasClinic() throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {
            // Opções Gerais
            System.out.println("Boas vindas, escolha uma opção");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listagem de Array");
            System.out.println("3 - Listagem do Arquivo Físico");
            System.out.println("4 - Persistir Dados");
            System.out.println("5 - Excluir item");
            System.out.println("6 - Limpar Arquivo Físico");
            System.out.println("7- Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Cadastrar();
                    break;
                case 2:
                    Listar();
                    break;
                case 3:
                    ListarArquivo();
                    break;
                case 4:
                    Persistir();
                    break;
                case 5:
                    Excluir();
                    break;
                case 6:
                    LimparArquivo();
                    break;
                default:
                    break;
            }

        }
    }

    // Opções de Cadastro
    private void Cadastrar() {
        Scanner scanner = new Scanner(System.in);
        int cadastrar = 0;
        int pessoa = 0;
        int produto = 0;
        int opcaoTipo = 0;

        while (cadastrar != 3) {
            System.out.println("O que você deseja cadastrar?");
            System.out.println("1 - Pessoas");
            System.out.println("2 - Produtos");
            System.out.println("3 - Sair");
            cadastrar = scanner.nextInt();

            switch (cadastrar) {
                case 1:
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria para cadastrar");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1:
                                while (opcaoTipo != 3) {

                                    System.out.println("Qual o setor do vendedor?");
                                    System.out.println("1 - Vendedor de alimentícios");
                                    System.out.println("2 - Vendedor de não alimentícios");
                                    System.out.println("3 - Sair");
                                    opcaoTipo = scanner.nextInt();
                                    switch (opcaoTipo) {
                                        case 1:
                                            CadastrarVendedor(1);
                                            break;

                                        case 2:
                                            CadastrarVendedor(2);
                                            break;

                                        case 3:
                                            break;
                                    }
                                }
                                break;

                            case 2:
                                CadastrarCliente();
                                break;
                        }
                    }
                    break;

                case 2:
                    while (produto != 4) {
                        System.out.println("Escolha a categoria");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Brinquedos");
                        System.out.println("3 - Roupas");
                        System.out.println("4 - Sair");
                        produto = scanner.nextInt();

                        switch (produto) {
                            case 1 ->
                                cadastrarAlimentos();
                            case 2 ->
                                cadastrarBrinquedos();

                            case 3 ->
                                cadastrarRoupas();
                        }

                    }
                    break;

                default:
                    break;
            }
        }

    }

    public final void Listar() {
        Scanner scanner = new Scanner(System.in);
        int listar = 0;

        while (listar != 3) {
            System.out.println("O que você deseja listar?");
            System.out.println("1 - Pessoas");
            System.out.println("2 - Produtos");
            System.out.println("3 - Sair");
            listar = scanner.nextInt();

            switch (listar) {
                case 1:
                    int pessoa = 0;
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria para listar");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1:
                                int opcaoTipo = 0;
                                while (opcaoTipo != 3) {
                                    System.out.println("Escolha a categoria");
                                    System.out.println("1 - Vendedor de alimentícios");
                                    System.out.println("2 - Vendedor de não alimentícios");
                                    System.out.println("3 - Sair");
                                    opcaoTipo = scanner.nextInt();
                                    switch (opcaoTipo) {
                                        case 1 ->
                                            imprimirArray(formatarLista(listaVendedoresAlimenticios));

                                        case 2 ->
                                            imprimirArray(formatarLista(listaVendedoresNaoAlimenticios));

                                    }
                                }
                                break;

                            case 2:
                                imprimirArray(formatarLista(listaClientes));
                                break;
                        }
                    }
                    break;

                case 2:
                    int produto = 0;
                    while (produto != 4) {
                        System.out.println("Escolha a categoria para listar");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Roupas");
                        System.out.println("3 - Brinquedos");
                        System.out.println("4 - Sair");
                        produto = scanner.nextInt();
                        switch (produto) {
                            case 1:
                                imprimirArray(formatarLista(listaAlimentos));
                                break;
                            case 2:
                                imprimirArray(formatarLista(listaRoupas));
                                break;
                            case 3:
                                imprimirArray(formatarLista(listaBrinquedos));
                                break;
                            default:
                                break;
                        }
                    }
                    break;

                default:
                    break;
            }
        }
    }

    public void imprimirArray(String texto) {
        System.out.println("--------------- Array Impresso ---------------.");
        System.out.println(texto);
        System.out.println("----------------------------------------------");
    }

    // Opções de persistir
    public final void Persistir() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int persistir = 0;
        int pessoa = 0;
        int produto = 0;

        while (persistir != 3) {
            System.out.println("O que você deseja persistir?");
            System.out.println("1 - Pessoas");
            System.out.println("2 - Produtos");
            System.out.println("3 - Sair");
            persistir = scanner.nextInt();

            switch (persistir) {
                case 1:
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria para persistir");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1:
                                int opcaoTipo = 0;
                                while (opcaoTipo != 3) {
                                    System.out.println("Escolha a categoria");
                                    System.out.println("1 - Vendedor de alimentícios");
                                    System.out.println("2 - Vendedor de não alimentícios");
                                    System.out.println("3 - Sair");
                                    opcaoTipo = scanner.nextInt();
                                    switch (opcaoTipo) {
                                        case 1 -> {
                                            persistirArquivo(listaVendedoresAlimenticios);
                                            break;
                                        }
                                        case 2 -> {
                                            persistirArquivo(listaVendedoresNaoAlimenticios);
                                            break;
                                        }
                                        default -> {
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2: {
                                persistirArquivo(listaClientes);
                                break;
                            }
                            default:
                                break;
                        }
                    }
                case 2:
                    while (produto != 4) {
                        System.out.println("Escolha a categoria para persistir");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Roupas");
                        System.out.println("3 - Brinquedos");
                        System.out.println("4 - Sair");
                        produto = scanner.nextInt();
                        switch (produto) {
                            case 1 -> {
                                persistirArquivo(listaAlimentos);
                                break;
                            }
                            case 2 -> {
                                persistirArquivo(listaRoupas);
                                break;
                            }
                            case 3 -> {
                                persistirArquivo(listaBrinquedos);
                                break;
                            }
                            default -> {
                                break;
                            }
                        }
                    }
                    break;

                default:
                    break;
            }
        }
    }

    public final static <Elementos> void persistirArquivo(List<Elementos> lista) throws FileNotFoundException, IOException {
        try (FileWriter writer = new FileWriter("ArquivoFisico.txt")) {
            writer.write(formatarLista(lista));
            lista.clear();
        }
        System.out.println("---- O arquivo foi persistido com sucesso ----");
        System.out.println("----------------------------------------------");
    }

    public final void Excluir() {
        Scanner scanner = new Scanner(System.in);
        int excluir = 0;
        int pessoa = 0;
        int produto = 0;
        int opcaoTipo = 0;

        while (excluir != 3) {
            System.out.println("O que você deseja excluir?");
            System.out.println("1 - Pessoas");
            System.out.println("2 - Produtos");
            System.out.println("3 - Sair");
            excluir = scanner.nextInt();

            switch (excluir) {
                case 1:
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria para excluir");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1 -> {
                                while (opcaoTipo != 3) {
                                    System.out.println("Escolha a categoria");
                                    System.out.println("1 - Vendedor de alimentícios");
                                    System.out.println("2 - Vendedor de não alimentícios");
                                    System.out.println("3 - Sair");
                                    opcaoTipo = scanner.nextInt();
                                    switch (opcaoTipo) {
                                        case 1 ->
                                            excluirPessoas(listaVendedoresAlimenticios);
                                        case 2 ->
                                            excluirPessoas(listaVendedoresNaoAlimenticios);
                                    }
                                }
                            }
                            case 2 -> {
                                excluirPessoas(listaClientes);
                            }
                        }
                    }
                    break;

                case 2:
                    while (produto != 4) {
                        System.out.println("Escolha a categoria para excluir");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Roupas");
                        System.out.println("3 - Brinquedos");
                        System.out.println("4 - Sair");
                        produto = scanner.nextInt();
                        switch (produto) {
                            case 1:
                                excluirProduto(listaAlimentos);
                                break;
                            case 2:
                                excluirProduto(listaRoupas);
                                break;
                            case 3:
                                excluirProduto(listaBrinquedos);
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

// Listar arquivo fisico
    public final void ListarArquivo() throws FileNotFoundException {
        System.out.println("-------------- Arquivo Listado! --------------");
        File arquivo = new File("ArquivoFisico.txt");
        try (Scanner scanner = new Scanner(arquivo)) {
            while (scanner.hasNextLine()) {
                String dadosArquivo = scanner.nextLine();
                System.out.println(dadosArquivo);
            }
        }
        System.out.println("----------------------------------------------");
    }

    // Limpar arquivo físico
    public final void LimparArquivo() throws FileNotFoundException, IOException {
        File arquivo = new File("ArquivoFisico.txt");
        try (FileWriter writer = new FileWriter(arquivo)) {
            writer.write("");
            System.out.println("O conteudo do arquivo foi apagado com sucesso");
            System.out.println("----------------------------------------------");
        }

    }

    // Formatação da lista
    public static <Elementos> String formatarLista(List<Elementos> lista) {
        StringBuilder sb = new StringBuilder();

        for (Elementos elemento : lista) {
            sb.append(elemento.toString());
            sb.append("-----------------------\n");
        }

        return sb.toString();
    }

// Cadastros
    public void CadastrarVendedor(int tipo) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Telefone: ");
        long telefone = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Salario: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();

        if (tipo == 1) {
            VendedorAlimenticios vendedor = new VendedorAlimenticios(idPessoa++, nome, telefone, email, cidade, endereco, salario);
            listaVendedoresAlimenticios.add(vendedor);
        } else {
            VendedorNaoAlimenticio vendedor = new VendedorNaoAlimenticio(idPessoa++, nome, telefone, email, cidade, endereco, salario);
            listaVendedoresNaoAlimenticios.add(vendedor);
        }

    }

    public void CadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Telefone: ");
        long telefone = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Deseja tornar esse cliente elegível para desconto? 1 - Sim; 2 - Não");
        int resposta = scanner.nextInt();

        Cliente cliente = new Cliente(idPessoa++, nome, telefone, email, cidade, endereco);

        if (resposta == 1) {
            cliente.tornarElegivelParaDesconto();
        }

        listaClientes.add(cliente);
        System.out.println("------- Cliente cadastrado com sucesso -------");
        System.out.println("----------------------------------------------");

    }

    public void cadastrarRoupas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Preço: ");
        float preco = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Quantidade estoque: ");
        int estoque = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tamanho: ");
        String tamanho = scanner.nextLine();

        System.out.println("Cor: ");
        String cor = scanner.nextLine();

        Roupas roupa = new Roupas(idProduto++, nome, preco, estoque, tamanho, cor);
        listaRoupas.add(roupa);
        System.out.println("---- Produto roupa cadastrado com sucesso ----");
        System.out.println("----------------------------------------------");

    }

    public void cadastrarAlimentos() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Estoque: ");
        int estoque = scanner.nextInt();

        System.out.println("Data de Fabricação: ");
        String dataFabricacao = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Data de Validade: ");
        String dataValidade = scanner.nextLine();

        System.out.println("Peso: ");
        double peso = scanner.nextDouble();

        Alimentos alimentos = new Alimentos(idProduto++, nome, preco, estoque, dataFabricacao, dataValidade, peso);
        listaAlimentos.add(alimentos);

        System.out.println("-- Produto alimento cadastrado com sucesso! --");
        System.out.println("----------------------------------------------");
    }

    public void cadastrarBrinquedos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Preço: ");
        float preco = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Estoque: ");
        int estoque = scanner.nextInt();

        System.out.println("Faixa Etária: ");
        int faixaEtaria = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Material: ");
        String material = scanner.nextLine();

        Brinquedos brinquedos = new Brinquedos(idProduto++, nome, preco, estoque, faixaEtaria, material);
        listaBrinquedos.add(brinquedos);
        System.out.println("-- Produto brinquedo cadastrado com sucesso --");
        System.out.println("----------------------------------------------");
    }

    public static <T extends Pessoa> void excluirPessoas(List<T> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID a ser excluído: ");
        int idParaExcluir = scanner.nextInt();
        Iterator<T> iterador = lista.iterator();
        boolean achou = false;

        while (iterador.hasNext()) {
            T objeto = iterador.next();
            if (objeto.getID_pessoa() == idParaExcluir) {
                iterador.remove();
                achou = true;
                System.out.println("Pessoa com ID " + idParaExcluir + " foi removido da lista.");
                break;
            }
        }
        if (!achou) {
            System.out.println("Cliente com ID " + idParaExcluir + " não encontrado na lista.");
        }

    }

    public static <T extends Produto> void excluirProduto(List<T> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID a ser excluído: ");
        int idParaExcluir = scanner.nextInt();
        Iterator<T> iterador = lista.iterator();
        boolean achou = false;

        while (iterador.hasNext()) {
            T objeto = iterador.next();
            if (objeto.getId() == idParaExcluir) {
                iterador.remove();
                achou = true;
                System.out.println("Produto com ID " + idParaExcluir + " foi removido da lista.");
                break;
            }
        }
        if (!achou) {
            System.out.println("Produto com ID " + idParaExcluir + " não encontrado na lista.");
        }

    }

}
