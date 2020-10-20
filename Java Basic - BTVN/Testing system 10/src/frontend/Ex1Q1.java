package frontend;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import frontend.Program;

public class Ex1Q1 {
public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
//frontend.Program.ex1q4();
	
	System.out.println("Mời bạn chọn chức năng muốn dùng: ");
	Scanner scanner = new Scanner(System.in);
	int methodnumber = scanner.nextInt();
	if (methodnumber == 5) {
		ex1q5();
	}
	else {System.out.println("Không có chức năng này");}


}

public static void ex1q5() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bạn muốn xóa position có id là bao nhiêu? ");
	int i = scanner.nextInt();
	System.out.println("deleting.....");
	frontend.Program.ex1q5(i);
	scanner.close();
	
}
}
