/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Paineis;
import Controller.Calcular_valor;
import Controller.Pegar_hora_data;
import Controller.Registrar_entrada;
import Controller.Registrar_saida;
import java.awt.Color;
import java.awt.Font;


/**
 *
 * @author chelsea
 */
public class painel_saida extends javax.swing.JPanel {

    private int contador = 0;

    /**
     * Creates new form painel_consulta
     */
    public painel_saida() {
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
        btn_registrar_saida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        c_ticket = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_x = new javax.swing.JButton();

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

        btn_registrar_saida.setBackground(new java.awt.Color(38, 75, 101));
        btn_registrar_saida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_registrar_saida.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_saida.setText("REGISTRAR SAIDA");
        btn_registrar_saida.setFocusPainted(false);
        btn_registrar_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_saidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar Saida do veiculo");
        jLabel2.setToolTipText("");

        c_ticket.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_ticket.setForeground(new java.awt.Color(173, 173, 173));
        c_ticket.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 235, 235), new java.awt.Color(255, 255, 255)));
        c_ticket.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_ticketFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_ticketFocusLost(evt);
            }
        });
        c_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_ticketActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Nº Ticket");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_x, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(c_ticket))
                        .addContainerGap(388, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registrar_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_x, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(btn_registrar_saida)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void limpar_campos(){
        c_ticket.setText("");
    }
    private void btn_registrar_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_saidaActionPerformed
        Registrar_saida t = new Registrar_saida();
        Calcular_valor  v = new Calcular_valor();
        t.Registrar_saida(c_ticket.getText());
        v.valor(c_ticket.getText());
        limpar_campos();
    }//GEN-LAST:event_btn_registrar_saidaActionPerformed

    private void c_ticketFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_ticketFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ticketFocusGained

    private void c_ticketFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_ticketFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ticketFocusLost

    private void c_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_ticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ticketActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_xActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar_saida;
    private javax.swing.JButton btn_x;
    private javax.swing.JTextField c_ticket;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
