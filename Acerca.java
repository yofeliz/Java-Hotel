public class Acerca extends javax.swing.JDialog {

    public Acerca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }//COnstructor

    private void initComponents() {//GEN-BEGIN:initComponents
        jlDuke = new javax.swing.JLabel();
        jlVHotel = new javax.swing.JLabel();
        jlDavid = new javax.swing.JLabel();
        jlGestion = new javax.swing.JLabel();
        jlCurso = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jbtnAceptar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setTitle("Acerca de...");
        setFont(new java.awt.Font("Verdana", 0, 10));
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jlDuke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDuke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/duke.gif")));
        jlDuke.setBorder(new javax.swing.border.EtchedBorder());
        getContentPane().add(jlDuke);
        jlDuke.setBounds(10, 10, 110, 130);

        jlVHotel.setFont(new java.awt.Font("Verdana", 3, 24));
        jlVHotel.setText("VHotel");
        getContentPane().add(jlVHotel);
        jlVHotel.setBounds(140, 20, 90, 30);

        jlDavid.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDavid.setText("David D\u00edaz Pescador");
        getContentPane().add(jlDavid);
        jlDavid.setBounds(140, 90, 130, 14);

        jlGestion.setFont(new java.awt.Font("Verdana", 3, 12));
        jlGestion.setText("Gesti\u00f3n visual de un Hotel");
        getContentPane().add(jlGestion);
        jlGestion.setBounds(150, 50, 180, 16);

        jlCurso.setFont(new java.awt.Font("Verdana", 0, 10));
        jlCurso.setText("2\u00ba A.S.I. - I.E.S. Castro da Uz");
        getContentPane().add(jlCurso);
        jlCurso.setBounds(140, 105, 166, 14);

        jlFecha.setFont(new java.awt.Font("Verdana", 0, 10));
        jlFecha.setText("Enero 2004");
        getContentPane().add(jlFecha);
        jlFecha.setBounds(140, 120, 63, 14);

        jbtnAceptar.setFont(new java.awt.Font("Verdana", 0, 10));
        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        getContentPane().add(jbtnAceptar);
        jbtnAceptar.setBounds(260, 150, 75, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-350)/2, (screenSize.height-205)/2, 350, 205);
    }//GEN-END:initComponents

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jbtnAceptarActionPerformed
    
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlDavid;
    private javax.swing.JLabel jlDuke;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlGestion;
    private javax.swing.JLabel jlVHotel;
    // End of variables declaration//GEN-END:variables
    
}//Acerca