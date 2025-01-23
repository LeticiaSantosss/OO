
public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora[] c;
		c= new Calculadora [5]; //matriz de referencia, criei ref para 5 calculadoras
	c[0]= new Calculadora();
	c[0].setOp1(10);
	c[0].setOp2(2);
	System.out.println("Resultado c1: " + c[0].adicao());
	}
	
}
//criar areas de figuras geometricas e calcular perimetro e area