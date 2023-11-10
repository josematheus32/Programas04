import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa14 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#.#");

        int tam = 6;
        String[] aluno = new String[tam];
        double[] nota1 = new double[tam];
        double[] nota2 = new double[tam];
        String[] situacao = new String[tam];
        double somamedia = 0, qtdaprovado = 0, qtdexame = 0, qtdreprovado = 0;

        System.out.print("\n==| Sistema Para Avaliar Notas |==\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\nDigite o Nome do Aluno: ");
            aluno[i] = ent.nextLine();

            System.out.print("\nDigite a 1° Nota de ("+ aluno[i] +"): ");
            nota1[i] = ent.nextDouble();
            System.out.print("\nDigite a 2° Nota de ("+ aluno[i] +"): ");
            nota2[i] = ent.nextDouble();
            ent.nextLine();

            somamedia += (nota1[i] + nota2[i]);

            if((nota1[i] + nota2[i]) / 2 >= 8.5){
                situacao[i] = "Aprovado!";
                qtdaprovado++;
            } else if ((nota1[i] + nota2[i]) / 2 > 4.5 && (nota1[i] + nota2[i]) / 2 < 8.5){
                situacao[i] = "Exame!";
                qtdexame++;
            } else {
                situacao[i] = "Reprovado!";
                qtdreprovado++;
            }
        }

        System.out.println();

        System.out.print("\n==| Relatório de Notas |==\n");

        for(int i = 0; i < tam; i++){
            System.out.print("\nAluno ("+ aluno[i] +") | 1ª Prova: "+ nota1[i] +" | 2ª Prova: "+ nota2[i] +" | Média: "+ deci.format((nota1[i] + nota2[i]) / 2) +" | Situação: "+ situacao[i] +"\n");
        }

        System.out.println();

        System.out.print("\nMédia da Classe: "+ deci.format(somamedia / tam));
        System.out.print("\nPercentual de Alunos Aprovados: "+ (qtdaprovado / 100) +"%");
        System.out.print("\nPercentual de Alunos de Exame: "+ (qtdexame / 100) +"%");
        System.out.print("\nPercentual de Alunos Reprovados: "+ (qtdreprovado / 100) +"%");

        ent.close();
    }
}
