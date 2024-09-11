package semana04;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número (1-5): ");
        int numero = sc.nextInt();

        String palabra;
        switch (numero) {
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default:
                palabra = "Número fuera de rango";
        }

        System.out.println("Número ingresado: " + palabra);
    }
}
