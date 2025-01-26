package Exercicio3;
//fazer usando extend, herença, polimorfismo
public class PA extends Progressao {
public PA(int a0, int n, int r ) {
	super(a0, r, n); // Chama o construtor da classe base
}
void calculaProgressao() {
	for(int i=0; i< getN(); i++) {
		if (i==0)
			termo[i] =  termo[i] = new Termos(getA0(), i+1);
		else
		 termo[i] = new Termos(getA0()+getR() * i  , i + 1);
		
	}
}
}
