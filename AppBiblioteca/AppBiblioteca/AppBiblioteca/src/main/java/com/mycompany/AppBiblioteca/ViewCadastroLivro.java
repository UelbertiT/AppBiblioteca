/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AppBiblioteca;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author uelbe
 */
public class ViewCadastroLivro extends javax.swing.JFrame {

    private DefaultTableModel modelo1 = new DefaultTableModel();
    private int linhaSelecionada = -1;
    
    public ViewCadastroLivro() {
        initComponents();
        carregaTitulo();
    }

    public void carregaTitulo() {
        modelo1.addColumn("Titulo");
        modelo1.addColumn("Autor");
        modelo1.addColumn("Editora");
        modelo1.addColumn("Publicação");
        modelo1.addColumn("Exemplares");
        tbTitulo.setModel(modelo1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEditora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfExemplares = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        btSalvarLivro = new javax.swing.JButton();
        btEmprestimo = new javax.swing.JButton();
        btVoltacdCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTitulo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Livro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Titulo Livro:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Editora:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Exemplares:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ano:");

        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });

        btSalvarLivro.setBackground(new java.awt.Color(0, 204, 0));
        btSalvarLivro.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btSalvarLivro.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarLivro.setText("Salvar Livro");
        btSalvarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarLivroActionPerformed(evt);
            }
        });

        btEmprestimo.setBackground(new java.awt.Color(153, 153, 0));
        btEmprestimo.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        btEmprestimo.setText("Emprestimo");
        btEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmprestimoActionPerformed(evt);
            }
        });

        btVoltacdCliente.setBackground(new java.awt.Color(255, 0, 0));
        btVoltacdCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btVoltacdCliente.setForeground(new java.awt.Color(255, 255, 255));
        btVoltacdCliente.setText("Voltar");
        btVoltacdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltacdClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEditora)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfExemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btVoltacdCliente)
                .addGap(18, 18, 18)
                .addComponent(btEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfExemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarLivro)
                    .addComponent(btEmprestimo)
                    .addComponent(btVoltacdCliente))
                .addGap(18, 18, 18))
        );

        tbTitulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Editora", "Exemplares", "Ano"
            }
        ));
        jScrollPane1.setViewportView(tbTitulo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoActionPerformed

    private void btSalvarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarLivroActionPerformed
        String titulo = tfTitulo.getText();
        String autor = tfAutor.getText();
        String editora = tfEditora.getText();
        String ano = tfAno.getText();
        String exemplares = tfExemplares.getText();

        if (linhaSelecionada >= 0) {
            modelo1.removeRow((linhaSelecionada));
            modelo1.insertRow(linhaSelecionada, new Object[]{titulo, autor, editora, ano, exemplares});
        } else {
            modelo1.addRow(new Object[]{titulo, autor, editora, ano, exemplares});
        }

        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setEditora(editora);
        livro.setAno(ano);
        livro.setExemplares(exemplares);

        JOptionPane.showMessageDialog(this, "Salvos com sucesso");

        tfTitulo.setText("");
        tfAutor.setText("");
        tfEditora.setText("");
        tfAno.setText("");
        tfExemplares.setText("");

        linhaSelecionada = -1;

        Controller.getInstance().salvarLivro(livro);
    }//GEN-LAST:event_btSalvarLivroActionPerformed

    private void btEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmprestimoActionPerformed
        ViewEmprestimo emprestimo = new ViewEmprestimo();
        emprestimo.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btEmprestimoActionPerformed

    private void btVoltacdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltacdClienteActionPerformed
    ViewCadastroCliente cadastroClientes = new ViewCadastroCliente();
    cadastroClientes.setVisible(true);
    
    dispose();
    }//GEN-LAST:event_btVoltacdClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmprestimo;
    private javax.swing.JButton btSalvarLivro;
    private javax.swing.JButton btVoltacdCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbTitulo;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfEditora;
    private javax.swing.JTextField tfExemplares;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}