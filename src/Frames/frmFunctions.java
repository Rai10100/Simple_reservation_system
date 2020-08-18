package Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JToggleButton;


public class frmFunctions extends javax.swing.JFrame {

    public frmFunctions() {
        initComponents();
        
        this.setMinimumSize(dim);
        setSize(dim);
        
        
        Image principalIco=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/popcornIco.png"));
        setIconImage(principalIco);
        setTitle("RaíCinema");
        setLocationRelativeTo(null);
        buttonGenerator();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackg = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        pnlFunctions = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFunctions = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSchedule = new javax.swing.JList<>();
        lblCheck = new javax.swing.JLabel();
        pnlConfirm = new javax.swing.JPanel();
        lblCost = new javax.swing.JLabel();
        lblCostAns = new javax.swing.JLabel();
        lblMovie = new javax.swing.JLabel();
        lblMovieAns = new javax.swing.JLabel();
        lblSchedule = new javax.swing.JLabel();
        lblScheduleAns = new javax.swing.JLabel();
        lblReserve = new javax.swing.JLabel();
        pnlSeats = new javax.swing.JPanel();
        lblScreen = new javax.swing.JLabel();
        pnlSeats2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(893, 575));
        setMinimumSize(new java.awt.Dimension(893, 575));
        setSize(new java.awt.Dimension(893, 575));

        pnlBackg.setBackground(new java.awt.Color(39, 122, 241));
        pnlBackg.setMinimumSize(new java.awt.Dimension(947, 608));

        lblTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoCinema.png"))); // NOI18N

        lblInstructions1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblInstructions1.setForeground(new java.awt.Color(74, 44, 226));
        lblInstructions1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions1.setText("<html>Por favor seleccione primero una función, un horario y pulse el botón para ver la disponibilidad de la sala</html>");

