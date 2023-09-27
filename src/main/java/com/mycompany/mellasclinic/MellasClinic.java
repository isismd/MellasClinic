package com.mycompany.mellasclinic;

import ClassesNew.Brinquedos;
import ClassesNew.Cliente;
import ClassesNew.Roupas;
import ClassesNew.Alimentos;
import ClassesNew.Vendedor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
// import java.text.SimpleDateFormat;
// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MellasClinic {

    public List<Vendedor> listaVendedores = new ArrayList<>();
    public List<Cliente> listaClientes = new ArrayList<>();
    public List<Roupas> listaRoupas = new ArrayList<>();
    public List<Alimentos> listaAlimentos = new ArrayList<>();
    public List<Brinquedos> listaBrinquedos = new ArrayList<>();

    int idPessoa = 0;
    int idProduto = 0;

    // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws FileNotFoundException, IOException {
        new MellasClinic();
    }

    private MellasClinic() throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 8) {
            // Opções Gerais
            System.out.println("Boas vindas, escolha uma opção");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listagem de Array");
            System.out.println("3 - Listagem do Arquivo Físico");
            System.out.println("4 - Persistir Dados");
            System.out.println("5 - Excluir item");
            System.out.println("6 - Limpar Arquivo Físico");
            System.out.println("7 - Vender");
            System.out.println("8 - Sair");

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
                case 5:
                // excluir
                case 6:
                // limpar
                case 7:
                // vender
            }

        }
    }

    // Opções de Cadastro
    private void Cadastrar() {
        Scanner scanner = new Scanner(System.in);
        int cadastrar = 0;
        int pessoa = 0;
        int produto = 0;

        while (cadastrar != 3) {
            System.out.println("O que você deseja cadastrar?");
            System.out.println("1 - Pessoas");
            System.out.println("2 - Produtos");
            System.out.println("3 - Sair");
            cadastrar = scanner.nextInt();

            switch (cadastrar) {
                case 1 -> {
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1:
                                CadastrarVendedor();
                                break;
                            case 2:
                                CadastrarCliente();
                                break;
                        }
                    }
                }
                case 2 -> {
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
                }
            }
        }

    }

    // Opções de listagem do array
    public final void Listar() {
        Scanner scanner = new Scanner(System.in);
        int listar = 0;
        int pessoa = 0;
        int produto = 0;

        while (listar != 3) {
            System.out.println("O que você deseja listar?");
            System.out.println("1 - Pessoas");
            System.out.println("2 - Produtos");
            System.out.println("3 - Sair");
            listar = scanner.nextInt();

            switch (listar) {
                case 1 -> {
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria para listar");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1 ->
                                imprimirArray(formatarLista(listaVendedores));
                            case 2 ->
                                imprimirArray(formatarLista(listaClientes));
                        }
                    }
                }
                case 2 -> {
                    while (produto != 4) {
                        System.out.println("Escolha a categoria para listar");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Roupas");
                        System.out.println("3 - Brinquedos");
                        System.out.println("4 - Voltar");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1 ->
                                imprimirArray(formatarLista(listaAlimentos));
                            case 2 ->
                                imprimirArray(formatarLista(listaRoupas));
                            case 3 ->
                                imprimirArray(formatarLista(listaBrinquedos));
                        }
                    }
                }
            }
        }

    }

    public void imprimirArray(String texto) {
        System.out.println(texto);
        System.out.println("-------------------------------");
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
                case 1 -> {
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria para persistir");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1 ->
                                persistirArquivo(listaVendedores);
                            case 2 ->
                                persistirArquivo(listaClientes);
                        }
                    }
                }
                case 2 -> {
                    while (produto != 4) {
                        System.out.println("Escolha a categoria para persistir");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Roupas");
                        System.out.println("3 - Brinquedos");
                        System.out.println("4 - Voltar");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1 ->
                                persistirArquivo(listaAlimentos);
                            case 2 ->
                                persistirArquivo(listaRoupas);
                            case 3 ->
                                persistirArquivo(listaBrinquedos);
                        }
                    }
                }
            }
        }
    }

    public final static <Elementos> void persistirArquivo(List<Elementos> lista) throws FileNotFoundException, IOException {
        try (FileWriter myWriter = new FileWriter("ArquivoFisico.txt")) {
            myWriter.write(formatarLista(lista));
            lista.clear();
        }
    }

    // Listar arquivo fisico
    public final void ListarArquivo() throws FileNotFoundException {
        File arquivo = new File("ArquivoFisico.txt");
        try (Scanner scanner = new Scanner(arquivo)) {
            while (scanner.hasNextLine()) {
                String dadosArquivo = scanner.nextLine();
                System.out.println(dadosArquivo);
            }
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
    public void CadastrarVendedor() {
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

        Vendedor vendedor = new Vendedor(idPessoa++, nome, telefone, email, cidade, endereco, salario);

        listaVendedores.add(vendedor);
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

        Cliente cliente = new Cliente(idPessoa++, nome, telefone, email, cidade, endereco);
        listaClientes.add(cliente);

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

        System.out.println("Tamanho: ");
        String tamanho = scanner.nextLine();

        System.out.println("Cor: ");
        String cor = scanner.nextLine();

        Roupas roupa = new Roupas(idProduto++, nome, preco, estoque, tamanho, cor);
        listaRoupas.add(roupa);

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

        System.out.println("Material: ");
        String material = scanner.nextLine();

        Brinquedos brinquedos = new Brinquedos(idProduto++, nome, preco, estoque, faixaEtaria, material);
        listaBrinquedos.add(brinquedos);
    }

}
