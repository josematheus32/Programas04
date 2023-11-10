import java.util.Scanner;

public class Programa10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextInt();
        }

        int[] vetor2 = new int[5];
        System.out.println("Digite 5 números inteiros para o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] resultadoSoma = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) { // Se for par
                for (int j = 0; j < vetor2.length; j++) {
                    resultadoSoma[i] += vetor1[i] + vetor2[j];
                }
            }
        }

        int[] resultadoDivisores = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) { // Se for ímpar
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor2[j] != 0 && vetor1[i] % vetor2[j] == 0) {
                        resultadoDivisores[i]++;
                    }
                }
            }
        }

        System.out.println("Vetor Resultante da Soma:");
        mostrarVetor(resultadoSoma);

        System.out.println("Vetor Resultante dos Divisores:");
        mostrarVetor(resultadoDivisores);

        scanner.close();
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
