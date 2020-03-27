package main;

import java.util.Locale;

import entities_enums.AbstractShape;
import entities_enums.Color;
import entities_enums.Quadrado;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		AbstractShape a1 = new Quadrado(Color.BRANCO, 10, 2);

		System.out.println("Cor do Quadrado: " + a1.getColor());
		System.out.println("Tamanho do Quadrado: " + String.format("%.2f", a1.area()));
	}
}
