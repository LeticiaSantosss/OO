
public class Principal {
	public class Main {
	    public static void main(String[] args) {
	        Turma turma = new Turma(3);
	        Aluno aluno1 = new Aluno("Alice", "alice@example.com", 222022135);
	        Aluno aluno2 = new Aluno("Bob", "bob@example.com", 24546);
	        Aluno aluno3 = new Aluno("Carlos", "carlos@example.com", 3);
	       Aluno aluno4= new Aluno ("let", "leleljbhssbjhbs", 155565);

	        // Matriculando alunos
	        turma.matricularAluno(aluno1);
	        turma.matricularAluno(aluno2);
	        turma.matricularAluno(aluno3);

	        // Tentativa de matrícula além da capacidade
	       

	        // Pesquisando aluno
	        turma.pesquisarAluno(222022135);

	        // Desmatriculando aluno
	        turma.desmatricularAluno(aluno2);

	        // Pesquisando aluno removido
	        turma.pesquisarAluno(1);

	        // Matriculando outro aluno após desmatrícula
	        turma.matricularAluno(aluno4);
	    }
	}

}
