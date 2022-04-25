package tugasjdbc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registrasi extends javax.swing.JFrame {
    Connector koneksi = new Connector();
    
    /**
     * Creates new form Registrasi
     */
    public Registrasi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        passlabel = new javax.swing.JLabel();
        bckbtn = new javax.swing.JButton();
        regbtn = new javax.swing.JButton();
        passtxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(345, 345));

        title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        title.setText("REGISTRASI");

        userlabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userlabel.setText("Username");

        passlabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passlabel.setText("Password");

        bckbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bckbtn.setText("Back");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });

        regbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regbtn.setText("Registrasi");
        regbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userlabel)
                    .addComponent(passlabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usertxt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(regbtn))
                            .addComponent(passtxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bckbtn)
                    .addComponent(regbtn))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbtnActionPerformed
        if(usertxt.getText().equals("") || passtxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                String query = "INSERT INTO `users`(`username`,`password`) VALUES ('"+usertxt.getText()+"','"+passtxt.getText()+"')";
                koneksi.statement = koneksi.koneksi.createStatement();
                koneksi.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Username Sudah Digunakan!");
                System.out.println(e.getMessage());
            }finally{
                this.dispose();
                Login login = new Login();
                login.setVisible(true);
            }
        }
    }//GEN-LAST:event_regbtnActionPerformed

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_bckbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckbtn;
    private javax.swing.JLabel passlabel;
    private javax.swing.JTextField passtxt;
    private javax.swing.JButton regbtn;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userlabel;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}