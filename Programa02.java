import java.util.Random;

public class Programa02 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] num = new int[7];

        System.out.print("\n| Sistema de Números Multiplos de 2 e 3 |\n");

        for(int i = 0; i < num.length; i++){
            num[i] = aleatorio.nextInt();
            System.out.print("\nO "+ (i + 1) +"° Número Gerado: "+ num[i]);
        }

        System.out.println();

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                System.out.print("\n"+ num[i] +" é Multiplo de 2!");
            } else if (num[i] % 3 == 0){
                System.out.print("\n"+ num[i] +" é Multiplo de 3!");
            }
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0 && num[i] % 3 == 0){
                System.out.print("\n"+ num[i] +" é Multiplo de 2 e 3!");
            }
        }

    }
}