        pnlFunctions.setBackground(new java.awt.Color(39, 122, 241));
        pnlFunctions.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 44, 226), 2, true), "Funciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(74, 44, 226))); // NOI18N

        lstFunctions.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "The Matrix", "Pulp Fiction", "Casablanca", "Back to the Future", "El padrino", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstFunctions);

        lstSchedule.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12:00" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstSchedule.setMaximumSize(new java.awt.Dimension(33, 77777));
        lstSchedule.setPreferredSize(new java.awt.Dimension(33, 200));
        jScrollPane2.setViewportView(lstSchedule);

        lblCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/roomIco.png"))); // NOI18N
        lblCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCheckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCheckMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlFunctionsLayout = new javax.swing.GroupLayout(pnlFunctions);
        pnlFunctions.setLayout(pnlFunctionsLayout);
        pnlFunctionsLayout.setHorizontalGroup(
            pnlFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFunctionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCheck)
                .addGap(10, 10, 10))
        );
        pnlFunctionsLayout.setVerticalGroup(
            pnlFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFunctionsLayout.createSequentialGroup()
                .addGroup(pnlFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pnlConfirm.setBackground(new java.awt.Color(34, 122, 241));
        pnlConfirm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 44, 226), 2, true), "Confirmación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(74, 44, 226))); // NOI18N
        pnlConfirm.setMaximumSize(new java.awt.Dimension(230, 32767));

        lblCost.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCost.setText("COSTO ACTUAL:");

        lblCostAns.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCostAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostAns.setText("$00");

        lblMovie.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovie.setText("PELÍCULA:");

        lblMovieAns.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMovieAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovieAns.setText("N/A");

        lblSchedule.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSchedule.setText("HORARIO:");

        lblScheduleAns.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblScheduleAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScheduleAns.setText("N/A");

        lblReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reserveIco.png"))); // NOI18N
        lblReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReserveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReserveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlConfirmLayout = new javax.swing.GroupLayout(pnlConfirm);
        pnlConfirm.setLayout(pnlConfirmLayout);
        pnlConfirmLayout.setHorizontalGroup(
            pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMovie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMovieAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCostAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(lblScheduleAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConfirmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblReserve)
                .addGap(18, 18, 18))
        );
        pnlConfirmLayout.setVerticalGroup(
            pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMovie)
                .addGap(33, 33, 33)
                .addComponent(lblMovieAns)
                .addGap(29, 29, 29)
                .addComponent(lblSchedule)
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(lblScheduleAns)
                .addGap(30, 30, 30)
                .addComponent(lblCost)
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(lblCostAns)
                .addGap(35, 35, 35)
                .addComponent(lblReserve)
                .addGap(49, 49, 49))
        );

        pnlSeats.setBackground(new java.awt.Color(39, 122, 241));
        pnlSeats.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 44, 226), 2, true), "Asientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 19), new java.awt.Color(74, 44, 226))); // NOI18N

        lblScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/screenIco.png"))); // NOI18N

        pnlSeats2.setBackground(new java.awt.Color(39, 122, 241));
        pnlSeats2.setLayout(new java.awt.GridLayout(5, 6, 6, 15));

        javax.swing.GroupLayout pnlSeatsLayout = new javax.swing.GroupLayout(pnlSeats);
        pnlSeats.setLayout(pnlSeatsLayout);
        pnlSeatsLayout.setHorizontalGroup(
            pnlSeatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSeatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSeatsLayout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(lblScreen)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(pnlSeats2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSeatsLayout.setVerticalGroup(
            pnlSeatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSeatsLayout.createSequentialGroup()
                .addComponent(pnlSeats2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblScreen))
        );

        javax.swing.GroupLayout pnlBackgLayout = new javax.swing.GroupLayout(pnlBackg);
        pnlBackg.setLayout(pnlBackgLayout);
        pnlBackgLayout.setHorizontalGroup(
            pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addComponent(lblTitle1)
                .addGap(18, 18, 18)
                .addComponent(lblInstructions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        pnlBackgLayout.setVerticalGroup(
            pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addComponent(pnlFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseClicked
        Connect connect=new Connect();
        connect.showGate();
    }//GEN-LAST:event_lblCheckMouseClicked

    private void lblCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseEntered
        lblCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/roomIcoDark.png")));
    }//GEN-LAST:event_lblCheckMouseEntered

    private void lblCheckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseExited
        lblCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/roomIco.png")));
    }//GEN-LAST:event_lblCheckMouseExited

    private void lblReserveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReserveMouseEntered
        lblReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reserveIcoDark.png")));
    }//GEN-LAST:event_lblReserveMouseEntered

    private void lblReserveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReserveMouseExited
        lblReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reserveIco.png")));
    }//GEN-LAST:event_lblReserveMouseExited
    
    public void buttonGenerator(){
        int seatCounter=1;
        buttonsArray=new ArrayList<>();
        Button button;
        for(int i=1;i<totalButtons;i++){
               if((seatCounter!=25)&&(seatCounter!=30)){
                   button= new Button(i);
                   
                   pnlSeats2.add(button);
                   buttonsArray.add(button);
               }
               
               else {
                   pnlSeats2.add(new javax.swing.JLabel(""));
               }
                seatCounter++;
        }
    }
    
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                frmLogin.main(args);
                new frmFunctions().setVisible(true);
            }
        });
    }
   
    class Button extends JToggleButton{
        Action action=new Action();
        public Button(int id){
            this.id=id;
            this.setFont(new java.awt.Font("Arial",Font.BOLD,13));
            this.setText("Asiento "+id);
            this.setBackground(new Color(29, 174, 51));
            this.setForeground(new Color(29, 114, 51));
            //this.setBorderPainted(false);
            this.setFocusPainted(false);
            this.addActionListener(action);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    
    private int id;
    }
    
    public class Action implements java.awt.event.ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for(Button btn: buttonsArray){
                if (e.getSource().equals(btn)){
                    if (btn.isSelected()) {
                         btn.setForeground(Color.blue);
                         btn.setBackground(new Color(39,122,241));
                         btn.setText("Reservado");
                         connect=new Connect();
                         connect.reserve(btn.getId());
                    }
                    else{
                        btn.setBackground(new Color(29, 174, 51));
                        
                        btn.setForeground(new Color(29, 114, 51));
                        btn.setText("Asiento "+btn.getId());
                        System.out.println(btn.getBackground());
                        connect.liberate(btn.getId());
                    }
                    
                }
            }
        }
        
    }
