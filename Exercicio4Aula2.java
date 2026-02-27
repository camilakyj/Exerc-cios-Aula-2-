
package dobackofront;

import java.util.Scanner;
public class Exercicio4Aula2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o primeiro numero inteiro");
    int num1 = entrada.nextInt();
    System.out.println("Digite o segundo numero inteiro");
    int num2 = entrada.nextInt();
    System.out.println("Digite o terceiro numero inteiro");
    int num3 = entrada.nextInt();
    System.out.println("Digite o quarto numero inteiro");
    int num4 = entrada.nextInt();

    int soma = num1 + num2 + num3 + num4;
    System.out.println("Soma dos numeros" + soma);
    entrada.close();


}}


