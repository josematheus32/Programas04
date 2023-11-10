import java.util.Random;

public class Programa25 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] num = new int[15];
        int numMaior = 0;

        System.out.print("\n===| Sistema de Divisão Pelo Maior Vetor |===\n");

        for(int i = 0; i < num.length; i++){
            num[i] = aleatorio.nextInt(1000)+1;
            System.out.print("\n"+ (i + 1) +"° Número Gerado: "+ num[i]);

            if(num[i] > numMaior){
                numMaior = num[i];
            }
        }

        System.out.println();

        for(int i = 0; i < num.length; i++){
            System.out.print("\n("+ num[i] +" / "+ numMaior +") = "+ (num[i] / numMaior));
        }

        System.exit(0);
    }
}
