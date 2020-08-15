package Frames;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        setUndecorated(true);
        initComponents();
        placeHolders();
        Teclado kb =new Teclado();
        fldUser.addKeyListener(kb);
        fldPass.addKeyListener(kb);
        lblHello.addKeyListener(kb);
        setTitle("RaíCinema");
        Image principalIco=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/popcornIco.png"));
        setIconImage(principalIco);
        setLocationRelativeTo(null);
        lblHello.requestFocusInWindow();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        fldUser = new javax.swing.JTextField();
        lblHello = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        fldPass = new javax.swing.JPasswordField();
        spr1 = new javax.swing.JSeparator();
        spr2 = new javax.swing.JSeparator();
        lblBtnEnter = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(472, 421, 421, 421));
        setMaximumSize(new java.awt.Dimension(472, 421));
        setMinimumSize(new java.awt.Dimension(472, 421));
        setSize(new java.awt.Dimension(472, 421));

        pnlFondo.setBackground(new java.awt.Color(39, 129, 241));
        pnlFondo.setForeground(new java.awt.Color(0, 114, 226));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoCinema.png"))); // NOI18N
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 88, 109), 5));
        lblTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTitleMouseDragged(evt);
            }
        });
        lblTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTitleMousePressed(evt);
            }
        });

        fldUser.setBackground(new java.awt.Color(39, 129, 241));
        fldUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fldUser.setForeground(new java.awt.Color(74, 44, 226));
        fldUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fldUser.setBorder(null);
        fldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUserActionPerformed(evt);
            }
        });

        lblHello.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblHello.setText("¡Hola, compañero!");

        lblLogin.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblLogin.setText("Por favor accede");

        fldPass.setBackground(new java.awt.Color(39, 129, 241));
        fldPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fldPass.setForeground(new java.awt.Color(74, 44, 226));
        fldPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fldPass.setBorder(null);

        spr1.setBackground(new java.awt.Color(74, 44, 226));
        spr1.setForeground(new java.awt.Color(74, 44, 226));
        spr1.setOpaque(true);

        spr2.setBackground(new java.awt.Color(74, 44, 226));
        spr2.setForeground(new java.awt.Color(74, 44, 226));
        spr2.setOpaque(true);

        lblBtnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterIco.png"))); // NOI18N
        lblBtnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnEnterMouseExited(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(74, 44, 226));
        lblInfo.setText("Para salir presione ESC                   Si olvidó usuario o contraseña pulse CTRL + H");

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFondoLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(lblTitle))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlFondoLayout.createSequentialGroup()
                                    .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spr1)
                                        .addComponent(fldPass)
                                        .addComponent(fldUser)
                                        .addComponent(spr2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(68, 68, 68))
                                .addGroup(pnlFondoLayout.createSequentialGroup()
                                    .addComponent(lblBtnEnter)
                                    .addGap(51, 51, 51)))
                            .addComponent(jLabel2)
                            .addGap(37, 37, 37)))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblLogin))
                            .addComponent(lblHello)))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInfo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHello)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblBtnEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(lblInfo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUserActionPerformed
    
    }//GEN-LAST:event_fldUserActionPerformed

    private void lblBtnEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEnterMouseEntered
        lblBtnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterIcoDark.png")));
    }//GEN-LAST:event_lblBtnEnterMouseEntered

    private void lblBtnEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEnterMouseExited
        lblBtnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterIco.png")));
    }//GEN-LAST:event_lblBtnEnterMouseExited
    
    private void lblTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleMousePressed
        xpos=evt.getX();
        ypos=evt.getY();
    }//GEN-LAST:event_lblTitleMousePressed

    private void lblTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleMouseDragged
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       this.setLocation(x-xpos-28, y-ypos-20); //Date 28 and 20 come from the approximation between the jlabel and the frame
    }//GEN-LAST:event_lblTitleMouseDragged

    private void lblBtnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEnterMouseClicked
        validateLogin();
    }//GEN-LAST:event_lblBtnEnterMouseClicked
    
    private void validateLogin(){
        String pass= new String(fldPass.getPassword());  //Obviously temporary
        if(fldUser.getText().equals("Me")&&pass.equals("Me")){
            new frmFunctions().setVisible(true);
            this.dispose();
        }else JOptionPane.showMessageDialog(this,"Error en usuario o contraseña","Error",0);
    }
    
    private void exit(){
        System.exit(0);
    }
    
    private void placeHolders(){
        TextPrompt field1 =new TextPrompt("Usuario",fldUser);
        TextPrompt field2 =new TextPrompt("Password",fldPass);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }
    
    private int xpos,ypos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField fldPass;
    private javax.swing.JTextField fldUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBtnEnter;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JSeparator spr1;
    private javax.swing.JSeparator spr2;
    // End of variables declaration//GEN-END:variables
}

class Teclado extends KeyAdapter{
        public void keyPressed (KeyEvent tecla){
        presionada=tecla.getKeyCode();
            System.out.println(presionada);
        if(presionada== KeyEvent.VK_ESCAPE){
            System.exit(0);
        }else if(tecla.isControlDown()&&presionada==KeyEvent.VK_H){
            JOptionPane.showMessageDialog(null,"Lo sentimos. Sin usuario y/o contraseña deberás ponerte en contanto con el administrador del sistema"); 
        }else{
                       
        }
        
    }
        static int presionada;
    
    }