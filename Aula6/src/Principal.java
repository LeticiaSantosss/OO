import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc;	
		//
		int op1,
			op2;
		char operacao;
		char opcao;
	int resposta = 0;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				
				System.out.println("Usuário desejar realizar um cálculo? (s/n)");
				opcao =  sc.next().charAt(0);
				
				System.out.println("Informe o valor do operando 1");
				op1= sc.nextInt();
				System.out.println("Informe o valor do operando 2");
				op2= sc.nextInt();
				calc= new Calculadora (op1,op2);
				System.out.println("Informe a operação desejada: (+, -, *, /, ! -> inversão de sinal)");
				 operacao = sc.next().charAt(0);
				if(operacao == '+') 
				resposta = calc.adicao();
				
					if(operacao=='-') 
						resposta =calc.subtração();
					if(operacao=='*') 
						resposta =calc.multiplicação();
					if(operacao=='/') 
						resposta =calc.divisao();
					if(operacao=='!') 
						resposta =calc.inverterSinal();		
				System.out.println(resposta);
				System.out.println("Usuário desejar realizar um outro cálculo? (s/n)");
				opcao =  sc.next().charAt(0);
			} while (opcao !='n');
		}
	}

}
