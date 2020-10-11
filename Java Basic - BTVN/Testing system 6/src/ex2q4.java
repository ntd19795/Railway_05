import java.util.Scanner;

public class ex2q4 { //chưa viết thành method đc
public static void main(String[] args) {
	String[] departments = {"con cho","con meo","con ga"};

	try {
	Scanner scanner = new Scanner(System.in);
	System.out.println("moi ban nhap vao so phong ban muon tra");
	int index = scanner.nextInt();
	System.out.println("Phòng ban bạn muốn tra tên là: " + departments[index-1]);
	}
	catch (Exception e)
	{
	System.out.println("Phòng ban chỉ có từ 1 đến 3");
		
	}
	finally {
		System.out.println("_______________________\nChuong trình đã chạy hết.");
	}
	
	
}
//public static void getIndex(int index)
//{
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("moi ban nhap vao so phong ban");
//	
////	System.out.println(ex2q4.departments[index]);
////			scanner.nextInt();
//	
//}
}
