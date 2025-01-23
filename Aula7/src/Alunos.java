
public class Alunos {
String nome;
String matricula;
String email;
Curso curso;
Disciplina disciplina;

 public Alunos(String nome, String matricula, String email) {
	 this.nome = nome;
	 this.email=email;
	 this.matricula= matricula;
}
void emitirRelatorio(Alunos a) {
	for(int i=0; i<60; i++)
		if (curso.alunos[i]== a)
			System.out.println("O aluno "+ a + "esta matriculado no curso " + this.curso);
	
}
void emitirRelatorio(Alunos a) {
    System.out.println("Relatório do Aluno:");
    System.out.println("Curso: " + a.curso);
    System.out.println("Disciplinas matriculadas: ");
    for (Disciplina d : disciplina) {
        if (d != null) {
            for (Alunos aluno : d.alunos) {
                if (aluno == a) {
                    System.out.print(d.nome + ", ");
                }
            }
        }
    }
    System.out.println();
    }
 
}
