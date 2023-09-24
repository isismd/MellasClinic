package com.mycompany.mellasclinic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MellasClinic {

    public static void main(String[] args) {
        // TODO: FAZER AS OPÇÕES FUNCIONAREM

        // CONFIGS JFRAME 
        JFrame frame = new JFrame("MellasClinic");
        frame.setSize(600, 200);

        URL imageURL = MellasClinic.class.getResource("/Imgs/icon.png");

        ImageIcon icon = new ImageIcon(imageURL);
        frame.setIconImage(icon.getImage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        Dimension buttonSize = new Dimension(170, 60);

        JButton cadastrarButton = new JButton("Cadastrar");
        JButton listarArrayButton = new JButton("Listar Array");
        JButton listarArquivoButton = new JButton("Listar Arquivo Físico");
        JButton persistirButton = new JButton("Persistir Dados");
        JButton excluirButton = new JButton("Excluir Item do Array");
        JButton limparArquivoButton = new JButton("Limpar Arquivo Físico");

        cadastrarButton.setBackground(Color.PINK);
        listarArrayButton.setBackground(Color.PINK);
        listarArquivoButton.setBackground(Color.PINK);
        persistirButton.setBackground(Color.PINK);
        excluirButton.setBackground(Color.PINK);
        limparArquivoButton.setBackground(Color.PINK);

        cadastrarButton.setPreferredSize(buttonSize);
        listarArrayButton.setPreferredSize(buttonSize);
        listarArquivoButton.setPreferredSize(buttonSize);
        persistirButton.setPreferredSize(buttonSize);
        excluirButton.setPreferredSize(buttonSize);
        limparArquivoButton.setPreferredSize(buttonSize);

        buttonPanel.add(cadastrarButton);
        buttonPanel.add(listarArrayButton);
        buttonPanel.add(listarArquivoButton);
        buttonPanel.add(persistirButton);
        buttonPanel.add(excluirButton);
        buttonPanel.add(limparArquivoButton);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel labelText = new JLabel("Boas vindas, escolha uma opção para começar");
        textPanel.add(labelText);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(textPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        cadastrarButton.addActionListener((ActionEvent e) -> {
            String[] opcoes = {"Animais", "Funcionários", "Clientes", "Produtos"};
            String escolha = (String) JOptionPane.showInputDialog(
                    frame,
                    "O que você deseja cadastrar?",
                    "Escolha uma opção",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);
        });
    }
}
