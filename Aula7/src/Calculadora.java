
public class Calculadora {
int operando1,
	operando2,
	resposta;
	
public Calculadora(){
	
}
Calculadora(int operando1){
	this.operando1= operando1;
	
}
Calculadora (int operando1, int operando2){
	this(operando1);
	this.operando2= operando2;
}
int calcularSoma() {
	int resposta = operando1 + operando2;
	return resposta;
}
int calcularSubtracao() {
	int resposta = operando1 - operando2;
	return resposta;
}int calcularMultiplicacao() {
	int resposta = operando1 * operando2;
	return resposta;
}int calcularDivisao() {
	int resposta = operando1 / operando2;
	return resposta;
}
int inverterSinal() {
	
	if (operando1>0)
	return -1 * operando1;
	else 
	return -1 * -1 * operando1;
}

}
