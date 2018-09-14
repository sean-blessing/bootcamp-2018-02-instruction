
public class Human {
	private String name;
	private String eyeColor;
	private String hairColor;
	public Human(String name, String eyeColor, String hairColor) {
		super();
		this.name = name;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public void drinkBeer(int num) {
		for (int i=0; i< num; i++) {
			System.out.println("Mmmmm.... beer.");
		}
	}
	
	public int sleep() {
		return (int)(Math.random()*9);
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", eyeColor=" + eyeColor + ", hairColor=" + hairColor + "]";
	}
	
}
