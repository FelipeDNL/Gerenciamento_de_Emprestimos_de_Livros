
package com.edu.ifsc.gui;

import java.awt.BorderLayout;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class telaLogado extends javax.swing.JPanel {
    private DefaultTableModel tableModel, tableModel1;
    private int selectedTable;
    
    public telaLogado(String usuario) throws SQLException {
        initComponents();
        
        this.jl_usuario.setText(usuario);
        tableModel = new DefaultTableModel();
        tableModel1 = new DefaultTableModel();

        carregarDados();
        configurarTabela1();
        configurarTabela2();
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
        jt_livros = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_pessoa = new javax.swing.JTable();
        bt_regPessoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_regLivro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Emprestimos = new javax.swing.JTable();
        bt_emprestar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Empréstimos");

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

        bt_mudar.setText("Fazer Mudanças");
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

        jt_livros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jt_livros);

        jt_pessoa.setModel(new javax.swing.table.DefaultTableModel(
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
        jt_pessoa.setFocusable(false);
        jScrollPane3.setViewportView(jt_pessoa);

        bt_regPessoa.setText("Registrar Pessoa");
        bt_regPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_regPessoaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Pessoa:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Livros:");

        bt_regLivro.setText("Registrar Livro");
        bt_regLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_regLivroMouseClicked(evt);
            }
        });

        jt_Emprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jt_Emprestimos);

        bt_emprestar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_emprestar.setText("Emprestar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bt_regPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_mudar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_regLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bt_emprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bt_deslogar)
                                        .addGap(26, 26, 26)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_usuario)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_mudar)
                                .addGap(12, 12, 12)
                                .addComponent(bt_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_regPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_regLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_emprestar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_deslogar))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_excluirMouseClicked
        int row = jt_livros.getSelectedRow(); 
        int row1 = jt_pessoa.getSelectedRow(); 
        
        // Verifica se uma linha foi selecionada
        if (row != -1 || row1 != -1) {
            try {
                if(selectedTable == 1){
                    // Obtém os valores das colunas da linha selecionada
                    int id = (int) jt_livros.getValueAt(row, 0);

                    // Chama o método para excluir os dados do banco de dados
                    excluirDados(id);
                    limparTabela();

                    // Atualiza a exibição da tabela
                    carregarDados();
                } else {
                    if(selectedTable == 2){
                        int id = (int) jt_pessoa.getValueAt(row1, 0);

                        excluirDados(id);
                        limparTabela();

                        carregarDados();
                    }
                }
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
        int row = jt_livros.getSelectedRow();  
        int row1 = jt_pessoa.getSelectedRow();  
        
        try {
            if(selectedTable == 1){
                    String titulo = JOptionPane.showInputDialog("Digite o novo titulo do livro:");
                    int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade:"));
                    String autor = JOptionPane.showInputDialog("Digite o novo autor:");
                    String editora = JOptionPane.showInputDialog("Digite a nova editora:");
                    //String senha = JOptionPane.showInputDialog("Digite a nova quantidade:");
                    int id = (int) jt_livros.getValueAt(row, 0);

                    String comando = "UPDATE `gerencia_registro`.`livro` SET `titulo` = ?, `quantidade` = ?, `autor` = ?, `editora` = ? WHERE (`id` = ?)";
                    try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
                        try (PreparedStatement insertUserStmt = conn.prepareStatement(comando)) {
                            insertUserStmt.setString(1, titulo);
                            insertUserStmt.setInt(2, quant);
                            insertUserStmt.setString(3, autor);
                            insertUserStmt.setString(4, editora);
                            insertUserStmt.setInt(5, id);
                            insertUserStmt.execute();
                        }
                    } catch (SQLException e) {
                        System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
                    }
                    jt_livros.clearSelection();
                    limparTabela();
                    carregarDados();

            } else {
                if(selectedTable == 2){
                    String nome = JOptionPane.showInputDialog("Digite o novo nome da pessoa:");
                    String idade = JOptionPane.showInputDialog("Digite a nova idade:");
                    String endereco = JOptionPane.showInputDialog("Digite o novo endereço da pessoa:");
                    int id1 = (int) jt_pessoa.getValueAt(row1, 0);

                    String comando1 = "UPDATE `gerencia_registro`.`pessoa` SET `nome` = ?, `idade` = ?, `endereco` = ? WHERE (`id` = ?)";
                    try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
                        try (PreparedStatement insertUserStmt = conn.prepareStatement(comando1)) {
                            insertUserStmt.setString(1, nome);
                            insertUserStmt.setInt(2, Integer.parseInt(idade));
                            insertUserStmt.setString(3, endereco);
                            insertUserStmt.setInt(4, id1);
                            insertUserStmt.execute();
                        }
                    } catch (SQLException e) {
                        System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
                    }
                    jt_pessoa.clearSelection();
                    limparTabela();
                    carregarDados();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaLogado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_mudarMouseClicked

    private void bt_regPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_regPessoaMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        Main.telaRegPessoa = new telaRegPessoa(jl_usuario.getText());
        janela.getContentPane().remove(Main.telaLogado);
        janela.add(Main.telaRegPessoa, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_regPessoaMouseClicked

    private void bt_regLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_regLivroMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        Main.telaRegLivro = new telaRegLivro(jl_usuario.getText());
        janela.getContentPane().remove(Main.telaLogado);
        janela.add(Main.telaRegLivro, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_regLivroMouseClicked

    public void carregarDados() throws SQLException{
        try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
            
        //preenche tabela usuario
        String selUsuario = "SELECT id, titulo, quantidade, autor, editora FROM livro";
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

            jt_livros.setModel(tableModel);
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

            jt_pessoa.setModel(tableModel1);
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
        int rowCount1 = tableModel1.getRowCount();
        for (int i = rowCount1 - 1; i >= 0; i--) {
            tableModel1.removeRow(i);
        }
        
        int columnCount1 = tableModel1.getColumnCount();
        for (int i = columnCount1 - 1; i >= 0; i--) {
            tableModel1.setColumnCount(i);
        }
    }
    
    private void excluirDados(int id) {
        try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
            String deleteSQL = "DELETE FROM livro WHERE id = ?";
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
    
    private void configurarTabela1() {
        jt_livros.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    selectedTable = 1;
                    // Verifica se a seleção foi alterada
                    if (!jt_livros.getSelectionModel().isSelectionEmpty()) {
                        // Desseleciona a tabela 2
                        jt_pessoa.clearSelection();
                    }
                }
            }
        });
    }
    
    private void configurarTabela2() {
        jt_pessoa.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    selectedTable = 2;
                    // Verifica se a seleção foi alterada
                    if (!jt_pessoa.getSelectionModel().isSelectionEmpty()) {
                        // Desseleciona a tabela 1
                        jt_livros.clearSelection();
                    }
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_deslogar;
    private javax.swing.JButton bt_emprestar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_mudar;
    private javax.swing.JButton bt_regLivro;
    private javax.swing.JButton bt_regPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTable jt_Emprestimos;
    private javax.swing.JTable jt_livros;
    private javax.swing.JTable jt_pessoa;
    // End of variables declaration//GEN-END:variables
}
