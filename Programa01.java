import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int[] num = new int[6];
        int qtdpar = 0, qtdimpar = 0;

        System.out.print("\n| Sistema de Números Pares e Ímpares |\n\n");

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° Número Inteiro: ");
            num[i] = ent.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print("\n" + num[i] + " é Par!");
                qtdpar++;
            } else {
                System.out.print("\n" + num[i] + " é Ímpar!");
                qtdimpar++;
            }
        }

        System.out.print("\n\nA Quantidade de Números Pares é: " + qtdpar);
        System.out.print("\nA Quantidade de Números Ímpares é: " + qtdimpar);

        ent.close();
    }
}