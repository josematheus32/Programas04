import java.util.Random;

public class Programa07 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] num = new int[10];

        int qtdnegativos = 0;
        int somapositivos = 0;

        System.out.print("\n===| Sistema de Números Negativos e Positivos |===\n");

        for(int i = 0; i < num.length; i++){
            num[i] = aleatorio.nextInt();
            System.out.print("\nO "+ (i + 1) +"º Número Gerado: "+ num[i]);
            if(num[i] < 0){
                qtdnegativos++;
            } else {
                somapositivos += num[i];
            }
        }

        System.out.print("\n\nA Quantidade de Números Negativos é: "+ qtdnegativos);
        System.out.print("\nA Soma dos Números Positivos é: "+ somapositivos);

        System.exit(0);

    }
}
