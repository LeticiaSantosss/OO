
public class Quadrado {
Medida lado,
 	   area,
	  perimetro;

Quadrado(Medida lado){

	this.lado= lado;
	this.area= new Medida();
	this.perimetro = new Medida();
}

Medida carcularAreaquadrado() {
	  area.valor= lado.valor * lado.valor;
	  area.unidade = "cm2";
	  return area;			 
}
Medida carcularPerimetroquadrado() {
	  perimetro.valor= lado.valor * 4;
	  perimetro.unidade = "cm";
	  return perimetro;

}

}
