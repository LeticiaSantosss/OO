package Exercicio3;

public class Progressao {
	private int a0;
	private int r;
	private int n;
	Termos termo[];
	Progressao(){}
	Progressao(int a0, int r, int n){
		this.a0= a0;
		this.r= r;
		this.n = n;
		this.termo = new Termos[n];
		
		}
	void calculaProgressao() {
		
	}
	public void exibirTermos() {
        System.out.print("[");
        for (Termos t : termo) {
            System.out.print(t.an + " "); // Exibe o valor do termo
        }
        System.out.println("]");
    }
	

public int getN() {
	return n;
}
public int getR() {
	return r;
}
public int getA0() {
	return a0;
}
}
