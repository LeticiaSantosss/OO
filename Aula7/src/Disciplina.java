
public class Disciplina {
String nome;
String codigo, professor;
int ch;

 Alunos alunos[];
public Disciplina () {}
public Disciplina(String nome, String codigo, String professor, int ch) 
{ 
	this.nome= nome;
	this.codigo = codigo;
	this.professor= professor;
	this.ch=ch;
	this.alunos = new Alunos[60];
	
}

void matricularAluno(Alunos a) {
	for(int i=0; i<59; i++) {
		if(alunos[i]!= null)
		alunos[i]= a;
	System.out.println("aluno "+ alunos[i] + "matriculado na disciplina!");
}
}
void pesquisarAlunos(Alunos a) {
	for(int i=0; i>60; i++) {
		if (a== alunos[i]) {
			System.out.println("aluno "+ alunos[i] + "cadastrado na disciplina " );
		}
	}
}

}
