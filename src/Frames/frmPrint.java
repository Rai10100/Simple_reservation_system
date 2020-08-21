package Frames;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class frmPrint extends javax.swing.JFrame implements Printable{ //Printable es la interfaz que debe incluir la clase que quiera imprimir

    public frmPrint(String fx, String hr, String cs) {
        initComponents();
        this.fx=fx;  //Estas variables se piden en el contructor para generar "boleto" adecuado para cada película.
        this.hr=hr;
        this.cs=cs;
        fill();
        try{
            PrinterJob g=PrinterJob.getPrinterJob();  //Se inicializa el objeto PrinterJob, que es el qu ese encarga de imprimir
            g.setPrintable(this); //Renderiza el objeto, en este caso el jFrame 
//          g.printDialog();
            g.print();   //Y lo imprime...
        }catch(PrinterException e){
            System.out.println("Error al imprimir: "+e);
        }
    }
    
    public void fill(){
        lblFunctionAns.setText(fx);
        lblHourAns.setText(hr);
        lblCostAns.setText(cs);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrint = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblFunction = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblFunctionAns = new javax.swing.JLabel();
        lblCostAns = new javax.swing.JLabel();
        lblHourAns = new javax.swing.JLabel();
        lblQr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrint.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrint.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoCinema.png"))); // NOI18N

        lblFunction.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFunction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFunction.setText("FUNCIÓN");

        lblHour.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHour.setText("HORA");

        lblCost.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCost.setText("COSTO");

        lblFunctionAns.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblFunctionAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFunctionAns.setText("null");

        lblCostAns.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblCostAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostAns.setText("null");

        lblHourAns.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblHourAns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHourAns.setText("null");

        lblQr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qrIco.png"))); // NOI18N

        javax.swing.GroupLayout pnlPrintLayout = new javax.swing.GroupLayout(pnlPrint);
        pnlPrint.setLayout(pnlPrintLayout);
        pnlPrintLayout.setHorizontalGroup(
            pnlPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrintLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrintLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblFunction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFunctionAns, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHourAns, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCostAns, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPrintLayout.setVerticalGroup(
            pnlPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrintLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addComponent(lblFunction)
                .addGap(27, 27, 27)
                .addComponent(lblFunctionAns)
                .addGap(18, 18, 18)
                .addComponent(lblHour)
                .addGap(18, 18, 18)
                .addComponent(lblHourAns, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCostAns, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblQr)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final long serialVersionUID = 1L;
    private String fx="null",hr="null",cs="null";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostAns;
    private javax.swing.JLabel lblFunction;
    private javax.swing.JLabel lblFunctionAns;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblHourAns;
    private javax.swing.JLabel lblQr;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlPrint;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if(pageIndex>0) return NO_SUCH_PAGE;
        else{
            Graphics2D ar=(Graphics2D) graphics;  //Objeto Graphics2D para ocuparlo abajo e imprimir el JFrame
            ar.translate(pageFormat.getImageableX(), pageFormat.getImageableY());//Concatena con el punto superior izquierdo x & y para que sea el origen de la impresión
            ar.scale(.7, .7);  //Para imprimir al 70% del tamaño original
            pnlPrint.printAll(ar);
            return PAGE_EXISTS;
        }
    }
}
