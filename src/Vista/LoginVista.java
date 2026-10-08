package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginVista extends javax.swing.JPanel {

    public LoginVista() {
        initComponents();
    }

    // Getters para que el controlador pueda acceder
    public JTextField getTxtPeso() {
        return peso;
    }

    public JTextField getTxtAltura() {
        return altura;
    }

    public JButton getBtnCalcular() {
        return calculaBtn;
    }

    public JLabel getLblIMC() {
        return lblIMC;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    // Métodos para mostrar resultados
    public void mostrarIMC(double imc) {
        lblIMC.setText("IMC: " + String.format("%.2f", imc));
    }

    public void mostrarResultado(String resultado) {
        lblResultado.setText("Resultado: " + resultado);
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        calculaBtn = new javax.swing.JButton();
        lblIMC = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("CalculadoraIMC");

        jLabel2.setText("Peso (Kg):");

        peso.setText("   ");
        peso.addActionListener(this::pesoActionPerformed);

        jLabel3.setText("Altura (m):");

        calculaBtn.setText("CALCULAR");
        calculaBtn.addActionListener(this::calculaBtnActionPerformed);

        lblIMC.setText("IMC : ");

        lblResultado.setText("Resultado :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(peso)
                                .addComponent(altura))
                            .addComponent(lblResultado)
                            .addComponent(lblIMC))
                        .addGap(64, 64, 64)
                        .addComponent(calculaBtn)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(calculaBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblIMC)
                .addGap(28, 28, 28)
                .addComponent(lblResultado)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void calculaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JButton calculaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField peso;
    // End of variables declaration//GEN-END:variables
}
