import java.util.Scanner;

public class ExercicioPratico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,
			b;
		
		System.out.println("Informe dois valores inteiros");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("a/b é igual a " + (a/b) + "\n" );
		System.out.println("a*b é igual a " + (a * b) +"\n");	
		System.out.println("a+ b é igual a " + (a + b) +"\n");	
		System.out.println("a-b é igual a " + (a - b) +"\n");
		System.out.println("a^b é igual a " + (Math.pow(a, b)) +"\n");	
		
		

	}

}
