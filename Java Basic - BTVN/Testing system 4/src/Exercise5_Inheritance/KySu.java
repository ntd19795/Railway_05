package Exercise5_Inheritance;

public class KySu extends CanBo {

	private String nganhDaoTao;

	public KySu(int id, String hoTen, boolean isNam, String diaChi, String nganhDaoTao) {
		super(id, hoTen, isNam, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	
	
}
