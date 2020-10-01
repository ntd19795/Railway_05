import java.text.DecimalFormat;

public class ex3 {
	public static void main(String[] args) {
//		Exercise 3(Optional): Boxing & Unboxing
		System.out.print("Exercise 3");
		
//		Question 1:
		System.out.println("\n_________________________\n");
		System.out.println("Question1");
//		Question 1:
//		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//		float có 2 số sau dấu thập phân)2

		Integer luong = 5000;
		float luong1 = luong.floatValue();
		System.out.printf("%.2f%n", luong1);
		
		
//		Question 2:
//		Khai báo 1 String có value = "1234567"
//		Hãy convert String đó ra số int
		System.out.println("\n_________________________\n");
		System.out.println("Question2");
		String valueq2 = "1234567" ;
		int valueq2int = Integer.parseInt(valueq2);  
		System.out.println(valueq2int);
		System.out.println(valueq2int -1);
		
		
//		Question 3:
//		Khởi tạo 1 số Integer có value là chữ "1234567"
//		Sau đó convert số trên thành datatype int
		System.out.println("\n_________________________\n");
		System.out.println("Question3");
		
		Integer valuechu = 1234567;
		int valueso = valuechu.intValue();
		System.out.println(valueso);
		
		
		
	}
}
