
public class Student<T> {
	private T id;
	private String name;
	
	public Student(T id, String name) {
		this.id = id;
		this.name = name;}
	
	/**
	 * @return the id
	 */
	
	public T getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(T id) {
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
	
	
}
