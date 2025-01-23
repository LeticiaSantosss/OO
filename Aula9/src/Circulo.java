
public class Circulo {
	Medida raio,
	area,
	perimetro;
	
Circulo(Medida raio){
this.raio= raio;
this.area = new Medida ();
this.perimetro = new Medida ();
}

Medida calcularAreacirculo() {
	area.valor= (int) Math.PI * (raio.valor * raio.valor);
	area.unidade = "cm2";
	return area;		
}
Medida calcularPerimetrocirculo() {
	perimetro.valor= (int) Math.PI * raio.valor *2;
	perimetro.unidade = "cm";
	return perimetro;		
}
}
