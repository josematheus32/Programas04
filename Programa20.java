import java.util.Random;

public class Programa20 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] num = new int[10];

        System.out.print("\n| Sistema de Números Positivos |\n");

        for(int i = 0; i < num.length; i++){
            num[i] = aleatorio.nextInt();
            System.out.print("\nO "+ (i + 1) +"º Número Gerado: "+ num[i]);
        }

        System.out.println();

        for(int i = 0; i < num.length; i++){
            if(num[i] > 0){
                System.out.print("\n"+ num[i] +" é Positivo!");
            }
        }

        System.exit(0);
    }
}
