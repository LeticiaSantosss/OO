import java.util.Scanner;

public class ExercicioVetorInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
			
		Scanner sc= new Scanner(System.in);
		String mensagemInicial = "Informe qual a quantidade de numeros";
		System.out.println(mensagemInicial);
		x =sc.nextInt();
	
		int vetor[];// criamos uma ref pra esse vetor
		vetor= new int [x];// ref passa a ref o vetor 
		int resultado =0;
		
		for(int i=0; i< x ; i++) {//podemos usar v.lenght para varrer o vetor commais segurança
			vetor[i] = sc.nextInt();	
		}
		
		for(int i=0; i< x; i++) {
			resultado = vetor[i] + resultado;
		}
					resultado = resultado/x;
		String media= "sua média é " + resultado + " \n";
			System.out.println(media);
			int cont=0;
		for(int i=0; i< x ; i++) {
			if (vetor[i]%2 ==0) {
			 cont++;
			}
		}String par= "a quantidade de numeros pares é: "+ cont+ "\n";
		System.out.println(par);
		 cont=0;
		for(int i=0; i< x ; i++) {
			if (vetor[i]%2 !=0) {
			  cont++;
			}
		} String impar= "a quantidade de numeros impares é: "+ cont+ "\n";
		System.out.println(impar);
		cont=0;
		for(int i=0; i< x ; i++) {
			if (vetor[i] > 0) {
			  cont++;
			}
		} String positivo= "a quantidade de numeros positivos é: "+ cont+ "\n";
		System.out.println(positivo);
		cont=0;
		for(int i=0; i< x ; i++) {
			if (vetor[i] < 0) {
			  cont++;
			}
		} String negativo= "a quantidade de numeros negativos é: "+ cont+ "\n";
		System.out.println(negativo);
		cont=0;
		for(int i=0; i< x ; i++) {
			if (vetor[i] == 0) {
			  cont++;
			}
		} String zero= "a quantidade de numeros zero é: "+ cont+ "\n";
		System.out.println(zero);		
	}
}
