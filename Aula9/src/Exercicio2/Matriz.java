package Exercicio2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Matriz {
	 
private int linha, coluna;
int elementos [] [];

Matriz(int linha, int coluna){
	this.linha = linha;
	this.coluna= coluna;	
	this.elementos = new int [linha][coluna];
}
 public Matriz() {
	// TODO Auto-generated constructor stub
}
public void preencherMatriz() {
	 Scanner scanner = new Scanner(System.in);
	 for(int i= 0; i<linha; i++) {
		 for(int j=0; j< coluna; j++) {
			 elementos [i][j] =scanner.nextInt();
		 }
	 }
 }
 
public int getLinha() {
	return linha;
}

public int getColuna() {
	return coluna;
}
public int [][] getElementos() {
	return elementos;
}
// Método para salvar a matriz em um arquivo .txt
public void matrizArquivo(String nomeArquivo)  {
	try (FileWriter fileWriter = new FileWriter(nomeArquivo);
			PrintWriter printWriter = new PrintWriter (fileWriter)){
		 printWriter.println("Matriz " + linha + " " + coluna);
	for(int i= 0; i<linha; i++) {
		 for(int j=0; j< coluna; j++) {
			 printWriter.println(elementos [i][j] + " ");
		 
		 }  printWriter.println();
		 } 
	}catch (IOException e) {
		System.err.println("Erro ao salvar a matriz no arquivo: " + e.getMessage());
    
	}

}
}
