package com.mycompany.mellasclinic;

import ClassesNew.Cliente;
import ClassesNew.Vendedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MellasClinic {

    public List<Vendedor> listaVendedores;
    public List<Cliente> listaClientes;
    int id = 0;

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
                            case 3:
                            // sair
                        }
                    }
                case 2:
                // produtos
                case 3:
                // 
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

        Vendedor vendedor = new Vendedor(id++, nome, telefone, email, cidade, endereco, salario);

        listaVendedores.add(vendedor);
        imprimirListaDeVendedores(listaVendedores);

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
