

public class ex2 {
	public static void main(String[] args) {
//		Exercise 2 (Optional): Default value
//		Question 1:
//		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//		 Email: "Email 1"
//		 Username: "User name 1"
//		 FullName: "Full name 1"
//		 CreateDate: now
		Account[] account1 = new Account[5];
		
		for (int i = 0; i< account1.length; i++) {
			account1[i] = new Account();
			account1[i].email = "Email " +(i+1);
			account1[i].username = "username " + (i+1);
			account1[i].fullName = "fullName "+ (i+1);	
			
			System.out.println(account1[i].email );
			System.out.println(account1[i].username);
			System.out.println(account1[i].fullName+"\n");
		}
		
	}
}
