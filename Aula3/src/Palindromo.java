import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		char[] palindromo ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a string");
		nome = sc.nextLine();
		nome.toLowerCase();
		nome.replaceAll("\\s+", "");
		palindromo = new char [nome.length()];
		palindromo= nome.toCharArray();
		
		
		 int cont=0;
		 for(int i=0; i < nome.length(); i++) {
		for(int j = nome.length()-1 -i ; j  >= 0; j--) {
				if (palindromo[i] == palindromo[j]) {
					cont++;
				} break;
			
		}
		 }
		 if(cont == nome.length()) {
			System.out.println("é palindromo");
		}else
			System.out.println("não é palindromo");
	}

}
