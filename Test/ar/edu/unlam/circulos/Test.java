package ar.edu.unlam.circulos;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Circulos miCirculo = new Circulos(2.00);
		assertEquals(miCirculo.getRadio(), 2.00, 2);
		
	}
	@org.junit.Test
	public void test1() {
		Circulos miCirculo1 = new Circulos(3.70);
		assertEquals(miCirculo1.getRadio(), 3.70, 2);
		
	}

	@org.junit.Test
	public void test2() {
		Circulos miCirculo2 = new Circulos(5.00);
		assertEquals(miCirculo2.getRadio(), 5.00, 2);
		
	}

	@org.junit.Test
	public void test3() {
		Circulos miCirculo3 = new Circulos(10.90);
		assertEquals(miCirculo3.getRadio(), 10.90, 2);
		
	}

	@org.junit.Test
	public void probarElDiametro() {
		Circulos miCirculo4 = new Circulos(9.80);
		assertEquals(miCirculo4.getRadio(), 9.80, 2);
		Double radio = miCirculo4.getRadio();
		miCirculo4.calcularPerimetro(radio);
		assertEquals(miCirculo4.calcularPerimetro(radio), 61.54, 2);
		
	}
	
	@org.junit.Test
	public void probarElDiametro2() {
		Circulos miCirculo5 = new Circulos(16.60);
		assertEquals(miCirculo5.getRadio(), 16.60, 2);
		Double radio = miCirculo5.getRadio();
		miCirculo5.calcularPerimetro(radio);
		assertEquals(miCirculo5.calcularPerimetro(radio), 104.24, 2);
		
	}
	

}
