
package com.edu.ifsc.gui;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class telaLogado extends javax.swing.JPanel {
    private DefaultTableModel tableModel, tableModel1;
    
    public telaLogado(String usuario) throws SQLException {
        initComponents();
        
        this.jl_usuario.setText(usuario);
        tableModel = new DefaultTableModel();
        tableModel1 = new DefaultTableModel();

        carregarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jl_usuario = new javax.swing.JLabel();
        bt_deslogar = new javax.swing.JButton();
        bt_mudar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_tabela = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_tabela1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Editar Registros");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Usuário:");

        jl_usuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jl_usuario.setText("jLabel3");

        bt_deslogar.setText("Deslogar");
        bt_deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deslogarMouseClicked(evt);
            }
        });

        bt_mudar.setText("Fazer mudanças");
        bt_mudar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mudarMouseClicked(evt);
            }
        });

        bt_excluir.setText("Remover Cadastro");
        bt_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_excluirMouseClicked(evt);
            }
        });

        jt_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_tabela);

        jt_tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_tabela1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_mudar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_excluir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_deslogar)
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_usuario)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(bt_mudar)
                        .addGap(18, 18, 18)
                        .addComponent(bt_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_deslogar)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_excluirMouseClicked
        int row = jt_tabela.getSelectedRow();   
        
        // Verifica se uma linha foi selecionada
        if (row != -1) {
            try {
                // Obtém os valores das colunas da linha selecionada
                int id = (int) jt_tabela.getValueAt(row, 0);
                int id1 = (int) jt_tabela1.getValueAt(row, 0);
                
                // Chama o método para excluir os dados do banco de dados
                excluirDados(id);
                excluirDados(id1);
                limparTabela();
                
                // Atualiza a exibição da tabela
                carregarDados();
                
            } catch (SQLException ex) {
                Logger.getLogger(telaLogado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else JOptionPane.showMessageDialog(null, "Escolha alguma pessoa ou usuário.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_excluirMouseClicked

    private void bt_deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deslogarMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        Main.telaLogin = new telaLogin();  
        janela.getContentPane().remove(Main.telaLogado);
        janela.add(Main.telaLogin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_deslogarMouseClicked

    private void bt_mudarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mudarMouseClicked
        int row = jt_tabela.getSelectedRow();  
        //PAREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIIIIIIII
        if(jt_tabela.isFocusOwner()){
            String login = JOptionPane.showInputDialog("Digite o novo nome de usuário:");
            String senha = JOptionPane.showInputDialog("Digite a nova senha:");
            int id = (int) jt_tabela.getValueAt(row, 0);
            System.out.println(id);
            
            String comando = "UPDATE `gerencia_registro`.`usuario` SET `login` = ?, `senha` = ? WHERE (`id` = ?)";
            try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
                try (PreparedStatement insertUserStmt = conn.prepareStatement(comando)) {
                    insertUserStmt.setString(1, login);
                    insertUserStmt.setString(2, senha);
                    insertUserStmt.setInt(3, id);
                    insertUserStmt.execute();
                }
                } catch (SQLException e) {
                System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            }
            jt_tabela.clearSelection();
        } else {
            if(jt_tabela1.isFocusOwner()){
                String nome = JOptionPane.showInputDialog("Digite o novo nome da pessoa:");
                String idade = JOptionPane.showInputDialog("Digite a nova idade:");
                String endereco = JOptionPane.showInputDialog("Digite o novo endereço da pessoa:");
                int id = (int) jt_tabela.getValueAt(row, 0);
                System.out.println(id);

                String comando = "UPDATE `gerencia_registro`.`pessoa` SET `nome` = ?, `idade` = ?, `endereco` = ? WHERE (`id` = ?)";
                try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
                    try (PreparedStatement insertUserStmt = conn.prepareStatement(comando)) {
                        insertUserStmt.setString(1, nome);
                        insertUserStmt.setInt(2, Integer.parseInt(idade));
                        insertUserStmt.setString(3, endereco);
                        insertUserStmt.setInt(4, id);
                        insertUserStmt.execute();
                    }
                } catch (SQLException e) {
                    System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_bt_mudarMouseClicked

    public void carregarDados() throws SQLException{
        try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
            
        //preenche tabela usuario
        String selUsuario = "SELECT id, login, senha FROM usuario";
        try (PreparedStatement selectUsersStmt = conn.prepareStatement(selUsuario);
            ResultSet resultSet = selectUsersStmt.executeQuery()) {
            
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Definir as colunas da tabela
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                tableModel.addColumn(columnName);
            }

            tableModel.setRowCount(0);

            // Adicionar os dados ao modelo da tabela
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(rowData);
            }

            jt_tabela.setModel(tableModel);
        }
        
        //preenche tabela pessoa
        String selPessoa = "SELECT id, nome, idade, endereco FROM pessoa";
        try (PreparedStatement selectUsersStmt = conn.prepareStatement(selPessoa);
            ResultSet resultSet = selectUsersStmt.executeQuery()) {
            
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Definir as colunas da tabela
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                tableModel1.addColumn(columnName);
            }

            tableModel1.setRowCount(0);

            // Adicionar os dados ao modelo da tabela
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                tableModel1.addRow(rowData);
            }

            jt_tabela1.setModel(tableModel1);
        }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limparTabela() {
        //limpa tabela 1
        int rowCount = tableModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        
        int columnCount = tableModel.getColumnCount();
        for (int i = columnCount - 1; i >= 0; i--) {
            tableModel.setColumnCount(i);
        }
        
        //limpa tabela 2
        for (int i = rowCount - 1; i >= 0; i--) {
            tableModel1.removeRow(i);
        }
        
        for (int i = columnCount - 1; i >= 0; i--) {
            tableModel1.setColumnCount(i);
        }
    }
    
    private void excluirDados(int id) {
        try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
            String deleteSQL = "DELETE FROM usuario WHERE id = ?";
            String deleteSQL1 = "DELETE FROM pessoa WHERE id = ?";
            
            try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL)) {
                deleteStmt.setInt(1, id);
                deleteStmt.executeUpdate();
            }
            
            try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL1)) {
                deleteStmt.setInt(1, id);
                deleteStmt.executeUpdate();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_deslogar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_mudar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTable jt_tabela;
    private javax.swing.JTable jt_tabela1;
    // End of variables declaration//GEN-END:variables
}
