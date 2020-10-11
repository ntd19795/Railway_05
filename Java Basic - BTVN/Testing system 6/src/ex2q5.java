import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2q5 { 
public static void main(String[] args) {

	try {
	int age = inputAge();
	System.out.println("tuoi cua ban la: " + age);
	}
	catch (Exception e)
	{
		e.printStackTrace();
		
	}
	}
	public static int inputAge() throws Exception {
		
		try{Scanner scanner = new Scanner(System.in);
		
		System.out.println("moi ban nhap vao so tuoi: ");
		int age = scanner.nextInt();
		
		
		
		return age;
		
		}
		catch (InputMismatchException e)
		{
			throw new Exception ("wrong inputing! Please input an age as int, input again.");
		}
		catch (ArrayIndexOutOfBoundsException e)  //không làm dc cho nó lớn hơn 0
		{	throw new Exception ("Wrong inputing! The age must be greater\r\n"+ "than 0, please input again.");}

//		catch (Exception e) {
//			// TODO: handle exception
//			throw new Exception ("wrong inputing! Please input an age as int, input\r\n"+ "again.");
//		}

	
		
	}
	
}
