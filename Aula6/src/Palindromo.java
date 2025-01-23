
public class Palindromo {
String palavra;

Palindromo(){}

Palindromo(String p){
	palavra = p;
	
}


public void ehPalindromo(){
	String limpa= palavra.replaceAll("\\s+", "").toLowerCase();
		
		int inicio= 0;
		int fim = limpa.length()-1;
		boolean ehPalindromo= true;
		
		while(inicio<fim) {
			if(limpa.charAt(inicio)!= limpa.charAt(fim)) { //etorna o caractere na posição i da string como um valor do tipo char. 
				ehPalindromo = false;
			break;	
		} inicio++;
		fim--;
		}
		if(ehPalindromo)
			System.out.println("eh palindromo");
		else 
			System.out.println(" não eh palindromo");
}

public int vogais() {
	String limpa = palavra.toLowerCase();
	int soma=0;
	
	for(int i=0; i<limpa.length()-1; i++) {
		char c= limpa.charAt(i);
		if(c== 'a' ||c== 'e' || c== 'i' ||c== 'o' || c== 'u' )
			soma ++;
	}
	return soma;
}

public void imprimeInverso() {
    for (int i = palavra.length() - 1; i >= 0; i--) {
        System.out.print(palavra.charAt(i));
    }
    System.out.println(); // Quebra de linha no final
}
}
