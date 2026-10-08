
/**
 *
 * @author Lucas Moreno Bravo
 */

import Controlador.LoginControl;
import Vista.LoginVista;
import javax.swing.JFrame;

public class CalculadoraIMC {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // 1. Crear el marco de la ventana
                JFrame frame = new JFrame("Calculadora de IMC");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // 2. Instanciar la vista (tu JPanel)
                LoginVista vista = new LoginVista();
                
                // 3. Añadir el panel a la ventana
                frame.add(vista);
                frame.pack(); // Ajusta el tamaño de la ventana al contenido
                frame.setLocationRelativeTo(null); // Centrar en la pantalla
                frame.setVisible(true); // Mostrar ventana
                
                // 4. Arrancar el controlador
                LoginControl controlador = new LoginControl(vista);
            }
        });
    }
}