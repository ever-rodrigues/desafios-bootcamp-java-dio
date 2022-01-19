package desafios;
import java.io.IOException;
import java.util.Scanner;
public class Desafio_2 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor para N");
        int N = leitor.nextInt();
        if(N<10000){
            for (int i=1;i<10000;i++) {
                if (i%N==2){
                    System.out.println(i);
                }
            }
        }

    }
}
