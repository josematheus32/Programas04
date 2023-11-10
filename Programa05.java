import java.util.Random;

public class Programa05 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] logica = new int[15];
        int[] programacao = new int[10];

        System.out.print("\n| Sistema de Matrículas de Lógica e Linguagem de Programação |\n");

        for(int i = 0; i < programacao.length; i++){
            programacao[i] = aleatorio.nextInt(15)+1;
            System.out.print("\n"+ (i + 1) +"º Matrícula de Linguagem de Programação: "+ programacao[i]);
        }

        System.out.println();

        for(int i = 0; i < logica.length; i++){
            logica[i] = aleatorio.nextInt(15)+1;
            System.out.print("\n"+ (i + 1) +"º Matrícula de Lógica: "+ logica[i]);
        }

        System.exit(0);

    }
}
