
public class Turma {
private String disciplina;
private int codigo;
private int totalVagas;
private int vagasDisponiveis;
private Aluno []alunos;

Turma (int qtdeVagas){
alunos = new Aluno [qtdeVagas];	
totalVagas = qtdeVagas;
vagasDisponiveis = qtdeVagas;
}
boolean matricularAluno(Aluno aluno) {
	for (int i= 0;i < totalVagas; i++) {
		if(alunos[i]== null) {
			alunos[i] = aluno;
		System.out.println("Aluno " + aluno.getNome() + "  matriculado na turma " + codigo + ".");
		vagasDisponiveis--;
return true;
		} 
	} System.out.println("Aluno ja matriculado");
		return false;
}

boolean desmatricularAluno(Aluno aluno) {
	for (int i= 0;i < totalVagas; i++) {
		if(alunos[i]== aluno) {
			alunos[i]= null;
			System.out.println("Aluno " + aluno.getNome() + "nao esta mais na disciplina "+ disciplina);
		vagasDisponiveis++;
		return true;
		}
} System.out.println("aluno não encontrado ");
		
		return false;
}
		
public Aluno pesquisarAluno(int matricula) {
    for (int i = 0; i < totalVagas; i++) {
        if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
            System.out.println("Aluno encontrado: " + alunos[i].getNome() + " (Matrícula: " + matricula + ")");
            return alunos[i];
        }
    }
    System.out.println("Aluno com matrícula " + matricula + " não está matriculado na turma " + codigo + ".");
    return null;
}}
