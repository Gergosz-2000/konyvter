/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;

/**
 *
 * @author herma
 */
public class confirmDeleteFrame extends javax.swing.JFrame {


    public confirmDeleteFrame() {
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

        northPnl = new javax.swing.JPanel();
        eastPnl = new javax.swing.JPanel();
        southPnl = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        confirmBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        westPnl = new javax.swing.JPanel();
        centerPnl = new javax.swing.JPanel();
        questionLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Figyelem!");
        setPreferredSize(new java.awt.Dimension(360, 240));

        northPnl.setBackground(new java.awt.Color(219, 195, 140));
        northPnl.setPreferredSize(new java.awt.Dimension(559, 20));

        javax.swing.GroupLayout northPnlLayout = new javax.swing.GroupLayout(northPnl);
        northPnl.setLayout(northPnlLayout);
        northPnlLayout.setHorizontalGroup(
            northPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        northPnlLayout.setVerticalGroup(
            northPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(northPnl, java.awt.BorderLayout.PAGE_START);

        eastPnl.setBackground(new java.awt.Color(219, 195, 140));
        eastPnl.setPreferredSize(new java.awt.Dimension(20, 319));

        javax.swing.GroupLayout eastPnlLayout = new javax.swing.GroupLayout(eastPnl);
        eastPnl.setLayout(eastPnlLayout);
        eastPnlLayout.setHorizontalGroup(
            eastPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        eastPnlLayout.setVerticalGroup(
            eastPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(eastPnl, java.awt.BorderLayout.LINE_END);

        southPnl.setBackground(new java.awt.Color(219, 195, 140));
        southPnl.setPreferredSize(new java.awt.Dimension(647, 50));
        southPnl.setLayout(new java.awt.GridLayout(1, 2));

        jPanel3.setBackground(new java.awt.Color(219, 195, 140));

        confirmBtn.setBackground(new java.awt.Color(242, 229, 187));
        confirmBtn.setText("Igen");
        confirmBtn.setPreferredSize(new java.awt.Dimension(80, 35));
        jPanel3.add(confirmBtn);

        southPnl.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(219, 195, 140));

        cancelBtn.setBackground(new java.awt.Color(242, 229, 187));
        cancelBtn.setText("Mégse");
        cancelBtn.setPreferredSize(new java.awt.Dimension(80, 35));
        jPanel4.add(cancelBtn);

        southPnl.add(jPanel4);

        getContentPane().add(southPnl, java.awt.BorderLayout.PAGE_END);

        westPnl.setBackground(new java.awt.Color(219, 195, 140));
        westPnl.setPreferredSize(new java.awt.Dimension(20, 319));

        javax.swing.GroupLayout westPnlLayout = new javax.swing.GroupLayout(westPnl);
        westPnl.setLayout(westPnlLayout);
        westPnlLayout.setHorizontalGroup(
            westPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        westPnlLayout.setVerticalGroup(
            westPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(westPnl, java.awt.BorderLayout.LINE_START);

        centerPnl.setBackground(new java.awt.Color(219, 195, 140));
        centerPnl.setLayout(new java.awt.GridLayout(1, 0));

        questionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        centerPnl.add(questionLbl);

        getContentPane().add(centerPnl, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(confirmDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirmDeleteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel centerPnl;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel eastPnl;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel northPnl;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JPanel southPnl;
    private javax.swing.JPanel westPnl;
    // End of variables declaration//GEN-END:variables

    public JButton getConfirmBtn() {
        return confirmBtn;
    }
    public JButton getCancelBtn() {
        return cancelBtn;
    }
    public void setQuestionLbl(String text) {
        questionLbl.setText(text);
    }
}
