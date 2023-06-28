
package com.edu.ifsc.gui;

import java.awt.BorderLayout;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class telaLogado extends javax.swing.JPanel {
    private DefaultTableModel tableModel, tableModel1, tableModel2;
    private int tabelaSel;
    
    public telaLogado(String usuario) throws SQLException {
        initComponents();
        
        this.jl_usuario.setText(usuario);
        tableModel = new DefaultTableModel();
        tableModel1 = new DefaultTableModel();
        tableModel2 = new DefaultTableModel();

        carregarDados();
        verificarSel();
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
        jt_emprestimos = new javax.swing.JTable();
        bt_emprestar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Empréstimos e Edição de Registros");

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

        jt_emprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jt_emprestimos);

        bt_emprestar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_emprestar.setText("Emprestar");
        bt_emprestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_emprestarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Empréstimos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane2))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_deslogar)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_usuario)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bt_mudar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_regPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_regLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(bt_emprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_usuario)
                    .addComponent(bt_deslogar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mudar)
                    .addComponent(bt_excluir)
                    .addComponent(bt_regPessoa)
                    .addComponent(bt_regLivro)
                    .addComponent(bt_emprestar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_excluirMouseClicked
        int linhaL = jt_livros.getSelectedRow(); 
        int linhaP = jt_pessoa.getSelectedRow(); 
        int linhaEm = jt_emprestimos.getSelectedRow();
        
        // Verifica se uma linhaL foi selecionada
        if (linhaL != -1 || linhaP != -1 || linhaEm != -1) {
            try {
                if(tabelaSel == 1){
                    // Obtém os valores das colunas da linhaL selecionada
                    int id = (int) jt_livros.getValueAt(linhaL, 0);

                    // Chama o método para excluir os dados do banco de dados
                    excluirDados(id);
                    limparTabela();

                    // Atualiza a exibição da tabela
                    carregarDados();
                } else {
                    if(tabelaSel == 2){
                        int id = (int) jt_pessoa.getValueAt(linhaP, 0);

                        excluirDados(id);
                        limparTabela();

                        carregarDados();
                    } else {
                        if(tabelaSel == 3){
                            int id = (int) jt_emprestimos.getValueAt(linhaEm, 0);
                            
                            excluirDados(id);
                            limparTabela();

                            carregarDados();
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(telaLogado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else JOptionPane.showMessageDialog(null, "Escolha alguma pessoa ou livro.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_excluirMouseClicked

    private void bt_deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deslogarMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        Main.telaLogin = new telaLogin();  
        janela.getContentPane().remove(Main.telaLogado);
        janela.add(Main.telaLogin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_deslogarMouseClicked

    private void bt_mudarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mudarMouseClicked
        int linhaL = jt_livros.getSelectedRow();  
        int linhaP = jt_pessoa.getSelectedRow();  
        
        try {
            if(tabelaSel == 1){
                    String titulo = JOptionPane.showInputDialog("Digite o novo titulo do livro:");
                    int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade:"));
                    String autor = JOptionPane.showInputDialog("Digite o novo autor:");
                    String editora = JOptionPane.showInputDialog("Digite a nova editora:");
                    int id = (int) jt_livros.getValueAt(linhaL, 0);

                    String comando = "UPDATE `gerencia_registro`.`livro` SET `titulo` = ?, `quantidade` = ?, `autor` = ?, `editora` = ? WHERE (`id` = ?)";
                    try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
                        try (PreparedStatement declaracao = conn.prepareStatement(comando)) {
                            declaracao.setString(1, titulo);
                            declaracao.setInt(2, quant);
                            declaracao.setString(3, autor);
                            declaracao.setString(4, editora);
                            declaracao.setInt(5, id);
                            declaracao.execute();
                        }
                    } catch (SQLException e) {
                        System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
                    }
                    jt_livros.clearSelection();
                    limparTabela();
                    carregarDados();

            } else {
                if(tabelaSel == 2){
                    String nome = JOptionPane.showInputDialog("Digite o novo nome da pessoa:");
                    String idade = JOptionPane.showInputDialog("Digite a nova idade:");
                    String endereco = JOptionPane.showInputDialog("Digite o novo endereço da pessoa:");
                    int id1 = (int) jt_pessoa.getValueAt(linhaP, 0);

                    String comando1 = "UPDATE `gerencia_registro`.`pessoa` SET `nome` = ?, `idade` = ?, `endereco` = ? WHERE (`id` = ?)";
                    try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
                        try (PreparedStatement declaracao = conn.prepareStatement(comando1)) {
                            declaracao.setString(1, nome);
                            declaracao.setInt(2, Integer.parseInt(idade));
                            declaracao.setString(3, endereco);
                            declaracao.setInt(4, id1);
                            declaracao.execute();
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

    private void bt_emprestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_emprestarMouseClicked
        int linhaL = jt_livros.getSelectedRow(); 
        int linhaP = jt_pessoa.getSelectedRow(); 
        
        // Verifica se linhas foram selecionadas
        if (linhaL != -1 && linhaP != -1) {
            try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)){
                int idPessoa = (int) jt_pessoa.getValueAt(linhaP, 0);
                int idLivro = (int) jt_livros.getValueAt(linhaL, 0);
                LocalDate data_emprestimo = LocalDate.now();
                LocalDate data_devolucao = data_emprestimo.plusWeeks(2);
                
                
                String insertEmprestimo = "INSERT INTO emprestimo (id_pessoa, id_livro, data_emprestimo, data_devolucao) VALUES (?, ?, ?, ?)";
                try (PreparedStatement declaracao = conn.prepareStatement(insertEmprestimo)) {
                    declaracao.setInt(1, idPessoa);
                    declaracao.setInt(2, idLivro);
                    declaracao.setString(3, data_emprestimo.toString());
                    declaracao.setString(4, data_devolucao.toString());
                    declaracao.execute();
                }
                
                limparTabela();
                carregarDados();
                
            } catch (SQLException ex) {
                Logger.getLogger(telaLogado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else JOptionPane.showMessageDialog(null, "Escolha ambos pessoa e livro.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_emprestarMouseClicked

    private void carregarDados() throws SQLException{
        try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
            
        //preenche tabela livro
        String selUsuario = "SELECT id, titulo, quantidade, autor, editora FROM livro";
        try (PreparedStatement declaracao = conn.prepareStatement(selUsuario);
            ResultSet resultSet = declaracao.executeQuery()) {
            
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Definir as colunas da tabela
            int numColunas = metaData.getColumnCount();
            for (int i = 1; i <= numColunas; i++) {
                String nomeColuna = metaData.getColumnName(i);
                tableModel.addColumn(nomeColuna);
            }

            tableModel.setRowCount(0);

            // Adicionar os dados ao modelo da tabela
            while (resultSet.next()) {
                Object[] dadosLinha = new Object[numColunas];
                for (int i = 1; i <= numColunas; i++) {
                    dadosLinha[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(dadosLinha);
            }

            jt_livros.setModel(tableModel);
        }
        
        //preenche tabela pessoa
        String selPessoa = "SELECT id, nome, idade, endereco FROM pessoa";
        try (PreparedStatement declaracao = conn.prepareStatement(selPessoa);
            ResultSet resultSet = declaracao.executeQuery()) {
            
            ResultSetMetaData metaData = resultSet.getMetaData();

            int numColunas = metaData.getColumnCount();
            for (int i = 1; i <= numColunas; i++) {
                String columnName = metaData.getColumnName(i);
                tableModel1.addColumn(columnName);
            }

            tableModel1.setRowCount(0);

            while (resultSet.next()) {
                Object[] dadosLinha = new Object[numColunas];
                for (int i = 1; i <= numColunas; i++) {
                    dadosLinha[i - 1] = resultSet.getObject(i);
                }
                tableModel1.addRow(dadosLinha);
            }

            jt_pessoa.setModel(tableModel1);
        }
        
        //preenche tabela emprestimos
        String selLivro = "SELECT emprestimo.id, livro.titulo, pessoa.nome, emprestimo.data_emprestimo, emprestimo.data_devolucao FROM livro \n" +
                          "JOIN emprestimo ON livro.id = emprestimo.id_livro\n" +
                          "JOIN pessoa ON emprestimo.id_pessoa = pessoa.id";
        try (PreparedStatement declaracao = conn.prepareStatement(selLivro);
            ResultSet resultSet = declaracao.executeQuery()) {
            
            ResultSetMetaData metaData = resultSet.getMetaData();

            int numColunas = metaData.getColumnCount();
            for (int i = 1; i <= numColunas; i++) {
                String columnName = metaData.getColumnName(i);
                tableModel2.addColumn(columnName);
            }

            tableModel2.setRowCount(0);

            while (resultSet.next()) {
                Object[] dadosLinha = new Object[numColunas];
                for (int i = 1; i <= numColunas; i++) {
                    dadosLinha[i - 1] = resultSet.getObject(i);
                }
                tableModel2.addRow(dadosLinha);
            }

            jt_emprestimos.setModel(tableModel2);
        }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limparTabela() {
        //limpa tabela 1
        int numLinhas = tableModel.getRowCount();
        for (int i = numLinhas - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        
        int numColunas = tableModel.getColumnCount();
        for (int i = numColunas - 1; i >= 0; i--) {
            tableModel.setColumnCount(i);
        }
        
        //limpa tabela 2
        int numLinhas1 = tableModel1.getRowCount();
        for (int i = numLinhas1 - 1; i >= 0; i--) {
            tableModel1.removeRow(i);
        }
        
        int numColunas1 = tableModel1.getColumnCount();
        for (int i = numColunas1 - 1; i >= 0; i--) {
            tableModel1.setColumnCount(i);
        }
        
        //limpa tabela 3
        int numLinhas2 = tableModel2.getRowCount();
        for (int i = numLinhas2 - 1; i >= 0; i--) {
            tableModel2.removeRow(i);
        }

        int numColunas2 = tableModel2.getColumnCount();
        for (int i = numColunas2 - 1; i >= 0; i--) {
            tableModel2.setColumnCount(i);
        }
    }
    
    private void excluirDados(int id) {
        try (Connection conn = DriverManager.getConnection(Main.url, Main.username, Main.password)) {
            if(tabelaSel == 1){
                String deleteLivro = "DELETE FROM livro WHERE id = ?";
                
                try (PreparedStatement deleteStmt = conn.prepareStatement(deleteLivro)) {
                    deleteStmt.setInt(1, id);
                    deleteStmt.executeUpdate();
                }
            } else {
                if(tabelaSel == 2){
                    String deletePessoa = "DELETE FROM pessoa WHERE id = ?";
                    
                    try (PreparedStatement deleteStmt = conn.prepareStatement(deletePessoa)) {
                        deleteStmt.setInt(1, id);
                        deleteStmt.executeUpdate();
                    }
                } else {
                    if(tabelaSel == 3){
                        String deleteEmprestimo = "DELETE FROM emprestimo WHERE id = ?";
                        
                        try (PreparedStatement deleteStmt = conn.prepareStatement(deleteEmprestimo)) {
                            deleteStmt.setInt(1, id);
                            deleteStmt.executeUpdate();
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void verificarSel(){
        jt_livros.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Verificar se a seleção está ajustada e qual tabela está selecionada
                if (!event.getValueIsAdjusting()) {
                    tabelaSel = 1;
                }
            }
        });
        
        jt_pessoa.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Verificar se a seleção está ajustada e qual tabela está selecionada
                if (!event.getValueIsAdjusting()) {
                    tabelaSel = 2;
                }
            }
        });
        
        jt_emprestimos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // Verificar se a seleção está ajustada e qual tabela está selecionada
                if (!event.getValueIsAdjusting()) {
                    tabelaSel = 3;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTable jt_emprestimos;
    private javax.swing.JTable jt_livros;
    private javax.swing.JTable jt_pessoa;
    // End of variables declaration//GEN-END:variables
}
