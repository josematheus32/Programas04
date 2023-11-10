import java.util.Scanner;

public class Programa21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] vetorOriginal = new int[10];
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        int[] vetorSubstituido = new int[vetorOriginal.length];

        for (int i = 0; i < vetorOriginal.length; i++) {
            if (vetorOriginal[i] == 0) {
                vetorSubstituido[i] = 1;
            } else {
                vetorSubstituido[i] = vetorOriginal[i];
            }
        }

        System.out.println("Vetor Original:");
        mostrarVetor(vetorOriginal);

        System.out.println("Vetor Substituído:");
        mostrarVetor(vetorSubstituido);

        scanner.close();
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
