import java.util.Scanner;
import java.lang.Math;

public class ExercícioFix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int opcao=0;
		do {
			String mensagemInicial = "Informe qual a figura desejada ou 0 para sair: \n" +
			"1 - Circulo  " +
			"2 - Quadrado  " +
			"3 - Retângulo " + 
			
			"4 - Triângulo" +
			"0- Sair";
			System.out.println(mensagemInicial);
			opcao = sc.nextInt();
			switch (opcao) {
			case 1: 
				String mensagem = "Informe o raio do circulo";
				System.out.println(mensagem);
				double raio= sc.nextInt();
			
				//reposta ao user e calculo
				String resposta = "a area do circulo é igual a: " + AreaCirculo(raio) + " \n";
				resposta += "O perimetro do circulo é igual a: " + PerimetroCirculo(raio) + "\n";
				break;
			case 2:
				mensagem = "Informe o lado do quadrado";
				System.out.println(mensagem);
				int lado = sc.nextInt();
			
				//resposta ao user e calculo
				resposta = "O perimetro do quadrado é igual a: " +  PerimetroQuadrado(lado) + " \n";
				resposta += "A area do quadrado é igual a : " +AreaQuadrado(lado) + "\n";
				System.out.println(resposta);
				break;
			case 3: 
				mensagem = "Informe a base e a altura do retangulo";
				System.out.println(mensagem);
				int base = sc.nextInt();
				int altura = sc.nextInt();
				 
				resposta = "O perimetro do retangulo é igual a: " + PerimetroRetangulo(base, altura)  + " \n";
				resposta += "A area do retang é igual a : " + AreaRetangulo(base, altura)+ "\n";
				System.out.println(resposta);
				break;
			case 4: 
				mensagem = "Informe os 3 lados do triangulo ";
				System.out.println(mensagem);
				int lado1 = sc.nextInt();
				int lado2 = sc.nextInt();
				int lado3 = sc.nextInt();
	
					if (FormaTriangulo(lado1, lado2, lado3)){
						System.out.println("É um triangulo!");	
					}else {
						if(FormaTrianguloRetangulo(lado1,lado2,lado3)) {
						System.out.println("É um triangulo retangulo!");	
						}else {
							System.out.println("não foma triangulo");	}
					}
						resposta = "O perimetro do triangulo é igual a: " + PerimetroTriangulo(lado1, lado2, lado3)  + " \n";
						System.out.println(resposta);
						mensagem = "informe a base e a altura do triangulo";
						System.out.println(mensagem);
						int base1= sc.nextInt();
						int altura1= sc.nextInt();
						
						resposta += "A area do triangulo é igual a : " + AreaTriangulo(base1,altura1)+ "\n";
						System.out.println(resposta);
				break;
				
			}
			
		} while (opcao != 0);

        sc.close();
    		
	}
	
public static int AreaQuadrado(int lado) {
	return  lado * lado;
	
}
public static int PerimetroQuadrado(int lado) {
	return  4 * lado;
}
public static double AreaCirculo(double raio){
	return  Math.PI * Math.pow(raio, 2);
}
public static double PerimetroCirculo(double raio){
	return  2 * Math.PI * raio;
}
public static int AreaRetangulo(int base, int altura){
	return  base * altura;	
}
public static int PerimetroRetangulo(int base, int altura){
	return  base + base + altura + altura;
}
public static boolean FormaTriangulo(int a, int b, int c) {
    if ((b - c) < a && a < (b + c) &&
        (a - c) < b && b < (a + c) &&
        (a - b) < c && c < (a + b)) {
        return true;
    } else {
        return false;
    }
}
public static int AreaTriangulo(int base, int altura) {
	return   (base * altura) / 2;
}
public static int PerimetroTriangulo(int x, int y, int z) {
	return x + y + z;
}
public static boolean FormaTrianguloRetangulo(int a, int b, int c){
	if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) 
		return true;
	else 
		return false;

}
}

