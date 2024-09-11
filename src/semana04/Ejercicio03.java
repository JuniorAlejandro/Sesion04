package semana04;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número (1-6): ");
        int numero = sc.nextInt();

        String ingles;
        switch (numero) {
            case 1:
                ingles = "one";
                break;
            case 2:
                ingles = "two";
                break;
            case 3:
                ingles = "three";
                break;
            case 4:
                ingles = "four";
                break;
            case 5:
                ingles = "five";
                break;
            case 6:
                ingles = "six";
                break;
            default:
                ingles = "Número fuera de rango";
        }

        System.out.println("Número en inglés: " + ingles);
    }
}
