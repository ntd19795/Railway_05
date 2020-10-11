import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2q6 {
	public static void main(String[] args) {

		try {
			int age = inputAge();
			System.out.println("tuoi cua ban la: " + age);
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static int inputAge() throws Exception {

		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println("moi ban nhap vao so tuoi: ");
			
			
			int age = scanner.nextInt();
			
			while (age <0)
			{
				System.out.println("Tuoi phai lon hon 0. Moi ban nhap lai so tuoi: ");
				age = scanner.nextInt();
			}
			
			return age;

		} catch (InputMismatchException e) {
			throw new Exception("wrong inputing! Please input an age as int, input again.");

			}
	

	}
}
