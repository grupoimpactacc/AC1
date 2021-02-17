package func;

public class Arranjo {

	Integer[] a = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };

	public int buscarMaior(Integer[] a) {
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int buscarMenor(Integer[] a) {
		int min = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public int soma(Integer[] a) {
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}

	public void contarNum(Integer[] a) {
		int cont = 1;
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			cont = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					cont++;
				num = a[i];
			}
			System.out.println(" O número " + num + " repete " + cont + " vezes");
		}
	}

}
