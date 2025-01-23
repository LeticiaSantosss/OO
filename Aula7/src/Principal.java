import java.util.Scanner;


public class Principal {
public static void main(String[] args) {
	Calculadora calc;
	String resposta,
				op;
	Scanner sc= new Scanner(System.in);
	int resultado;
	
	
	do {
	System.out.println("Usuário desejar realizar um cálculo? (s/n)");
	resposta= sc.next();
	System.out.println("Informe o primeiro operando");
	int operando1= sc.nextInt();
	System.out.println("Informe o segundo operando");
	int operando2= sc.nextInt();
	calc = new Calculadora(operando1, operando2); 
	System.out.println("Informe a operação desejada: (+, -, *, /, ! -> inversão de sinal");
	op= sc.next();
	if(op == "+" ){
	 resultado = calc.calcularSoma();
	System.out.print(resultado);
	}
	else if(op == "-" ){
		resultado = calc.calcularSubtracao();
		System.out.print(resultado);
	}
	else if(op == "/" ){
		resultado = calc.calcularDivisao();
		System.out.print(resultado);
	}
	else if(op == "*" ){
		resultado = calc.calcularMultiplicacao();
		System.out.print(resultado);
	}
	else 
		resultado = calc.inverterSinal();
		System.out.print(resultado);	
	}while(resposta != "n");
	
}}