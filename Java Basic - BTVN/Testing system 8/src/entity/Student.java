package entity;

public class Student {
	private int id;
	private String name;
	private static int index = 1; 
	// không có static thì khi khởi tạo các đối tượng mới
	// ctrinh khai báo lại index =1  từ đầu

	public Student(String name) {
		this.id = index++; //auto increment
		this.name = name;
	}

	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */

	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nStudent [id: " + id + ", name: " + name + "]";
	}

}
