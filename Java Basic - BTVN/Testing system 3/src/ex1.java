import java.util.Random;
import java.util.Scanner;




public class ex1 {
	public static void main(String[] args) {
//		Account account1 = new Account();
//		account1.account = 1;
//		account1.luong =  (float) 5240.5 ;
//		
//		Account account2 = new Account();
//		account2.account = 2;
//		account2.luong =  (float) 10970.055 ;
		
		
//		Exercise 1 (Optional): Datatype Casting
		System.out.print("Exercise 1");
		
//		Question 1:
		System.out.println("\n_________________________\n");
		System.out.println("Question1");
//		Khai báo 2 số lương có kiểu dữ liệu là float.
//		Khởi tạo Lương của Account 1 là 5240.5 $
//		Khởi tạo Lương của Account 2 là 10970.055$
		float luongaccount1 = 5240.5f;
		float luongaccount2 = 10970.055f;		
//		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
		int luonglamtron1 = (int) luongaccount1;
		int luonglamtron2 = (int) luongaccount2;	
		System.out.println("lương thằng 1: " + luonglamtron1);
//		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
		System.out.println("lương thằng 2: " + luonglamtron2);	

		

		
		
		//		Question 2:
//		Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//		có số 0 ở đầu cho đủ 5 chữ số)
		System.out.println("\n_________________________\n");
		System.out.println("Question2");
	
//		
		// Lấy ngẫu nhiên 1 số có 5 chữ số
		Random random = new Random();
		String result = String.valueOf(random.nextInt(99999));
//		đếm số độ dài số cho ra
		int dodairesult = result.length();
		// tính ra số lượng số 0 cần bù (5 - độ dài số cho ra)
		int soluongso0canbu = 5 - dodairesult;
		// chèn vào đằng trước số cho ra số lượng số 0 cần thiết
		if (soluongso0canbu == 0) {System.out.println(result);}
		if (soluongso0canbu == 1) {System.out.println("0"+result);}
		if (soluongso0canbu == 2) {System.out.println("00" + result);}
		if (soluongso0canbu == 3) {System.out.println("000" + result);}
		if (soluongso0canbu == 4) {System.out.println("0000"+ result);}
		
		
		System.out.println("\n_________________________\n");
		System.out.println("Question3");
//		Question 3:
//		Lấy 2 số cuối của số ở Question 2 và in ra.
//		Gợi ý:
//		Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//		Cách 2: chia lấy dư số đó cho 100

		int length = result.length();
		int startIndex = 0;
			if (result.length() <= 1) {
			result = "0" + result;
			} else {
			startIndex = length - 2;
			}
		
		String resultSubstring = result.substring(startIndex);	
		System.out.print(resultSubstring);
		
//		Question 4:
//		Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		
		System.out.println("\n_________________________\n");
		System.out.println("Question4");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số a: ");
		int a = scanner.nextInt(); //chú ý scanner của int có thên đuôi Int

		System.out.println("Mời bạn nhập vào số b: ");
		int b = scanner.nextInt();
		nhapvao2so(a, b);
		scanner.close();
	}	
	
	public static void nhapvao2so(int a, int b) {
		System.out.println("Hiệu của a và b là: " + (a-b));
	}
}
