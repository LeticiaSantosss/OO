package Exercicio2;

public class CalculadoraMatrizes {
Matriz A,
	B,
	C;
CalculadoraMatrizes(Matriz A, Matriz B){
	this.A= A;
	this.B=B;
	this.C = new Matriz();
	A.preencherMatriz();
	B.preencherMatriz();
}
public void Soma(){
	if ((A.getLinha() & A.getColuna()) == (B.getLinha() &B.getColuna())){
	for(int i=0; i<A.getLinha(); i++) {
		for(int j= 0; j<A.getColuna(); j++) {
			C.elementos [i][j]= A.elementos [i][j] + B.elementos[i][j];		}		
		}
	}	
	
}
public void Subtracao(){
	if ((A.getLinha() & A.getColuna()) == (B.getLinha() &B.getColuna())){
	for(int i=0; i<A.getLinha(); i++) {
		for(int j= 0; j<A.getColuna(); j++) {
			C.elementos [i][j]= A.elementos [i][j] - B.elementos[i][j];		}		
		}
		
	}
	
}
public void Multiplicação() {
	if ((A.getColuna()  ==  B.getLinha())) {
		for (int i=0; i< A.getLinha(); i++) {
			for(int j=0; j<B.getColuna(); j++) {
				for(int k=0; k<= A.getColuna(); k++) {
					C.elementos[i][j] += A.elementos [i][k] * B.elementos[k][j];
				}
			}
		}
}	
	
}

public void multiplicaçãoEscalar(int escalar, char resposta) {
	if(resposta == 'A') {
	for (int i=0; i< A.getLinha(); i++) {
		for(int j=0; j<A.getColuna(); j++) {
			C.elementos[i][j]= A.elementos[i][j] * escalar; 
		}
	}
	}
	else 
	{
		for (int i=0; i< B.getLinha(); i++) {
			for(int j=0; j<B.getColuna(); j++) {
				C.elementos[i][j]= B.elementos[i][j] * escalar; 
			}
		}
	}
	
}
public void Tranposta(char r) {
	if (r== 'B') {
	for (int i=0; i< B.getLinha(); i++) {
		for(int j=0; j<B.getColuna(); j++) {
			C.elementos[i][j]= B.elementos[j][i]; 
		}
		}
	}
	
}
}

