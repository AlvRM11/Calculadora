import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un primer número");
        double num1 = sc.nextDouble();

        System.out.println("Introduzca un segundo número");
        double num2 = sc.nextDouble();

        Calculadora calculadora = new Calculadora(num1, num2);

        System.out.println("Introduzca un número para realizar una operación:");
        System.out.println("1 - Suma y Resta");
        System.out.println("2 - Multiplicación");
        System.out.println("3 - División");
        System.out.println("4 - Valor Absoluto");
        System.out.println("5 - Exponente");
        System.out.println("6 - Comprobar Positivo");

        int selector = sc.nextInt();

        switch(selector){
            case 1:
            calculadora.SumayResta(num1, num2);
            break;

            case 2:
            calculadora.Multiplicacion(num1, num2);
            break;

            case 3:
            calculadora.Division(num1, num2);
            break;

            case 4:
            calculadora.VAbsoluto(num1);
            break;

            case 5:
            calculadora.ElevarNum(num1);
            break;

            case 6:
            calculadora.EsPositivo(num1);
            break;
            
            default:
            break;
        }
        sc.close();
    }
}
