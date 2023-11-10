import java.util.Arrays;
import java.util.Random;

public class Programa17 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor1[i] = random.nextInt(50);
            vetor2[i] = random.nextInt(50);
        }

        int[] vetorUnido = new int[20];

        for (int i = 0; i < 10; i++) {
            vetorUnido[i] = vetor1[i];
            vetorUnido[i + 10] = vetor2[i];
        }

        Arrays.sort(vetorUnido);
        for (int i = 0; i < 10; i++) {
            int temp = vetorUnido[i];
            vetorUnido[i] = vetorUnido[19 - i];
            vetorUnido[19 - i] = temp;
        }

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Terceiro vetor ordenado de maneira decrescente: " + Arrays.toString(vetorUnido));
    }
}
