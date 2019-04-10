package br.com.lucasbueno.swtesting1;

/**
 * Given a String representing a var name, evaluate if it is valid. A valid var
 * name contains only alphanumeric chars and the first char must be a lower case
 * letter.
 *
 */
public class App {
	public static void main(String[] args) {
		double doubleA = .0;
		for (int i = 1; i <= 11; i++) 
			doubleA +=0.1;

		double doubleB = 0.1 * 11;

		System.out.println("f1 = " + doubleA);
		System.out.println("f2 = " + doubleB);

		if (doubleA == doubleB)
			System.out.println("os doubles são iguais");
		else
			System.out.println("os doubles não são iguais");
	}
}