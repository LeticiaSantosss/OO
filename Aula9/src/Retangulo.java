
public class Retangulo {
Medida largura,
		comprimento,
		area,
		perimetro;

Retangulo(Medida largura, Medida comprimento){
	this.largura= largura;
	this.comprimento = comprimento;
	this.area = new Medida();
	this.perimetro = new Medida();
}
Medida calcularArearetangulo(){
	 area.valor = largura.valor * comprimento.valor ;
	 area.unidade = "cm2";
	 return area;
}
Medida calcularPerimetroretangulo(){
	 perimetro.valor = (largura.valor * 2) + (comprimento.valor *2);
	 perimetro.unidade = "cm";
	 return perimetro;
}

}
