package desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio_7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double V, D, R, area, altura;
        while (leitor.hasNext()) {
            V = leitor.nextDouble();//VOLUME
            D = leitor.nextDouble();//DIAMETRO
            R = D / 2;
            area = 3.14* (R*R);
            altura = V /area;
            System.out.println("ALTURA = " + df.format(altura));
            System.out.println("AREA = " + df.format(area));
        }
    }
}