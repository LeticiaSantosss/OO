package Exercicio3;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
char resposta;
boolean resp = true ;
int a0;
int n,
 r;
Scanner scanner = new Scanner(System.in);

while (resp) {
System.out.println("Informe o valor de a0 :");
a0= scanner.nextInt();
System.out.println("Informe o valor de r :");
r = scanner.nextInt();
System.out.println("Informe o valor de n :");
n = scanner.nextInt();
System.out.println("Deseja calcular novas progressões? (s/n)");
resposta = scanner.next().charAt(0);
if (resposta == 'n') 
	resp = false;
PA pa = new PA (a0, r, n);
pa.calculaProgressao();
pa.exibirTermos();
PG pg = new PG (a0, r, n);
pg.calculaProgressao();
pg.exibirTermos();

}
scanner.close();
}
}