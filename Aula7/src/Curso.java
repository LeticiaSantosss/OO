
public class Curso {
String nome,ch , turno;
Disciplina[] disciplina;
Alunos[] alunos;

Curso(String nome, String ch, String turno) {
    this.nome = nome;
    this.ch = ch;
    this.turno = turno;
    this.disciplina = new Disciplina[100];
    this.alunos = new Alunos[60]; //usar o banco de dados alunos de outra classe 
    
   
    for (int i=0; i<=99;i++) {
    	disciplina[i] = null; //zerar tds os termos 
    }
}

void cadastrarDisciplina(Disciplina a) {
	for(int i=0; i<disciplina.length; i++ )
	    {
			if (disciplina[i]== null) {
				disciplina[i]= a;
			System.out.println("disciplina "+ disciplina + "cadatrada no curso!");
			}else
				System.out.println("disciplina naõ cadastrada no curso!");
		}
	
}

void listarDisciplinas()
{
	for(int i=0; i<99; i++) {
	if (disciplina[i] !=null) {
		System.out.println("Disciplinas desse curso são: "+ disciplina[i]);
		
		}else 
		break;
	}
}
	 

void pesquisarAlunos(Alunos a) {
	for(int i=0; i>60; i++) {
		if (a== alunos[i]) {
			System.out.println("aluno "+ alunos[i] + "cadastrado no curso " );
		}
	}
}

}
