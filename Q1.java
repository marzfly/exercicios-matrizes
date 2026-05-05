package handsonmatrizes;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[3][2];
        double[] media = new double[3];
        double soma = 0;
        String[] nomes = new String[3];
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite o nome do aluno " + (i + 1));
            nomes[i] = sc.nextLine();
            soma = 0;
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("Digite a nota do aluno " + (i + 1) + " (" + nomes[i] + ") na prova " + (j + 1));
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }
            media[i] = soma / (notas[i].length);
            sc.nextLine();
        }
        System.out.println("\n");
        for(int i = 0; i < nomes.length; i++){
            System.out.print("Nome: ");
            System.out.print(nomes[i]);
            System.out.print(" | Média: ");
            System.out.printf("%.2f", media[i]);
            System.out.println("\n");
        }
        sc.close();
    }
}