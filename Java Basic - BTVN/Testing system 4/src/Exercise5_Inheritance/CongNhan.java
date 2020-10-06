package Exercise5_Inheritance;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;

	public CongNhan(int bac, int id, String hoTen, boolean isNam, String diaChi) {
		super(id, hoTen,  isNam,  diaChi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}
	
	public CongNhan() {
		super();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời nhập bậc: ");
		this.bac = scanner.nextInt();
	}
	public String toString() {
		String result = super.toString();
		return result = result + "Bậc: " + bac;}
		
	}

	

