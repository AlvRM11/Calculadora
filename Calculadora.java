import java.util.Scanner;

public class Calculadora {

    private double num1;
    private double num2;

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void SumayResta(double num1, double num2){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el signo '+' para sumar o el signo '-' para restar");
        System.out.println("Introduzca cualquier otro signo para hacer ambas acciones");

        char signo = sc.next().charAt(0);

        switch(signo){
            case '+': 
            double resultadoSuma = num1 + num2;
            System.out.println(+num1+" + "+num2+" = "+resultadoSuma);
            break;

            case '-':
            double resultadoResta = num1 - num2;
            System.out.println(+num1+" - "+num2+" = "+resultadoResta);
            break;

            default:
            resultadoSuma = num1 + num2;
            System.out.println(+num1+" + "+num2+" = "+resultadoSuma);

            resultadoResta = num1 - num2;
            System.out.println(+num1+" - "+num2+" = "+resultadoResta);
            break;
        }
        sc.close();
    }

    public void Multiplicacion(double num1, double num2){
        double resultadoMulti = num1 * num2;
        System.out.println(+num1+" * "+num2+" = "+resultadoMulti);
    }

    public void Division(double num1, double num2){
        double resultadoDiv = num1 / num2;
        System.out.println(+num1+" / "+num2+" = "+resultadoDiv);
    }

    public void VAbsoluto(double num1){
        if(num1 < 0){
            System.out.println("El Valor Absoluto de "+num1+" es "+num1*(-1));
        }
        else{
            System.out.println("El Valor Absoluto de "+num1+" es "+num1);
        }
    }

    public void ElevarNum(double num1){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un exponente:");
        double exponente = sc.nextDouble();

        System.out.println(num1+" ** "+exponente+" = "+Math.pow(num1, exponente));
        sc.close();
    }

    public boolean EsPositivo(double num1){
        if(num1 >= 0){
            return true;
        }
        return false;
    }
}
