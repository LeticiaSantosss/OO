
public class Triangulo {
Medida base,
		altura,
		area,
		perimetro;

Triangulo(Medida base, Medida altura){
	this.base= base;
	this.altura= altura;
	this.area = new Medida();
	this.perimetro = new Medida();
}
Medida calcularAreatriangulo() {
	area.valor = base.valor * altura.valor;
	area.unidade = "cm2";
	return area;
}
Medida calcularPerimetrotriangulo() {
	int hipotenusa = (int) Math.sqrt((base.valor * base.valor) + (altura.valor * altura.valor));
	perimetro.valor= base.valor + altura.valor + hipotenusa;
	perimetro.unidade = "cm2";
	return perimetro;
}


}
