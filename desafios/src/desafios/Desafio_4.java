package desafios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio_4 {
    public static void main(String[] args) throws IOException {
        String linha;
        Double n;
        int Pos, i;
        Pos=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (i=0;i<6;i++) {
            System.out.println("Digite um valor para entrada");
            linha = br.readLine();
            n = Double.parseDouble(linha);
            if(n>0)Pos++;
        }

        System.out.println("" + Pos + " valores positivos");
    }
}

