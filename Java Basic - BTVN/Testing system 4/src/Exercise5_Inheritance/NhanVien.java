package Exercise5_Inheritance;

public class NhanVien extends CanBo{
	private String congViec;

	public NhanVien(int id, String hoTen, boolean isNam, String diaChi, String congViec) {
		super(id, hoTen, isNam, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}
	

}
