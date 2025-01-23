
public class Calculadora {
int op1,
	op2;
	 int soma,
	 	diferenca,	//resultado das operações
	 	produto,
	 	quociente;
	 
public Calculadora (int o1, int o2){
	op1= o1;
	op2= o2;
}
public Calculadora() {
	// TODO Auto-generated constructor stub
	
}

void setOp1(int op)
{
op1 = op;	
}
void setOp2(int op)
{
op2 = op;	
}

int adicao() {
	 soma = op1+ op2;
	 return soma;
}
int subtração() {
	diferenca = op1- op2;
	return diferenca;
}
int multiplicação() {
	produto = op1 * op2;
	return produto;
}

int divisao() {
	quociente = op1 / op2;
	return quociente;
}

}

