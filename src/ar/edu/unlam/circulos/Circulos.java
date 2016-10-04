package ar.edu.unlam.circulos;

public class Circulos {
	
		private Double radio;
		
		public Circulos(Double radio){
			this.radio = radio;
					
		}

		public Double calcularPerimetro(Double radio2){
			Double perimetro = this.getRadio() * 3.14 * 2;
			return perimetro;
		}

		public Double getRadio() {
			return radio;
		}
		
	

	}
