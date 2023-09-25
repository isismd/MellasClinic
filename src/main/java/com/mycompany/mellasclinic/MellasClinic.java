package com.mycompany.mellasclinic;

import ClassesNew.Brinquedos;
import ClassesNew.Cliente;
import ClassesNew.Roupas;
import ClassesNew.Alimentos;
import ClassesNew.Vendedor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MellasClinic {

    public List<Vendedor> listaVendedores;
    public List<Cliente> listaClientes;
    public List<Roupas> listaRoupas;
    public List<Alimentos> listaAlimentos;
    public List<Brinquedos> listaBrinquedos;

    int idPessoa = 0;
    int idProduto = 0;
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        new MellasClinic();
    }

    private MellasClinic() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {
            // Opções
            System.out.println("Boas vindas, escolha uma opção");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listagem de Array");
            System.out.println("3 - Listagem do Arquivo Físico");
            System.out.println("4 - Persistir Dados");
            System.out.println("5 - Excluir item");
            System.out.println("6 - Limpar Arquivo Físico");
            System.out.println("7 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Cadastrar();
                case 2:
                // listar
                case 3:
                // listar
                case 4:
                // persistir
                case 5:
                // excluir
                case 6:
                // limpar
            }

        }
    }

    public void Cadastrar() {
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
                case 1:
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1:
                                CadastrarVendedor();
                            case 2:
                                CadastrarCliente();
                        }
                    }
                case 2:
                    while (produto != 4) {
                        System.out.println("Escolha a categoria");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Brinquedos");
                        System.out.println("3 - Roupas");
                        System.out.println("4 - Sair");
                        pessoa = scanner.nextInt();

                        switch (produto) {
                            case 1:
                            //alimentos
                            case 2:
                            //briquedos
                            case 3:
                                cadastrarRoupas();
                            case 4:
                            //sair  
                        }

                    }
                case 3:
                // 
            }
        }

    }

    public void Listar() {
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
                case 1:
                    while (pessoa != 3) {
                        System.out.println("Escolha a categoria para listar");
                        System.out.println("1 - Vendedor");
                        System.out.println("2 - Cliente");
                        System.out.println("3 - Sair");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1:
                                imprimirListaDeVendedores(listaVendedores);
                            case 2:
                                imprimirListaDeClientes(listaClientes);
                        }
                    }
                case 2:
                    while (produto != 4) {
                        System.out.println("Escolha a categoria para listar");
                        System.out.println("1 - Alimentos");
                        System.out.println("2 - Roupas");
                        System.out.println("3 - Brinquedos");
                        System.out.println("4 - Voltar");
                        pessoa = scanner.nextInt();
                        switch (pessoa) {
                            case 1:
                            //  alimentos
                            case 2:
                            // roupas
                            case 3:
                            // brinks
                            case 4:
                            // sair
                        }
                    }
            }
        }

    }

    public void CadastrarVendedor() {
        listaVendedores = new ArrayList<>();
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
        listaClientes = new ArrayList<>();
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
        listaRoupas = new ArrayList<>();
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

    
    public void CadastrarAlimentos() throws ParseException {
        listaAlimentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Estoque: ");
        int estoque = scanner.nextInt();

        System.out.println("Data de Fabricação: ");
        String data = scanner.nextLine();
        Date dataFabricacao = formatter.parse(data);

        System.out.println("Data de Validade: ");
        String dataDois = scanner.nextLine();
        Date dataValidade = formatter.parse(dataDois);
        
        System.out.println("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextDouble();

        Alimentos alimentos = new Alimentos(idProduto++, nome, preco, estoque, dataValidade, dataFabricacao, peso);
        listaAlimentos.add(alimentos);

    }
    
    public void CadastrarBrinquedos() {
        listaBrinquedos = new ArrayList<>();
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


     Brinquedos brinquedos = new Brinquedos (idProduto++, nome, preco, estoque, faixaEtaria,  material);
    }
    
    public void imprimirListaDeClientes(List<Cliente> listaClientes) {
        for (Cliente cliente : listaClientes) {
            System.out.println("ID: " + cliente.getID_pessoa());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Cidade: " + cliente.getCidade());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("-------------------------------");
        }
    }

    public void imprimirListaDeVendedores(List<Vendedor> listaVendedores) {
        for (Vendedor vendedor : listaVendedores) {
            System.out.println("ID: " + vendedor.getID_pessoa());
            System.out.println("Nome: " + vendedor.getNome());
            System.out.println("Telefone: " + vendedor.getTelefone());
            System.out.println("Email: " + vendedor.getEmail());
            System.out.println("Cidade: " + vendedor.getCidade());
            System.out.println("Endereço: " + vendedor.getEndereco());
            System.out.println("Salário: " + vendedor.getSalario());
            System.out.println("-------------------------------");
        }
    }

}
