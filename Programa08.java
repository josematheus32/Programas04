import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int tam = 7;
        String[] aluno = new String[tam];
        double[] media = new double[tam];
        double maiorMedia = 0;
        String alunoMaiorMedia = "";

        System.out.print("\n===| Sistema de Verificar Médias |===\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\nDigite o Nome do Aluno: ");
            aluno[i] = ent.nextLine();

            System.out.print("\nDigite a Média de ("+ aluno[i] +"): ");
            media[i] = ent.nextDouble();
            ent.nextLine();
        }

        for(int i = 0; i < tam; i++){
            if(media[i] > maiorMedia){
                maiorMedia = media[i];
                alunoMaiorMedia = aluno[i];
            }
        }

        System.out.println();

        System.out.print("O Aluno com a Maior Média é: "+ alunoMaiorMedia);

        System.out.println();

        for(int i = 0; i < tam; i++){
            if(media[i] < 7){
                System.out.print("\n("+ aluno[i] +") Não foi Aprovado(a)! Para ser Aprovado(a) Precisa de 5 no Exame Final!\n");
            }
        }

        ent.close();
    }
}
