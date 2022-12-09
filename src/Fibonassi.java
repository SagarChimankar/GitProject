
public class Fibonassi {
//hello
	public static void CountWordsFromString(int str) {
		int a = 0;int b = 1;
		for (int i = 1; i <= str; i++) {
			System.out.print(a + "hello ");
			int c = a + b;
			a = b;
			b = c;
		}
	}// heello

	public static void main(String[] args) {
		CountWordsFromString(10);
	}
}