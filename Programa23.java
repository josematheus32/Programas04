import java.util.Scanner;

public class Programa23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 números inteiros para o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scanner.nextInt();
        }

        int resultado = 0;
        for (int i = 0; i < vetorA.length; i++) {
            resultado += vetorA[i] - vetorB[vetorB.length - 1 - i];
        }

        System.out.println("Resultado das subtrações: " + resultado);

        scanner.close();
    }
}
