package desafios;

import java.io.IOException;
import java.util.Scanner;

public class Problem {
//complete os espaços em branco com uma solução possível

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //Numero de Instancias
        //B<=100 e 0<=B
        int T = leitor.nextInt();//INSTANCIAS
        int B, A1, D1, L1, A2, D2, L2, V1, V2;
        for (int i = 0; i < T; i++) {
            B = leitor.nextInt(); //BONUS
            A1 = leitor.nextInt();//ATAQUE
            D1 = leitor.nextInt();//DEFESA
            L1 = leitor.nextInt();//LEVEL

            A2 = leitor.nextInt();//ATAQUE
            D2 = leitor.nextInt();//DEFESA
            L2 = leitor.nextInt();//LEVEL

            V1 = (((A1+D1)/2)+(L1%2==0 ? B:0));
            V2 = (((A2+D2)/2)+(L2%2==0 ? B:0));

            if (V1>V2) System.out.println("Bruno");
            else if (V2>V1) System.out.println("Guarte");
            else System.out.println("Empate");
        }
    }

}