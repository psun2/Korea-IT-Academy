package jdbc_p;

public class MajorDTO {

	public String id, name;

	public MajorDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public MajorDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MajorDTO [id=" + id + ", name=" + name + "]";
	}
	
	
}
