import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa16 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#.##");

        int tam = 5;
        String[] nomeprod = new String[tam];
        double[] precoprod = new double[tam];

        int qtdinf50 = 0, qtdsup100 = 0;
        double soma = 0;

        System.out.print("\n===| Supermercado Q |===\n");

        for (int i = 0; i < tam; i++){
            System.out.print("\nDigite o Nome do Produto: ");
            nomeprod[i] = ent.nextLine();

            System.out.print("\nDigite o Preço de ("+ nomeprod[i] +"): ");
            precoprod[i] = ent.nextDouble();
            ent.nextLine();
        }

        for(int i = 0; i < tam; i++){
            if(precoprod[i] < 50){
                qtdinf50++;
            } else if (precoprod[i] > 100){
                soma += precoprod[i];
                qtdsup100++;
            }
        }

        System.out.println();

        System.out.print("\nA Quantidade de Produtos com Preço Inferior a R$ 50,00: "+ qtdinf50);

        System.out.println();

        System.out.print("\n==| O Nome dos Produtos com Preço Entre R$ 50,00 e R$ 100,00 |==\n");

        for(int i = 0; i < tam; i++){
            if(precoprod[i] >= 50 && precoprod[i] <= 100) {
                System.out.print("\n" + nomeprod[i]);
            }
        }

        System.out.println();

        System.out.print("\nA Média dos Preços dos Produtos com Preço Superior a R$ 100,00: "+ deci.format(soma / qtdsup100));

        ent.close();
    }
}
