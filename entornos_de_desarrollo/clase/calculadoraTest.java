package clase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.PracticaCalculadora;

class calculadoraTest {


	@Test
	public void testSuma() {
		int resultado = PracticaCalculadora.testSuma(2,3);
		int esperado = 5;
		asserEquals(esperado,resultado);
	}

	private void asserEquals(int esperado, int resultado) {
		// TODO Auto-generated method stub
		
	}

}
