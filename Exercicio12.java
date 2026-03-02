package dobackofront;
import java.util.Scanner;
// Exercicio 12 Camila Aki 
public class Exercicio12 {
public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("Digite um numero:");
    double numero = entrada.nextDouble();
    double quadrado= Math.pow(numero,2);
    System.out.println("Numero ao quadrado:"+quadrado);
    double cubo= Math.pow(numero,3);
    System.out.println("Numero ao cubo:"+cubo);
    double raiz= Math.sqrt(numero);
    System.out.println("Riaz quadrada:"+raiz);
    double potencia10=Math.pow(numero,10);
    System.out.println("Numero elevado a potencia 10:"+potencia10);
    entrada.close();


    }
}
