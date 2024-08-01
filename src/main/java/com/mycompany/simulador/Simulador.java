package com.mycompany.simulador;
import clases.PrestamoPersonal;
import clases.Cronograma;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;


public class Simulador extends javax.swing.JFrame {
   ReporteCronograma rc = new ReporteCronograma();
   PrestamoPersonal pp = new PrestamoPersonal();
   Cronograma c = new Cronograma();
   private double monto;
   private int meses;
   private String interesAnual;
   private String diaPago;
   private String tipoEnvio;
   private int ncouta;
   private double seguro;
   

    public Simulador() {
        initComponents();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        Txtitulo = new javax.swing.JLabel();
        Txtmonto = new javax.swing.JLabel();
        Txtplazo = new javax.swing.JLabel();
        Boxmonto = new javax.swing.JTextField();
        Boxplazo = new javax.swing.JTextField();
        Boxtea = new javax.swing.JComboBox<>();
        Boxenvio = new javax.swing.JComboBox<>();
        Boxpago = new javax.swing.JComboBox<>();
        Txttea = new javax.swing.JLabel();
        Txtpago = new javax.swing.JLabel();
        Txtenvio = new javax.swing.JLabel();
        Btnsimular = new javax.swing.JButton();
        Txtnota = new javax.swing.JLabel();
        Boxmoneda = new javax.swing.JTextField();
        Txtmonto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de simulador");

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        Fondo.setBackground(new java.awt.Color(238, 241, 246));
        Fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 15, true));
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Txtitulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        Txtitulo.setForeground(new java.awt.Color(51, 0, 255));
        Txtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txtitulo.setText("<html>Simulador de préstamos personales de Caja Huancayo<html>");
        Txtitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Txtitulo.setMaximumSize(new java.awt.Dimension(461, 25));
        Txtitulo.setPreferredSize(new java.awt.Dimension(461, 25));

        Txtmonto.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Txtmonto.setText("Monto del préstamo:");

        Txtplazo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Txtplazo.setText("Plazo en meses:");

        Boxmonto.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxmonto.setSelectionColor(new java.awt.Color(51, 51, 255));

        Boxplazo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N

        Boxtea.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxtea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"16%", "18%", "20%", "22%"}));

        Boxenvio.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxenvio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Físico", "Virtual" }));

        Boxpago.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxpago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "05 de cada mes", "15 de cada mes", "28 de cada mes" }));
        Boxpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxpagoActionPerformed(evt);
            }
        });

        Txttea.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Txttea.setText("TEA:");

        Txtpago.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Txtpago.setText("Día de pago:");

        Txtenvio.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Txtenvio.setText("Método de envío:");

        Btnsimular.setBackground(new java.awt.Color(51, 0, 255));
        Btnsimular.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Btnsimular.setForeground(new java.awt.Color(255, 255, 255));
        Btnsimular.setText("Simular préstamo");
        Btnsimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsimularActionPerformed(evt);
            }
        });

        Txtnota.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Txtnota.setText("<html>Nota <p>- Monto de préstamo desde s/1000 hasta s/80000 <p>- Máximo plazo 48 meses<html>");

        Boxmoneda.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxmoneda.setText("SOLES");
        Boxmoneda.setEnabled(false);
        Boxmoneda.setSelectionColor(new java.awt.Color(51, 51, 255));

        Txtmonto1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Txtmonto1.setText("Moneda:");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txtnota, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txtplazo)
                                    .addComponent(Txtmonto)
                                    .addComponent(Txttea, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtmonto1))
                                .addGap(42, 42, 42)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Boxenvio, 0, 177, Short.MAX_VALUE)
                                    .addComponent(Boxpago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Boxtea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Boxplazo)
                                    .addComponent(Boxmoneda, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Boxmonto)))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(Btnsimular))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtmonto1)
                    .addComponent(Boxmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtmonto)
                    .addComponent(Boxmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boxplazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtplazo))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boxtea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txttea))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txtpago)
                    .addComponent(Boxpago, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boxenvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtenvio))
                .addGap(18, 18, 18)
                .addComponent(Btnsimular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txtnota, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsimularActionPerformed
       if (!validarEntradas()){
        return;
       }  
       guardaDatos();
       guardaCronograma();
    rc.setVisible(true);
    this.dispose();    
    }//GEN-LAST:event_BtnsimularActionPerformed

