/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Paineis;
import Controller.Pegar_hora_data;
import Controller.Registrar_entrada;
import javax.swing.JOptionPane;


/**
 *
 * @author chelsea
 */
public class painel_entrada extends javax.swing.JPanel {

    private int contador = 0;

    /**
     * Creates new form painel_consulta
     */
    public painel_entrada() {
        initComponents();
        limpar_campos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        btn_registrar_entrada1 = new javax.swing.JButton();
        c_cpf = new javax.swing.JTextField();
        c_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_placa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c_cor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c_modelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_formatar_cpf = new javax.swing.JButton();
        btn_x = new javax.swing.JButton();
        btn_Limpar_campos = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar Entrada do veiculo ");
        jLabel2.setToolTipText("");

        btn_registrar_entrada1.setBackground(new java.awt.Color(47, 100, 64));
        btn_registrar_entrada1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_registrar_entrada1.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_entrada1.setText("REGISTRAR ENTRADA");
        btn_registrar_entrada1.setFocusPainted(false);
        btn_registrar_entrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_entrada1ActionPerformed(evt);
            }
        });

        c_cpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_cpf.setForeground(new java.awt.Color(173, 173, 173));
        c_cpf.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 235, 235), new java.awt.Color(255, 255, 255)));
        c_cpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_cpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_cpfFocusLost(evt);
            }
        });
        c_cpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_cpfMouseClicked(evt);
            }
        });
        c_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cpfActionPerformed(evt);
            }
        });
        c_cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_cpfKeyPressed(evt);
            }
        });

        c_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_nome.setForeground(new java.awt.Color(173, 173, 173));
        c_nome.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 235, 235), new java.awt.Color(255, 255, 255)));
        c_nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_nomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_nomeFocusLost(evt);
            }
        });
        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Nome do cliente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("CPF");

        c_placa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_placa.setForeground(new java.awt.Color(173, 173, 173));
        c_placa.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 235, 235), new java.awt.Color(255, 255, 255)));
        c_placa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_placaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_placaFocusLost(evt);
            }
        });
        c_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_placaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Placa do veiculo");

        c_cor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_cor.setForeground(new java.awt.Color(173, 173, 173));
        c_cor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 235, 235), new java.awt.Color(255, 255, 255)));
        c_cor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_corFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_corFocusLost(evt);
            }
        });
        c_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_corActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Cor do veiculo");

        c_modelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_modelo.setForeground(new java.awt.Color(173, 173, 173));
        c_modelo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 235, 235), new java.awt.Color(255, 255, 255)));
        c_modelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_modeloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_modeloFocusLost(evt);
            }
        });
        c_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_modeloActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Modelo do veiculo");

        btn_formatar_cpf.setBackground(new java.awt.Color(38, 75, 101));
        btn_formatar_cpf.setForeground(new java.awt.Color(255, 255, 255));
        btn_formatar_cpf.setText("Formatar CPF");
        btn_formatar_cpf.setEnabled(false);
        btn_formatar_cpf.setFocusPainted(false);
        btn_formatar_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formatar_cpfActionPerformed(evt);
            }
        });

        btn_x.setBackground(new java.awt.Color(255, 255, 255));
        btn_x.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_x.setForeground(new java.awt.Color(102, 102, 102));
        btn_x.setText("X");
        btn_x.setBorder(null);
        btn_x.setBorderPainted(false);
        btn_x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });

        btn_Limpar_campos.setBackground(new java.awt.Color(131, 24, 24));
        btn_Limpar_campos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Limpar_campos.setForeground(new java.awt.Color(255, 255, 255));
        btn_Limpar_campos.setText("LIMPAR CAMPOS");
        btn_Limpar_campos.setFocusPainted(false);
        btn_Limpar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Limpar_camposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_nome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_x, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(153, 153, 153))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(c_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(c_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(275, 275, 275)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel8)
                                                    .addComponent(c_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn_formatar_cpf)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(c_cpf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(360, 360, 360)
                                        .addComponent(btn_Limpar_campos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_registrar_entrada1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_x, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_formatar_cpf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar_entrada1)
                    .addComponent(btn_Limpar_campos))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void limpar_campos(){
        c_nome.setText("");
        c_cpf.setText("");
        c_placa.setText("");
        c_modelo.setText("");
        c_cor.setText("");   
    }
    private void btn_registrar_entrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_entrada1ActionPerformed
        Registrar_entrada t = new Registrar_entrada();
        Pegar_hora_data h = new Pegar_hora_data();
        boolean x = t.InserirDados(c_nome.getText(), c_cpf.getText(), c_placa.getText(), c_cor.getText(), c_modelo.getText(), h.Pegar_data(), h.Pegar_hora(), "", "", "");
        contador = 0;
        if(x == true){
            limpar_campos();
        }
    }//GEN-LAST:event_btn_registrar_entrada1ActionPerformed

    private void c_cpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_cpfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cpfFocusGained

    private void c_cpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_cpfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cpfFocusLost

    private void c_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cpfActionPerformed

    private void c_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_nomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeFocusGained

    private void c_nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_nomeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeFocusLost

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_placaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_placaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_c_placaFocusGained

    private void c_placaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_placaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_c_placaFocusLost

    private void c_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_placaActionPerformed

    private void c_corFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_corFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_c_corFocusGained

    private void c_corFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_corFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_c_corFocusLost

    private void c_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_corActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_corActionPerformed

    private void c_modeloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_modeloFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_c_modeloFocusGained

    private void c_modeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_modeloFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_c_modeloFocusLost

    private void c_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_modeloActionPerformed

    private void btn_formatar_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formatar_cpfActionPerformed
        try{
            if(contador == 0){
                String c = c_cpf.getText().substring(0,3)+"."+c_cpf.getText().substring(3,6)+"."+c_cpf.getText().substring(6,9)+"-"+c_cpf.getText().substring(9,11);
                c_cpf.setText(c);
                contador++;
            }else{
                System.out.println("CPF JA FORMATADO");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Necessario a inserçao de um cpf no campo para ser realizada a formataçao");
            //System.out.println("Necessario a inserçao de um cpf no campo para ser realizada a formataçao");
        }
    }//GEN-LAST:event_btn_formatar_cpfActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_xActionPerformed

    private void btn_Limpar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Limpar_camposActionPerformed
        limpar_campos();
    }//GEN-LAST:event_btn_Limpar_camposActionPerformed

    private void c_cpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_cpfMouseClicked
        contador = 0;
    }//GEN-LAST:event_c_cpfMouseClicked

    private void c_cpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_cpfKeyPressed
        contador = 0;
    }//GEN-LAST:event_c_cpfKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpar_campos;
    private javax.swing.JButton btn_formatar_cpf;
    private javax.swing.JButton btn_registrar_entrada1;
    private javax.swing.JButton btn_x;
    private javax.swing.JTextField c_cor;
    private javax.swing.JTextField c_cpf;
    private javax.swing.JTextField c_modelo;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_placa;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}