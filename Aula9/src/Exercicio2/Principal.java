package Exercicio2;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Informe as dimensoes da matriz A:");
	int linhasA = scanner.nextInt();
	int colunasA= scanner.nextInt();
	Matriz A = new Matriz(linhasA, colunasA);
	System.out.println("Entre com os valores da matriz A: ");
	A.preencherMatriz();
	System.out.println("Informe as dimensoes da matriz B:");
	int linhasB = scanner.nextInt();
	int colunasB= scanner.nextInt();
	Matriz B = new Matriz(linhasB, colunasB);
	System.out.println("Entre com os valores da matriz B: ");
	B.preencherMatriz();
	CalculadoraMatrizes calculadora = new CalculadoraMatrizes(A, B);
	   List<String> resultadosOperacoes = new ArrayList<>();

	int resposta = 0;
	do {
		System.out.println(" 1 - Soma\r\n"
				+ "2 - Subtracao\r\n"
				+ "3 - Multiplicação de matrizes\r\n"
				+ "4 - Multiplicação por escalar\r\n"
				+ "5 - Transposta de matriz\r\n"
				+ "6 - Gravar matrizes");
		resposta = scanner.nextInt();
		switch (resposta) {
		case 1: {
			calculadora.Soma();
			resultadosOperacoes.add("Resultado da soma \n" + matrizParaString(calculadora.C));
			System.out.println(" A + C calculada e armazenada no arquivo");
		}
		case 2: 
			calculadora.Subtracao();
			resultadosOperacoes.add("Resultado da subtracao \n" + matrizParaString(calculadora.C));
			System.out.println(" A - C calculada e armazenada no arquivo");
		case 3: 
			calculadora.Multiplicação();
			resultadosOperacoes.add("Resultado da multiplicacao \n" + matrizParaString(calculadora.C));
			System.out.println(" A * C calculada e armazenada no arquivo");
		case 4: 
			System.out.println("Informe o escalar para multiplicacao ");
			int escalar = scanner.nextInt();
			System.out.println("Qual matriz deseja multiplicar ? ");
			 char res = scanner.next().toUpperCase().charAt(0);
			calculadora.multiplicaçãoEscalar(escalar, res);
			resultadosOperacoes.add("Resultado da multiplicacao escalar \n" + matrizParaString(calculadora.C));
			System.out.println(" multiplicacao por escalar calculada e armazenada no arquivo");
		case 5: 
			System.out.println("Deseja calcular a transpota de qual matriz? ");
			char r = scanner.next().toUpperCase().charAt(0);
			calculadora.Tranposta(r);
			resultadosOperacoes.add("Resultado da transposta \n" + matrizParaString(calculadora.C));
			System.out.println(" transposta calculada e armazenada no arquivo");
		case 6: 
			gravarResultadosEmArquivo(resultadosOperacoes, "matrizes.txt");
            resultadosOperacoes.clear();
            System.out.println("As operações realizadas foram gravadas no arquivo 'matrizes.txt'.");
            break;
        default:
            System.out.println("Opção inválida. Por favor, escolha novamente.");


		}
	
	} while (resposta != 6);
	scanner.close();

	
	}
	private static String matrizParaString(Matriz matriz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.getLinha(); i++) {
            for (int j = 0; j < matriz.getColuna(); j++) {
                sb.append(matriz.elementos[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static void gravarResultadosEmArquivo(List<String> resultados, String nomeArquivo) {
        try (FileWriter fileWriter = new FileWriter(nomeArquivo);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {

            for (String resultado : resultados) {
                printWriter.println(resultado);
                printWriter.println("------------------------------");
            }

        } catch (IOException e) {
            System.err.println("Erro ao gravar os resultados no arquivo: " + e.getMessage());
        }
    }
}


