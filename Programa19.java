import java.util.Random;

public class Programa19 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int tam = 10;
        int[] num1 = new int[tam];
        int[] num2 = new int[tam];
        int[] resultado = new int[tam];

        System.out.print("\n===| Sistema de Multiplicação do 1º Vetor Pelo 2º|===\n");

        for(int i = 0; i < tam; i++){
            num1[i] = aleatorio.nextInt(500);
            num2[i] = aleatorio.nextInt(500);

            resultado[i] = (num1[i] * num2[i]);
        }

        System.out.print("\n==| 1º Vetor Gerado |==\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\n"+ (i + 1) +"º Número Gerado: "+ num1[i]);
        }

        System.out.println();

        System.out.print("\n==| 2º Vetor Gerado |==\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\n"+ (i + 1) +"º Número Gerado: "+ num1[i]);
        }

        System.out.println();

        System.out.print("\n==| Multiplicação do 1º Pelo 2º |==\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\n"+ (i + 1) +"ª Multiplicação: "+ resultado[i]);
        }

        System.exit(0);
    }
}
