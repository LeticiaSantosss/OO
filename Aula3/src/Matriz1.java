
import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
        int M1[][], M2[][], M3[][];
        int M, N, O, P;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as dimensões de M1:");
        M = sc.nextInt();
        N = sc.nextInt();
        M1 = new int[M][N];
        System.out.println("Digite os elementos da matriz M1:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Informe as dimensões de M2:");
        O = sc.nextInt();
        P = sc.nextInt();
        M2 = new int[O][P];
        System.out.println("Digite os elementos da matriz M2:");
        for (int i = 0; i < O; i++) {
            for (int j = 0; j < P; j++) {
                M2[i][j] = sc.nextInt();
            }
        }

        // Verifica se as matrizes podem ser multiplicadas
        if (N == O) {
            // Chama a função de multiplicação e armazena o resultado em M3
            M3 = MultiplicaMatriz(M1, M2, M, N, P);

            System.out.println("A multiplicação da matriz é:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < P; j++) {
                    System.out.print(M3[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("As matrizes não podem ser multiplicadas: número de colunas de M1 diferente do número de linhas de M2.");
        }

        // sc.close(); // Opcional: pode ser removido para evitar problemas no Eclipse
    }

    public static int[][] MultiplicaMatriz(int Matriz1[][], int Matriz2[][], int M, int N, int P) {
        int Matriz3[][] = new int[M][P];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                for (int k = 0; k < N; k++) {
                    Matriz3[i][j] += Matriz1[i][k] * Matriz2[k][j];
                }
            }
        }
        return Matriz3;
    }

	$ javac Matriz1.java
	error: file not found: Matriz1.java
	Usage: javac <options> <source files>
	use --help for a list of possible option
}