//    private java.awt.Dimension dim=new java.awt.Dimension(/*947*/1000, 650/*608*/);
    private java.awt.Dimension dim=new java.awt.Dimension(967, 648);
    private Connect connect;
    private ArrayList<Button> buttonsArray;
    private final int totalButtons=29;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostAns;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JLabel lblMovieAns;
    private javax.swing.JLabel lblReserve;
    private javax.swing.JLabel lblSchedule;
    private javax.swing.JLabel lblScheduleAns;
    private javax.swing.JLabel lblScreen;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JList<String> lstFunctions;
    private javax.swing.JList<String> lstSchedule;
    private javax.swing.JPanel pnlBackg;
    private javax.swing.JPanel pnlConfirm;
    private javax.swing.JPanel pnlFunctions;
    private javax.swing.JPanel pnlSeats;
    private javax.swing.JPanel pnlSeats2;
    // End of variables declaration//GEN-END:variables


    
    public class Connect {
        public Connect(){
//            try {
//                Connection myConn=DriverManager.getConnection(link, user, pass);
//                String sentence="SELECT * FROM the_matrix WHERE seat=? ";
//                PreparedStatement myPst=myConn.prepareStatement(sentence);
//                myPst.setString(1,"30");
//                myPst.setString(2, "no");
//                ResultSet myRs=myPst.executeQuery();
//                while(myRs.next()){
//                    System.out.println(myRs.getString(1)+myRs.getString(2)+myRs.getString(3));
//                }
//                myRs.close();
//                myConn.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
//                }
        }
//        public  Connection connect(){
//             myConn=null;
//            try {
//               myConn= DriverManager.getConnection(link, user, pass);
//                System.out.println("Conexión establecida");
//                
//            }catch(SQLException ex){
//                
//            }
//            return myConn;
//        } 
        
        
        public void showGate(){
        
        }
        
        public void reserve(int seat){
            try {
               myConn= DriverManager.getConnection(link, user, pass);
                System.out.println("Conexión establecida");
               String query="UPDATE back_to_the_future SET reserved='si' WHERE seat="+seat;
            myPS= myConn.prepareStatement(query);
            int x=myPS.executeUpdate();
            if(x>0) System.out.println("se actualizó");
            else System.out.println("Hubo un error al actualizar");
                
            }catch(SQLException ex){
                
            }finally{
                try {
                    myConn.close();
                    myPS.close();
                    System.out.println("Conexion y Consulta cerrados");
                } catch (SQLException ex) {
                    Logger.getLogger(frmFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
        public void liberate(int seat){
            try {
               myConn= DriverManager.getConnection(link, user, pass);
                System.out.println("Conexión establecida");
               String query="UPDATE back_to_the_future SET reserved='no' WHERE seat="+seat;
            myPS= myConn.prepareStatement(query);
            int x=myPS.executeUpdate();
            if(x>0) System.out.println("se actualizó");
            else System.out.println("Hubo un error al actualizar");
                
            }catch(SQLException ex){
                
            }finally{
                try {
                    myConn.close();
                    myPS.close();
                    System.out.println("Conexion y Consulta cerrados");
                } catch (SQLException ex) {
                    Logger.getLogger(frmFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
        
        private PreparedStatement myPS;
        private Connection myConn;
        String user="ChecoDB", pass="ChecoReyes23", link="jdbc:mysql://localhost:3307/cinema";
    }
    
}
