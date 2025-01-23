
public class Calculadora {


int op1,
	op2;
	 int soma,
	 	diferenca,	//resultado das operações
	 	produto,
	 	quociente;

public Calculadora() {}	 

public Calculadora(int op1) {
	this.op1= op1;
}	 

public Calculadora (int op1, int op2){
	this(op1);
	this.op2= op2;
}


void setOp1(int op1)
{
this.op1=op1;	
}
void setOp2(int op2)
{
	this.op2=op2;	
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
int inverterSinal() {
	
	if (op1>0)
	return -1 * op1;
	else 
	return -1 * -1 * op1;
}

}



