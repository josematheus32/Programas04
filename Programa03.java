import java.util.Scanner;
import java.util.Random;

public class Programa03 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        Random aleatorio = new Random();

        int tam = 10;
        int[] codprod = new int[tam];
        int[] totalprod = new int[tam];

        int cliente = 0, codigo, existeprod = 0, qtdprod;

        System.out.print("\n===| Sistema de Controle de Estoque |===\n");

        for(int i = 0; i < tam; i++){
            codprod[i] = aleatorio.nextInt(800)+1;
            totalprod[i] = aleatorio.nextInt(300)+1;

        }

        do{
            System.out.print("\nDigite o Código do Cliente: ");
            cliente = ent.nextInt();

            if(cliente == 0){
                break;
            }

            System.out.println();

            System.out.print("==| Código dos Produtos |==\n\n");

            for(int i = 0; i < tam; i++){
                System.out.print("\nCódigo do "+ (i + 1) +"° Produto: "+ codprod[i]);
            }

            System.out.println();

            do {
                System.out.print("\nDigite o Código do Produto: ");
                codigo = ent.nextInt();

                for (int i = 0; i < tam; i++) {
                    if (codigo == codprod[i]) {
                        System.out.print("\n==| Total do Produto |==\n");

                        System.out.print("\nTotal do " + (i + 1) + "° Produto: " + totalprod[i]);
                        existeprod++;
                    }
                }

                if (existeprod == 0) {
                    System.out.print("\nCódigo Inexistente!");
                    System.out.println();
                }
            } while (existeprod == 0);

            existeprod = 0;

            System.out.println();

                System.out.print("\nDigite a Quantidade Desejada: ");
                qtdprod = ent.nextInt();

                for (int i = 0; i < tam; i++) {
                    if (codigo == codprod[i]) {
                        if (qtdprod > totalprod[i]) {
                            System.out.print("\nNão Temos Estoque Suficiente Dessa Mercadoria!");
                            System.out.println();
                        } else if (qtdprod < totalprod[i]) {
                            totalprod[i] -= qtdprod;
                            System.out.print("\nPedido Atendido. Obrigado e Volte Sempre!");
                            System.out.println();
                        }
                    }
                }

        } while (cliente > 0);

        System.out.println();

        if(cliente == 0){
            System.out.print("\n==| Atualização do Estoque |==\n");

            for(int i = 0; i < tam; i++){
                System.out.print("\nCódigo do "+ (i + 1) +"º Produto: "+ codprod[i] +"; Total: "+ totalprod[i]);
            }
        }

        ent.close();
    }
}