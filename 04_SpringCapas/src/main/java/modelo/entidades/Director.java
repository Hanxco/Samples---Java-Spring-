package modelo.entidades;

public class Director {

	private int Id;
	private String Name;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	@Override
	public String toString() {
		return "Director [Id=" + Id + ", Name=" + Name + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
