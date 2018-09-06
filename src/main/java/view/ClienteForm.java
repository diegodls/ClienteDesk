/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author DiegoL
 */
public class ClienteForm extends javax.swing.JFrame {

    /**
     * Creates new form ClienteDesk
     */
    public ClienteForm() {
        initComponents();
        configurarFormulario();
        acaoBotao();
        configurarTabela();
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Numero");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnInserir.setText("inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnDeletar.setText("deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnLimpar.setText("limpar");

        tabDados.setModel(new javax.swing.table.DefaultTableModel(
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
        tabDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInserir)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 327, Short.MAX_VALUE))
                                    .addComponent(txtNome))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(txtId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir)
                    .addComponent(btnDeletar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDadosMouseClicked
        int linha = tabDados.getSelectedRow();
        if (linha >= 0) {
            String c0 = tabDados.getValueAt(linha, 0).toString();
            String c1 = tabDados.getValueAt(linha, 1).toString();
            String c2 = tabDados.getValueAt(linha, 2).toString();
            txtId.setText(c0);
            txtNome.setText(c1);
            txtNumero.setText(c2);
            btnInserir.setText("Atualizar");

        }

    }//GEN-LAST:event_tabDadosMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabDados;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    private final String URLGlobal = "http://localhost:8080/ClienteRest/cliente/";

    private void configurarFormulario() {
        setTitle("Controle Pessoas");
        setResizable(false);
        setLocationRelativeTo(this);
        txtId.setEditable(false);
    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("ID");
        m.addColumn("Nome");
        m.addColumn("Numero");
        tabDados.setModel(m);
    }

    private void acaoBotao() {

        btnInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cliente a = new Cliente();
                a.setNome(txtNome.getText());
                a.setCpf(txtNumero.getText());
                if (txtId.getText().isEmpty()) {
                    inserir(a);
                    txtId.setText("");
                    txtNome.setText("");
                    txtNumero.setText("");
                    btnInserir.setText("Inserir");

                } else {
                    a.setId(Integer.valueOf(txtId.getText()));
                    atualizar(a);
                    txtId.setText("");
                    txtNome.setText("");
                    txtNumero.setText("");
                    btnInserir.setText("Atualizar");

                }

                listar();
            }
        });
        btnDeletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (txtId.getText().isEmpty()) {
                    System.out.println("Nada Selecionado!!!");
                } else {
                    int id = Integer.parseInt(txtId.getText());                            
                    deletar(id);
                    txtId.setText("");
                    txtNome.setText("");
                    txtNumero.setText("");
                    System.out.println("Apagando a posição: " + id);

                }

                listar();

            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtId.setText("");
                txtNome.setText("");
                txtNumero.setText("");
                btnInserir.setText("Inserir");

            }

        }
        );

    }

    private void listar() {
        try {
            final String URL = URLGlobal + "listar";
            HttpClient cliente = HttpClientBuilder.create().build();
            HttpGet requisicao = new HttpGet(URL);
            requisicao.addHeader("Accept", "application/json");
            HttpResponse resposta = cliente.execute(requisicao);
            String conteudo = EntityUtils.toString(resposta.getEntity());
            //Parser do conteudo JSON
            List<Cliente> lista = new Gson().fromJson(conteudo,
                    new TypeToken<ArrayList<Cliente>>() {
                    }.getType());
            //------------------------
            if (lista != null) {
                configurarTabela();
                DefaultTableModel m = (DefaultTableModel) tabDados.getModel();
                for (Cliente a : lista) {
                    m.addRow(new Object[]{a.getId(), a.getNome(), a.getCpf()});
                }
                tabDados.setModel(m);
            }
            btnInserir.setText("Inserir");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void inserir(Cliente a) {
        try {
            final String URL = URLGlobal + "inserir";

            HttpClient cliente = HttpClientBuilder.create().build();
            HttpPost requisicao = new HttpPost(URL);

            requisicao.addHeader("Content-Type", "application/json");


            /*TRANFORMAR O OBJETO ALUNO EM JSON*/
            StringEntity se = new StringEntity(new Gson().toJson(a));
            requisicao.setEntity((HttpEntity) se);
            HttpResponse resposta = cliente.execute(requisicao);
            String conteudo = EntityUtils.toString(resposta.getEntity());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void atualizar(Cliente a) {
        try {
            final String URL = URLGlobal + "atualizar";

            HttpClient cliente = HttpClientBuilder.create().build();
            HttpPut requisicao = new HttpPut(URL);

            requisicao.addHeader("Content-Type", "application/json");

            /*TRANFORMAR O OBJETO ALUNO EM JSON*/
            StringEntity se = new StringEntity(new Gson().toJson(a));
            requisicao.setEntity((HttpEntity) se);
            HttpResponse resposta = cliente.execute(requisicao);
            String conteudo = EntityUtils.toString(resposta.getEntity());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void deletar(int id) {

        try {
            String id_String = String.valueOf(id);
            final String URL = URLGlobal + "deletar/" + id_String;

            HttpClient cliente = HttpClientBuilder.create().build();
            HttpGet requisicao = new HttpGet(URL);

            
            requisicao.addHeader("Content-Type", "application/json");
            
            HttpResponse resposta = cliente.execute(requisicao);
            
            String conteudo = EntityUtils.toString(resposta.getEntity());
            
            listar();


            System.out.println("Status: " + resposta.getStatusLine().toString());
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
