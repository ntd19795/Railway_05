package ex4;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private int diemHocLuc;
	
	public Student(String name, String hometown, int dienHocLuc) {
		super();
		this.name = name;
		this.hometown = hometown;
		this.diemHocLuc = 0;
	}

	public void setDienHocLuc(int dienHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}
	
}

