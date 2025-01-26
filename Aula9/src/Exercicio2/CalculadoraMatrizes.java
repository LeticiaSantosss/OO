package Exercicio2;

public class CalculadoraMatrizes { //tava errada apenas nos calculos e nesse ?A : B e esqueci de colocar as dimensões em C a cada função 
Matriz A,
	B,
	C;
CalculadoraMatrizes(Matriz A, Matriz B){
	this.A= A;
	this.B=B;
	this.C = new Matriz(Math.max(A.getLinha(), B.getLinha()), Math.max(A.getColuna(), B.getColuna()));

	A.preencherMatriz();
	B.preencherMatriz();
}
public void Soma(){
	if ((A.getLinha() & A.getColuna()) == (B.getLinha() &B.getColuna())){
	for(int i=0; i<A.getLinha(); i++) {
		for(int j= 0; j<A.getColuna(); j++) {
			C.elementos [i][j]= A.elementos [i][j] + B.elementos[i][j];		}		
		}
	}System.out.println(" n foi possivel calcular, dimensões diferentes");	
	
}
public void Subtracao(){
	if ((A.getLinha() & A.getColuna()) == (B.getLinha() &B.getColuna())){
		
	for(int i=0; i<A.getLinha(); i++) {
		for(int j= 0; j<A.getColuna(); j++) {
			C.elementos [i][j]= A.elementos [i][j] - B.elementos[i][j];		}		
		}
	}System.out.println(" n foi possivel calcular, dimensões diferentes");	
	
}
public void Multiplicação() {
	if ((A.getColuna()  ==  B.getLinha())) {
		C = new Matriz (A.getLinha(), B.getColuna());
		for (int i=0; i< A.getLinha(); i++) {
			for(int j=0; j<B.getColuna(); j++) {
				C.elementos[i][j] = 0;

				for(int k=0; k<= A.getColuna(); k++) {
					C.elementos[i][j] += A.elementos [i][k] * B.elementos[k][j];
				}
			}
		}
}else
	System.out.println("Não é possível multiplicar as matrizes. Dimensões incompatíveis.");;
	
}

public void multiplicaçãoEscalar(int escalar, char resposta) {
	Matriz origem = (resposta == 'A') ? A : B;
	C= new Matriz(origem.getLinha(), origem.getColuna());
	for (int i=0; i< origem.getLinha(); i++) {
		for(int j=0; j<origem.getColuna(); j++) {
			C.elementos[i][j]=origem.elementos[i][j] * escalar; 
		}
	}
}
	

public void Tranposta(char r) {
	Matriz origem = (r=='A'? A:B);//a matriz de origem (A ou B) é escolhida dinamicamente com base no valor do parâmetro r. Se r == 'A', usa A; caso contrário, usa B 
	C=  new Matriz (origem.getColuna(), origem.getLinha());
	for (int i=0; i< origem.getLinha(); i++) {
		for(int j=0; j<origem.getColuna(); j++) {
			C.elementos[j][i]= origem.elementos[i][j]; //a transposta sera C, com dimensões invertidas
		}
		}
	
	
}
}

