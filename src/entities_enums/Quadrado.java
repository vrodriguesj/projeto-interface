package entities_enums;

public class Quadrado extends AbstractShape {

	private int altura;
	private int largura;

	public Quadrado(Color color, int altura, int largura) {
		super(color);
		this.altura = altura;
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	public double area() {
		return altura * largura;
	}
}
