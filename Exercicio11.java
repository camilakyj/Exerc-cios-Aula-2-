package dobackofront;
import java.util.Scanner;
// Exercicio 11 Camila AKi

public class Exercicio11 {
public static void main(String[] args) {
    System.out.println("Digite o ano de nascimento");
    Scanner entrada= new Scanner(System.in);
    int anoNascimento= entrada.nextInt();
    System.out.println("Digite o ano atual");
    int anoAtual= entrada.nextInt();

    int idade = anoAtual-anoNascimento;
    System.out.println("Idade atual:"+idade);
    int idade2030= 2030-anoNascimento;
    System.out.println("Idade em 2030:"+idade2030);
    entrada.close();




    }
}
