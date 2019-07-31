package main.java.com.collectors;

public class ProgramToMapPerson {

	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public ProgramToMapPerson(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ProgramToMapPerson [id=" + id + ", name=" + name + "]";
	}

}
