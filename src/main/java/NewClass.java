
import ClassesNew.Vendedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewClass extends JFrame {

    private final JButton cadastrarButton;
    private final JButton listarButton;
    private final JButton listarArquivoButton;
    private final JButton persistirButton;
    private final JButton limparArquivoButton;

    public java.util.List<Vendedor> listaVendedores = new ArrayList<>();
    int idPessoa = 0;

    public NewClass() {
        setTitle("Mellas Clinic");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        cadastrarButton = new JButton("Cadastrar");
        listarButton = new JButton("Listar");
        listarArquivoButton = new JButton("Listar Arquivo");
        persistirButton = new JButton("Persistir");
        limparArquivoButton = new JButton("Limpar Arquivo");

        add(cadastrarButton);
        add(listarButton);
        add(listarArquivoButton);
        add(persistirButton);
        add(limparArquivoButton);

        cadastrarButton.addActionListener((ActionEvent e) -> {
            cadastrarVendedorDialog();
        });

        listarButton.addActionListener((ActionEvent e) -> {
            // Adicione aqui a lógica para a ação de Listagem
        });

        listarArquivoButton.addActionListener((ActionEvent e) -> {
            // Adicione aqui a lógica para a ação de Listar Arquivo
        });

        persistirButton.addActionListener((ActionEvent e) -> {
            // Adicione aqui a lógica para a ação de Persistir
        });

        limparArquivoButton.addActionListener((ActionEvent e) -> {
            // Adicione aqui a lógica para a ação de Limpar Arquivo
        });
    }

    private void cadastrarVendedorDialog() {
        JFrame frame = new JFrame("Cadastro de Vendedor");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(7, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();

        JLabel telefoneLabel = new JLabel("Telefone:");
        JTextField telefoneField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel cidadeLabel = new JLabel("Cidade:");
        JTextField cidadeField = new JTextField();

        JLabel enderecoLabel = new JLabel("Endereço:");
        JTextField enderecoField = new JTextField();

        JLabel salarioLabel = new JLabel("Salário:");
        JTextField salarioField = new JTextField();

        JButton cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener((ActionEvent e) -> {
            String nome = nomeField.getText();
            long telefone = Long.parseLong(telefoneField.getText());
            String email = emailField.getText();
            String cidade = cidadeField.getText();
            String endereco = enderecoField.getText();
            float salario = Float.parseFloat(salarioField.getText());
            
            Vendedor vendedor = new Vendedor(idPessoa++, nome, telefone, email, cidade, endereco, salario);
            listaVendedores.add(vendedor);
            
            frame.dispose(); // Fechar a janela de cadastro
            JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso!");
        });

        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(telefoneLabel);
        frame.add(telefoneField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(cidadeLabel);
        frame.add(cidadeField);
        frame.add(enderecoLabel);
        frame.add(enderecoField);
        frame.add(salarioLabel);
        frame.add(salarioField);
        frame.add(new JLabel()); // Espaço em branco
        frame.add(cadastrarButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NewClass().setVisible(true);
        });
    }
}
