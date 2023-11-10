import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Programa09 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#.##");
        Random aleatorio = new Random();

        int tam = 10;

        String[] prodnome = new String[tam];
        int[] codprod = new int[tam];
        int[] precoprod = new int[tam];

        System.out.print("\n===| Sistema de Produtos |===\n");

        for (int i = 0; i < tam; i++) {
            codprod[i] = aleatorio.nextInt(900) + 1;
            precoprod[i] = aleatorio.nextInt(5000)+1;

            System.out.print("\nDigite o Nome do Produto: ");
            prodnome[i] = ent.nextLine();
        }

        System.out.println();

        System.out.print("\n==| Produtos e os Seus Respectivos Preços |==\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\n"+ prodnome[i] +": R$ "+ precoprod[i] +"; (Código: "+ codprod[i] +");\n");
        }

        System.out.println();

        System.out.print("\n==| Relatório dos Produtos |==\n");

        for (int i = 0; i < tam; i++) {
            if (codprod[i] % 2 == 0 && precoprod[i] > 1000) {
                System.out.print("\nProduto (" + prodnome[i] + "); Preço Antigo: R$ " + precoprod[i] + "; O Novo Preço: R$ " + deci.format(precoprod[i] * 1.20) +"\n");
            } else if (codprod[i] % 2 == 0 && precoprod[i] < 1000) {
                System.out.print("\nProduto (" + prodnome[i] + "); Preço Antigo: R$ " + precoprod[i] + "; O Novo Preço: R$ " + deci.format(precoprod[i] * 1.15) +"\n");
            } else if (codprod[i] % 2 != 0 && precoprod[i] > 1000) {
                System.out.print("\nProduto (" + prodnome[i] + "); Preço Antigo: R$ " + precoprod[i] + "; O Novo Preço: R$ " + deci.format(precoprod[i] * 1.10) +"\n");
            }
        }

        ent.close();
    }
}
