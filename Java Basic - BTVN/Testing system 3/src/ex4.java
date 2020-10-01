
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
//		Exercise 4: String
		System.out.print("Exercise 4");
		
//		Question 1:
		System.out.println("\n_________________________\n");
		System.out.println("Question1");
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
		String ex4q1 = "abcxyz 123 567";
		int dodaiex4q1 = ex4q1.length();
		System.out.println(dodaiex4q1);
		
		
//		Question 2:
//		Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		System.out.println("\n_________________________\n");
		System.out.println("Question2");
		String chuoikytu1 = "abc";
		String chuoikytu2 = "xyz";
		System.out.println(chuoikytu2+chuoikytu1);
		
		
//		Question 3:
//		Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
//		viết hoa chữ cái đầu thì viết hoa lên
//		System.out.println("\n_________________________\n");
//		System.out.println("Question3");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào tên: ");
//		String name = scanner.next();
//		
//		String Name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
//		System.out.println("Tên của bạn là: "+Name);
//		scanner.close();
		
		
		
//		Question 4:
//		Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//		của người dùng ra
//		VD:
//		Người dùng nhập vào "Nam", hệ thống sẽ in ra
//		"Ký tự thứ 1 là: N"
//		"Ký tự thứ 1 là: A"
//		"Ký tự thứ 1 là: M"

		
//		Question 5:
//		Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//		dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		System.out.println("\n_________________________\n");
		System.out.println("Question5");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào họ: ");
		String ho = scanner.next();
		System.out.println("Mời bạn nhập vào tên: ");
		String ten = scanner.next();
		String Ho = ho.substring(0,1).toUpperCase() + ho.substring(1).toLowerCase();
		String Ten = ten.substring(0,1).toUpperCase() + ten.substring(1).toLowerCase();
System.out.println("Họ tên của bạn là: " +Ho+" "+ Ten);
		scanner.close();
		
		
//		Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
		
		
//		Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		chuẩn hóa họ và tên của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//		vào3
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "Nguyễn Văn Nam"
//		Question 8:
//		In ra tất cả các group có chứa chữ "Java"
//		Question 9:
//		In ra tất cả các group "Java"
//		Question 10 (Optional):
//		Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//		Nếu có xuất ra “OK” ngược lại “KO”.
//		Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
//		Question 11 (Optional): Count special Character
//		Tìm số lần xuất hiện ký tự "a" trong chuỗi
//		Question 12 (Optional): Reverse String
//		Đảo ngược chuỗi sử dụng vòng lặp
//		Question 13 (Optional): String not contains digit
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//		lại true.
//		Ví dụ:
//		"abc" => true
//		"1abc", "abc1", "123", "a1bc", null => false
//		Question 14 (Optional): Replace character
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//		cho trước.
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
//		Question 15 (Optional): Revert string by word
//		Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//		thư viện.
//		Ví dụ: " I am developer " => "developer am I".
//		Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//		Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//		chuỗi theo dấu cách
//		Question 16 (Optional):
//		Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
//		bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
//		hình “KO”.
	}
}
