package Exercicio3;

public class PG extends Progressao {
	public PG (int a0, int r, int n) {
		super(a0, r, n);
	}
	
void calculaProgressao(){
	for (int i= 0; i< getN(); i++) {
		termo[i]= new Termos ((int) (getA0() * Math.pow(getR(),i)), i+1);
		
	}
}
}
