import javax.swing.JOptionPane;
public class ExercicioPratico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,
			  b,
			  c;
		String r1,
				r2,
				r3;

		
		r1= JOptionPane.showInputDialog("Informe o 1 numero com ponto flutuante");
		a= Float.parseFloat(r1);
		r2= JOptionPane.showInputDialog("Informe o 2 numero com ponto flutuante");
		b= Float.parseFloat(r2);
		r3= JOptionPane.showInputDialog("Informe o 3 numero com ponto flutuante");
		c= Float.parseFloat(r3);
		if (a*a == (b * b + c * c)) 
			JOptionPane.showMessageDialog(null, "os valores de a,b e c formam um triangulo");
		else
			JOptionPane.showMessageDialog(null, "os valores de a,b e c não formam um triangulo");
	
	}

}
