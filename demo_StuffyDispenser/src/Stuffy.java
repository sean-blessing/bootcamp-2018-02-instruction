/*
 * This class represents a 'stuffy', or stuffed animal
 */
public class Stuffy {
	private int id;
	private String name;
	private String type;
	private String color;
	
	public Stuffy(String name, String type, String color) {
		this.id = 0;
		this.name = name;
		this.type = type;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + "]";
	}
	
	

}