private boolean validarEntradas() {
    String entradaMonto = Boxmonto.getText();
    String entradaPlazo= Boxplazo.getText();
        if (pp.ingresoNumerico(entradaMonto,entradaPlazo)) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un número.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return false;
        }
        try {
            monto = Double.parseDouble(entradaMonto);
            if (pp.montoValido(monto)) {
                JOptionPane.showMessageDialog(this, "El monto debe estar entre s/.1,000 y s/.80,000", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
             meses = Integer.parseInt(entradaPlazo);
            if (pp.mesesValido(meses)) {
                JOptionPane.showMessageDialog(this, "El plazo debe ser entre 1 y 48 meses", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
           }
    return true;
} 
  
private void guardaDatos(){
        monto = Double.parseDouble(Boxmonto.getText());
        meses = Integer.parseInt(Boxplazo.getText());
        interesAnual = (String)Boxtea.getSelectedItem();
        diaPago = (String)Boxpago.getSelectedItem();
        tipoEnvio = (String)Boxenvio.getSelectedItem();
    pp.obtenerDatos( monto, meses, interesAnual,  diaPago,tipoEnvio, c, rc, seguro);     
}

 private void guardaCronograma() {
    DefaultTableModel model = (DefaultTableModel) rc.getTabla().getModel();
    model.setRowCount(0);

    String plazoText = Boxplazo.getText();
    ncouta = Integer.parseInt(plazoText);
    String montoText = Boxmonto.getText();
    monto = Double.parseDouble(montoText);
    String montoFormateado = String.format("%.2f", Double.parseDouble(montoText));
    String opcion = diaPago;
    int dia = 0;
           switch (opcion) {
               case "05 de cada mes":
                   dia = 5;
                   break;
               case "15 de cada mes":
                   dia = 15;
                   break;
               case "28 de cada mes":
                   dia = 28;
                   break;
               default:
                   break;
           }
    LocalDate fechaActual = LocalDate.now();
    int mesActual = fechaActual.getMonthValue();
    int anioActual = fechaActual.getYear();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Agregar nuevas filas basadas en el plazo ingresado
        for (int i = 1; i <= ncouta; i++) {    
            String fechaFormateada = c.calcularFechaVcto( mesActual, anioActual, i,  dia).format(formatter);
            Object SaldoInicial = (i == 1) ? montoFormateado : c.calcularSaldoInicial(i, model); // 1 monto sino variable valoranterior
        double monto1 = Double.parseDouble(montoFormateado);        
        double seguroPor = Double.parseDouble(rc.valorSegDesgrav());      
        double interesTotal = c.calcularInteresesTotales(interesAnual, seguroPor);
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        
        double couta = c.calcularCuota(monto1, interesTotal,  ncouta);
        double envio = Double.parseDouble(rc.getValorEnvio());
        double coutaFinal = c.calcularCoutaTotal(couta, envio);
        String coutaTotalFormateado = formato.format(coutaFinal);
        double saldoInicial = Double.parseDouble(SaldoInicial.toString());
        String saldoInicialFormateado = formato.format(saldoInicial);
        double interesesT = saldoInicial * interesTotal;
        String interesesTotalesFormateado = formato.format(interesesT);
        double amortizacion = c.calcularAmortizacion(coutaFinal, interesesT,  envio);
        String amortizacionFormateado = formato.format(amortizacion);
        double saldofinal = c.calcularSaldoFinal(saldoInicial, amortizacion);
        String saldofinalFormateado = String.format("%.2f", saldofinal);
      
        rc.setCoutaTotal(coutaTotalFormateado);

        model.addRow(new Object[]{i, fechaFormateada, saldoInicialFormateado, interesesTotalesFormateado, amortizacionFormateado, saldofinalFormateado, envio, coutaTotalFormateado});
    }
    if (model.getRowCount() > 0) {
        model.setValueAt("0.00", model.getRowCount() - 1, 5);//ultimo valor sf sea 0
    }

 }

    private void BoxpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxpagoActionPerformed
         
    }//GEN-LAST:event_BoxpagoActionPerformed
        
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
            java.util.logging.Logger.getLogger(ReporteCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Boxenvio;
    private javax.swing.JTextField Boxmoneda;
    private javax.swing.JTextField Boxmonto;
    private javax.swing.JComboBox<String> Boxpago;
    private javax.swing.JTextField Boxplazo;
    private javax.swing.JComboBox<String> Boxtea;
    private javax.swing.JButton Btnsimular;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Txtenvio;
    private javax.swing.JLabel Txtitulo;
    private javax.swing.JLabel Txtmonto;
    private javax.swing.JLabel Txtmonto1;
    private javax.swing.JLabel Txtnota;
    private javax.swing.JLabel Txtpago;
    private javax.swing.JLabel Txtplazo;
    private javax.swing.JLabel Txttea;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}
