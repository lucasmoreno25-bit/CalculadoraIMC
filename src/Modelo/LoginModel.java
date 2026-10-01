package Modelo;

/**
 *
 * @author Lucas Moreno Bravo
 */
public class LoginModel {

    public float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    public String resultado(float imc) {
        if (imc < 18.5) {
            System.out.print("Bajo Peso");
        }
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        }
        if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        if (imc >= 30) {
            System.out.println("Obesidad");
        }
    }
}

