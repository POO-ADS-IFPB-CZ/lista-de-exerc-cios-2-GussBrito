import java.util.Scanner;

public class main {
    public static double fatorial(double numero){
        if(numero == 0) return 1;
        if(numero == 1) return 1;
        else return numero * fatorial(numero-1);
    }
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = entrada.nextDouble();
        System.out.println("Fatorial:"+fatorial(numero));
    }
}
