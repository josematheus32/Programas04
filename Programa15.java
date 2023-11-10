import java.util.Scanner;

public class Programa15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomesClientes = new String[8];
        int[] locacoes2011 = new int[8];

        for (int i = 0; i < nomesClientes.length; i++) {
            System.out.println("Digite o nome do cliente " + (i + 1) + ":");
            nomesClientes[i] = scanner.nextLine();

            System.out.println("Digite a quantidade de DVDs locados por " + nomesClientes[i] + " em 2011:");
            locacoes2011[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int[] locacoesGratis = new int[8];
        for (int i = 0; i < nomesClientes.length; i++) {
            locacoesGratis[i] = locacoes2011[i] / 10;
        }

        System.out.println("Clientes com a quantidade de locações grátis:");
        for (int i = 0; i < nomesClientes.length; i++) {
            System.out.println(nomesClientes[i] + ": " + locacoesGratis[i] + " locações grátis");
        }

        scanner.close();
    }
}
