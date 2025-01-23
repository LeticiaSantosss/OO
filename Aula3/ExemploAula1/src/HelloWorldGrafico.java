import javax.swing.JOptionPane;
public class HelloWorldGrafico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome,
			strAnoNascimento;
		int anoNascimento;
		
		//interação com user
		nome = JOptionPane.showInputDialog("Informe seu nome");
		strAnoNascimento = JOptionPane.showInputDialog("Informe seu ano de nascimento");
		anoNascimento = Integer.parseInt(strAnoNascimento); //type casting |Down casting
		
		String resposta= "Olá " + nome + "\n";
		resposta +="Você tem " + (2024- anoNascimento) + " anos de idade";
		JOptionPane.showMessageDialog(null, resposta);
		
		
	}

}