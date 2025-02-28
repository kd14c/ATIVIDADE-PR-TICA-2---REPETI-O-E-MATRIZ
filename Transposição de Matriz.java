import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz:");
        int linhas = sc.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int[][] transposta = new int[colunas][linhas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz Transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
