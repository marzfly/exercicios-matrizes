package handsonmatrizes;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maiorValor = matriz[0][0];
        int indexLine = 0, indexRow = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite um número: ");
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                    indexLine = i;
                    indexRow = j;
                }
            }
        }
        System.out.println("O maior valor é " + maiorValor + " (" + indexLine + ", " + indexRow + ")");
        sc.close();
    }
}
