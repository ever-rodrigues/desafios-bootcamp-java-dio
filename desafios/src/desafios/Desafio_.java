package desafios;

import java.util.Scanner;

public class Desafio_ {
    public static void main(String[] args) {
        System.out.println("Programa que retorna qual a cor do tabuleiro de xadres, recebendo linha 'L' e coluna 'C'");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor pra L");
        int L=sc.nextInt();
        System.out.println("Digite o valor pra C");
        int C=sc.nextInt();

        if(L%2==0 && C%2==0){
            System.out.println("Preto");
        }
        else if(L%2!=0 && C%2!=0){
            System.out.println("Preto");
        }
        else if(L%2==0 && C%2!=0){
            System.out.println("Branco");
        }
        else if(L%2!=0 && C%2==0){
            System.out.println("Branco");
        }
    }
}
