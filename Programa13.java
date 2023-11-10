import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa13 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#.#");

        int tam = 8;
        String[] aluno = new String[tam];
        double[] nota = new double[tam];
        double somamedia = 0;

        System.out.print("\n===| Sistema de Média de Notas da Classe |===\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\nDigite o Nome do "+ (i + 1) +"º Aluno: ");
            aluno[i] = ent.nextLine();

            System.out.print("\nDigite a Nota de ("+ aluno[i] +"): ");
            nota[i] = ent.nextDouble();
            ent.nextLine();

            somamedia += nota[i];
        }

        System.out.println();

        System.out.print("\n==| Relatório de Notas |==\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\n("+ aluno[i] +"): "+ nota[i]);
        }

        System.out.println();

        System.out.print("\nMédia da Classe: "+ deci.format(somamedia / tam));

        ent.close();
    }
}
