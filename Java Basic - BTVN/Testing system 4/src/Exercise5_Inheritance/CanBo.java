package Exercise5_Inheritance;

import java.util.Scanner;

public class CanBo {
	private int id;
	private String hoTen;
	private boolean isNam;
	private String diaChi;
	public CanBo(int id, String hoTen, boolean isNam, String diaChi) {
	
		this.id = id;
		this.hoTen = hoTen;
		this.isNam = (boolean) isNam;
		this.diaChi = diaChi;
	}
	
//	public CanBo
	public int getId() {
		return id;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String isNam() {
		if (isNam) {
			return "Nam";
		} 
		return "Nu";
	}
	public String getDiaChi() {
		return diaChi;
	}

	public CanBo() {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Nhập id đi: ");
		this.id = scanner.nextInt();
		System.out.println("Nhập tên đi: ");
		this.hoTen = scanner.nextLine();
		scanner.nextLine();		
		System.out.println("Có phải nam không? (true/false): ");
		this.isNam = scanner.nextBoolean();
		System.out.println("Mời nhập địa chỉ: ");
		this.diaChi = scanner.nextLine();
		scanner.nextLine();
	}
	
	
	@Override
	public String toString() {
		return "CanBo [id=" + id + ", hoTen=" + hoTen + ", isNam=" + isNam() + ", diaChi=" + diaChi + "]";
	}


	
}

