import java.util.Scanner;

class PercentageCalc{
    public static void main(String[] args) {
		int total;
		double per;
		System.out.println("Taking marks of user out of 30 marks each subject ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Sub marks-1");
		int a = sc.nextInt();
		System.out.println("Sub marks-2");
		int b = sc.nextInt();
		System.out.println("Sub marks-3");
		int c = sc.nextInt();
		System.out.println("Sub marks-4");
		int d = sc.nextInt();
		System.out.println("Sub marks-5");
		int e = sc.nextInt();
		System.out.println("Sub marks-6");
		int f = sc.nextInt();sc.close();
		total = a + b + c + d + e + f;
		per = (total / 180.0) * 100;
		System.out.println("The Percentage of these all Subjects is "+per);
	}
}