package _06_minion;

public class Minion {
	
	
	//Instance variable - So Basically a variable part of the class, not method
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	public Minion (String name, int eyes, String color, String master) {
		// name inside this constructor is called a local variable
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public String getName() {
		
		return name;
		
	}
	
	public int getEyes() {
		
		return eyes;
		
	}
	
	public String getColor() {
		return color;
		
	}
	
	public String getMaster() {
		return master;
		
	}

	public void setMaster(String string) {
		master = string;
		
	}
}
