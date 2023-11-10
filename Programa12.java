import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int[] num = new int[5];
        int soma = 0;

        System.out.print("\n| Sistema de Soma |\n");

        for(int i = 0; i < num.length; i++){
            System.out.print("\nDigite o "+ (i + 1) +"º Número: ");
            num[i] = ent.nextInt();
            soma += num[i];
        }

        System.out.print("\nOs Números Digitados Foram: ");

        for(int i = 0; i < num.length; i++){
            if(i == 4){
                System.out.print(num[i] +" = "+ soma);
                break;
            }
            System.out.print(num[i] +" + ");
        }
    }
}
