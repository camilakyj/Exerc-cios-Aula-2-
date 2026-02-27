// Exercicio 3 Aula 2

package dobackofront;

import java.util.Scanner;
public class Exercicio3Aula2 {
    public static void main(String[]args){
       Scanner entrada= new Scanner(System.in);
       System.out.println("Digite o primeiro numero inteiro");
       int num1= entrada.nextInt();
       System.out.println("Digite o segundo numero inteiro");
       int num2= entrada.nextInt();
       int produto = num1*num2;
       System.out.println("O produto dos números é" +produto);


    }

}

