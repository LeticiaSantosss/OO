package Exercicio3;

public class Termos {
int an;
int pos;

Termos (){}
Termos(int an, int pos){
	this.an= an;
	this.pos= pos;
	}
int get_an() {
	return an;
}
int pos() {
	return pos;
}
@Override
public String toString() {
    return "Termo: " + an + ", Posição: " + pos;
}
}

