package Controlador;

import Modelo.LoginModel;
import Vista.LoginVista;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginControl {
    
    private final LoginVista vista;
    private final LoginModel modelo = new LoginModel();

    public LoginControl(LoginVista vista) {
        this.vista = vista;
        this.vista.getBtnCalcular().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
    }

    private void calcularIMC() {
        try {
            String txtPeso = vista.getTxtPeso().getText().replace(",", ".");
            String txtAltura = vista.getTxtAltura().getText().replace(",", ".");
            
            double peso = Double.parseDouble(txtPeso);
            double altura = Double.parseDouble(txtAltura);
            
            double imc = modelo.calcularIMC(peso, altura);
            String clasificacion = modelo.clasificar(imc);
            
            vista.getLblIMC().setText(String.format("Tu IMC es: %.2f", imc));
            vista.getLblResultado().setText("Clasificación: " + clasificacion);
            
            switch (clasificacion) {
                case "Peso Normal":
                    vista.getLblResultado().setForeground(Color.GREEN);
                    break;
                case "Bajo Peso":
                case "Sobrepeso":
                    vista.getLblResultado().setForeground(Color.ORANGE);
                    break;
                case "Obesidad":
                    vista.getLblResultado().setForeground(Color.RED);
                    break;
            }
        } catch (NumberFormatException ex) {
            vista.getLblResultado().setText("Error: Introduce solo números válidos");
            vista.getLblResultado().setForeground(Color.RED);
            vista.getLblIMC().setText("Tu IMC es: --");
        }
    }
}