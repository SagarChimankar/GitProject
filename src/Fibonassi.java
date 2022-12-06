
public class Fibonassi {

	public static void main(String[] args) {
		int a = 0, b = 1, temp = 8;
		for (int i = 0; i <= temp; i++) {
			System.out.print(a + ", ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
