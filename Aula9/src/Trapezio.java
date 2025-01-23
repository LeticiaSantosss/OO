
public class Trapezio {
	Medida basemenor,
	basemaior,
	altura,
	area,
	perimetro;
	
Trapezio(Medida basemenor, Medida basemaior, Medida altura){
	this.basemenor = basemenor;
	this.basemaior= basemaior;
	this.altura= altura;
	this.area =  new Medida();
	this.perimetro= new Medida();
}
Medida calcularAreatrapezio(){
	area.valor = ((basemenor.valor + basemaior.valor)* altura.valor /2);
	area.unidade= "cm2";
return area;
}
Medida calcularPerimetrotrapezio(){
	int cateto = basemaior.valor - basemenor.valor;
	int hipotenusa = (int) Math.sqrt((cateto * cateto) + (altura.valor * altura.valor));
	perimetro.valor = basemenor.valor + basemaior.valor + altura.valor + (hipotenusa *2);
	perimetro.unidade= "cm";
return perimetro;
}

}
