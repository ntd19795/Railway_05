
public class main {
public static void main(String[] args) {
	Student<Integer> student1 = new Student<>(1, "Nguyen Van 1");
	Student<Float> student2 = new Student<>(2f , "Nguyen Van 2"); 
	Student<Double> student3 = new Student<>(3d , "Nguyen Van 2");
	//Float va Double bắt buộc đánh dấu f hoặc d đằng sau giá trị
	
	System.out.println(student1.getName());
	printstudent(student1);
	
}

public static void printstudent(Student student) {
	System.out.println(student.getName());
}
}
