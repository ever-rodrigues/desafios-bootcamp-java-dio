package desafios;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Desafio__ {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
//declare suas variaveis corretamente
        for(int i=0;i<5;i++){
            System.out.println("Digite o valor para o elemento a ser somado:");
            valores.add(leitor.nextInt());
        }
        int somaPar,somarImpar,somaPositivo,somaNegativo;
        somaPar=0;
        somarImpar=0;
        somaPositivo=0;
        somaNegativo=0;

//continue a solução
        for (Integer item:valores) {
            if(item%2==0)somaPar+=1;
            if(item%2!=0)somarImpar+=1;
            if(item>0)somaPositivo+=1;
            if(item<0)somaNegativo+=1;
        }
//insira suas variaveis corretamente
        System.out.println( somaPar+ " par(es)");
        System.out.println( somarImpar+ " impar(es)");
        System.out.println( somaPositivo+ " positivo(s)");
        System.out.println( somaNegativo+ " negativo(s)");
    }
}
