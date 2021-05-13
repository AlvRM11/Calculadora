import java.util.Scanner;

public class Calculadora {

    private double num1;
    private double num2;

    public Calculadora(){}

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double SumayResta(double num1, double num2){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el signo '+' para sumar o el signo '-' para restar");

        char signo = sc.next().charAt(0);

        double resultado;

        switch(signo){
            case '+': 
            resultado = num1 + num2;
            break;

            case '-':
            resultado = num1 - num2;
            break;

            default:
            resultado = num1 + num2;
            break;
        }
        sc.close();
        return (resultado);
    }

    public double Multiplicacion(double num1, double num2){
        double resultadoMulti = num1 * num2;
        return resultadoMulti;
    }

    public double Division(double num1, double num2){
        double resultadoDiv = num1 / num2;
        return resultadoDiv;
    }

    public double VAbsoluto(double num1){
        if(num1 < 0){
            return num1*(-1);
        }
        else{
            return num1;
        }
    }

    public double ElevarNum(double num1){

        return Math.pow(num1, num1);
    }

    public boolean EsPositivo(double num1){
        if(num1 >= 0){
            return true;
        }
        return false;
    }
}
