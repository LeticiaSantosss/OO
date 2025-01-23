import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String resposta= "";
	Quadrado quadrado = null;
    Retangulo retangulo = null;
    Triangulo triangulo = null;
    Circulo circulo = null;
    Trapezio trapezio = null;
    
    
	do{
		System.out.println("Escolha uma figura geométrica:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        System.out.println("4 - Círculo");
        System.out.println("5 - Trapézio");
        int opcao = scanner.nextInt();
	if (opcao == 1) {
		System.out.println("Informe a medida do lado do quadrado: ");
		 int q = scanner.nextInt(); 
		Medida lado =new Medida(q, "cm");
		quadrado = new Quadrado(lado);
		
		
	}  if (opcao == 2) {
			System.out.println("Informe a medida do comprimento e largura do retangulo: ");
			int q = scanner.nextInt(); 
			 int r = scanner.nextInt(); 
			Medida comprimento =new Medida(q, "cm");
			Medida largura =new Medida(r, "cm");
			retangulo = new Retangulo(comprimento, largura);
		
			
	}
	 if (opcao == 3) {
			System.out.println("Informe a medida da base e altura do triangulo: ");
			 int base = scanner.nextInt(); 
			 int  altura = scanner.nextInt(); 
			Medida base1 =new Medida(base, "cm");
			Medida alt =new Medida(altura, "cm");
			 triangulo = new Triangulo(base1, alt);
		
			
	}  if (opcao == 4) {
		System.out.println("Informe a medida do raio do circulo: ");
		 int rai = scanner.nextInt(); 
		Medida raio =new Medida(rai, "cm");
		 circulo = new Circulo(raio);
	
	}
	 if (opcao == 5) {
				System.out.println("Informe a medida da base menor base maior e altura do trapezio: ");
				 int bmenor = scanner.nextInt(); 
				 int bmaior = scanner.nextInt(); 
				 int altura = scanner.nextInt(); 
				Medida basemenor = new Medida(bmenor, "cm");
				Medida basemaior = new Medida(bmaior, "cm");
				Medida altur = new Medida(altura, "cm");
				trapezio = new Trapezio(basemenor, basemaior, altur);
	 }
				System.out.println("Deseja adicionar outra figura? (S/N)");
				 resposta = scanner.next();
				
		 
	}while (resposta.equalsIgnoreCase("S"));
if(quadrado != null) {
	quadrado.carcularAreaquadrado();
quadrado.carcularPerimetroquadrado();
	System.out.println("Quadrado: " + quadrado.area.valor + " " + quadrado.perimetro.valor);
}
if(retangulo != null) {
	retangulo.calcularArearetangulo();
retangulo.calcularPerimetroretangulo();
	System.out.println("Retangulo : "+ retangulo.area.valor + " " + retangulo.perimetro.valor);
}
if(triangulo != null) {
	triangulo.calcularAreatriangulo();
triangulo.calcularPerimetrotriangulo();
	System.out.println("Triangulo : " +triangulo.area.valor + " " + triangulo.perimetro.valor);
}
if(circulo != null) {
	circulo.calcularAreacirculo();
circulo.calcularPerimetrocirculo();
	System.out.println("Circulo :" + circulo.area.valor + " " + circulo.perimetro.valor);
	 }
if(trapezio != null) {
	trapezio.calcularAreatrapezio();
trapezio.calcularPerimetrotrapezio();
	System.out.println("Trapezio :"+trapezio.area.valor + " " + trapezio.perimetro.valor);
}
scanner.close();
}
}
	
