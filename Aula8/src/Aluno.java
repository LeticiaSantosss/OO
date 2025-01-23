
public class Aluno {
private String nome,
				email;
private int matricula;

Aluno(String nome, String email, int matricula){
	this.setNome(nome);
	this.setEmail(email);
	this.setMatricula(matricula);
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
}
