import java.util.Random;

public class Programa18 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] num = new int[15];
        int posicaoMaior = 0, posicaoMenor = 0, numMaior = 0, numMenor = 0;

        System.out.print("\n===| Sistema de Menor e Maior Número e Sua Posição |===\n");

        for(int i = 0; i < num.length; i++){
            num[i] = aleatorio.nextInt();

            System.out.print("\n"+ (i + 1) +"º Número Gerado: "+ num[i]);

            if(num[i] > numMaior){
                numMaior = num[i];
            }
            if(num[i] < numMenor){
                numMenor = num[i];
            }
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] == numMaior){
                System.out.print("\n\nO Maior Número é: "+ numMaior +"; Ele Está na Posição: "+ posicaoMaior);
            } else if(num[i] != numMaior){
                posicaoMaior++;
            }
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] == numMenor){
                System.out.print("\nO Menor Número é: "+ numMenor +"; Ele Está na Posição: "+ posicaoMenor);
            } else if (num[i] != numMenor){
                posicaoMenor++;
            }
        }

        System.exit(0);
    }
}
