import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int anoNascimento; // variaveis do programa
		Scanner sc= new Scanner(System.in);
		
		//interação com user
		System.out.println("Informe seu nome");
		nome= sc.nextLine(); //leitura de uma string via teclado
		System.out.println("Informe ano de nascimento");
		anoNascimento= sc.nextInt();
		String resposta= "Olá " + nome + "\n";
		resposta +="Você tem " + (2024- anoNascimento) + " anos de idade";
		System.out.println(resposta);
		
		
	}

}
