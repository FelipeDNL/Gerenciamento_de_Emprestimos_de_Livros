
package com.edu.ifsc.gui;

import java.awt.BorderLayout;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class telaRegPessoa extends javax.swing.JPanel {
    
    public telaRegPessoa(String login) {
        initComponents();
        this.jl_usuario.setText(login);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_voltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_login = new javax.swing.JTextField();
        tf_senha = new javax.swing.JTextField();
        bt_cadastrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_endereco = new javax.swing.JTextField();
        tf_idade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jl_usuario = new javax.swing.JLabel();

        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Nova Pessoa");

        jLabel2.setText("Login:");

        jLabel3.setText("Senha:");

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        jLabel4.setText("Nome:");

        jLabel5.setText("Idade:");

        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Usuário:");

        jl_usuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jl_usuario.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bt_voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(bt_cadastrar)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_endereco)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_usuario)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_usuario))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_voltar)
                    .addComponent(bt_cadastrar))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked
        if(!tf_login.getText().equals("") && !tf_senha.getText().equals("") && !tf_idade.getText().equals("") 
                && !tf_nome.getText().equals("") && !tf_endereco.getText().equals("")){

            try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
                String criarUsuario = "CREATE TABLE IF NOT EXISTS usuario (id INT PRIMARY KEY AUTO_INCREMENT, login VARCHAR(50), senha VARCHAR(50))";
                String criarPessoa = "CREATE TABLE IF NOT EXISTS pessoa(id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,nome VARCHAR(100) NOT NULL,idade INT NOT NULL,endereco VARCHAR(150))";
                
                try (PreparedStatement createTableStmt = conn.prepareStatement(criarUsuario)) {
                    createTableStmt.execute();
                }
                
                try (PreparedStatement createTableStmt = conn.prepareStatement(criarPessoa)) {
                    createTableStmt.execute();
                }
                
                String insertUsuario = "INSERT INTO usuario (login, senha) VALUES (?, ?)";
                try (PreparedStatement insertUserStmt = conn.prepareStatement(insertUsuario)) {
                    insertUserStmt.setString(1, tf_login.getText());
                    insertUserStmt.setString(2, tf_senha.getText());
                    insertUserStmt.execute();
                }
                
                String insertPessoa = "INSERT INTO pessoa (nome, idade, endereco) VALUES (?, ?, ?)";
                try (PreparedStatement insertUserStmt = conn.prepareStatement(insertPessoa)) {
                    insertUserStmt.setString(1, tf_nome.getText());
                    insertUserStmt.setString(2, tf_idade.getText());
                    insertUserStmt.setString(3, tf_endereco.getText());
                    insertUserStmt.execute();
                }
                
                JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");

                tf_login.setText("");
                tf_senha.setText("");
                tf_endereco.setText("");
                tf_idade.setText("");
                tf_nome.setText("");
                
                } catch (SQLException e) {
                System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            }
        } else JOptionPane.showMessageDialog(null, "Digite login e senha.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        try {
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            Main.telaLogado = new telaLogado(jl_usuario.getText());
            janela.getContentPane().remove(Main.telaRegPessoa);
            janela.add(Main.telaLogado, BorderLayout.CENTER);
            janela.pack();
        } catch (SQLException ex) {
            Logger.getLogger(telaRegPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_idade;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_senha;
    // End of variables declaration//GEN-END:variables
}
