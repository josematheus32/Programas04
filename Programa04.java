import java.util.Random;
import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] num = new int[15];
        int vetor = 0, qtd30 = 0;

        System.out.print("\n| Sistema para Identificar o Número 30 |\n");

        for(int i = 0; i < num.length; i++){
            num[i] = aleatorio.nextInt(100);
            System.out.print("\nO "+ (i + 1) +"º Número Gerado: "+ num[i]);
            if(num[i] == 30){
                qtd30++;
            }
        }

        if(qtd30 == 0){
            System.out.print("\n\nNão Existem Números Iguais a 30!");
            System.exit(0);
        }

        System.out.println();

        for(int i = 0; i < num.length; i++){
            if(num[i] == 30){
                System.out.print("\n30 Está no Vetor "+ vetor +"!");
                vetor++;
            } else if(num[i] != 30) {
                vetor++;
            }
        }

        ent.close();
    }
}
