import java.util.ArrayList;

class StrongNumber {

	public static String isStrongNumbrer(int num) {
		// Data
		int sumaFact = 0;
		String mensaje = "";

		// Metodos
		sumaFact = sumaFact(num);

		// Comparacion y salida
		mensaje = (num == sumaFact) ? "STRONG !!!!" : "Not Strong !!";
		return mensaje;
	}

	// Metodos auxiliares

	// Metodo Factorial
	public static int factorial(int num) {
		int fact = 1;
		for (int i = num; i > 1; i--) {
			fact *= i;
		}
		return fact;
	}

	// Metodo separar numeros y factorial de cada uno
	public static int sumaFact(int num) {
		// Data
		int resultado = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numBas10 = 0;
		// Formacion del ArrayList
		for (int i = 1; i <= num; i = i * 10) {
			numBas10 = i;
		}
		for (int j = numBas10; j > 0; j = j / 10) {
				numeros.add(num / j);
				num = num % j;
		}
		// suma de los factoriales del ArrayList
		for (int k = 0; k < numeros.size(); k++) {
			resultado += factorial(numeros.get(k));
		}
		return resultado;
	}
}
