import java.util.Scanner;

public class exercise2Exception {
public static void main(String[] args) {
	try {	float result = divide(7,0);
			System.out.println(result); }
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("cannot divide 0");
		}
	finally {
System.out.println("divide completed!");
	}
	
}
public static float divide(int a, int b) {
	
	
	return a/b;
		
}
}
