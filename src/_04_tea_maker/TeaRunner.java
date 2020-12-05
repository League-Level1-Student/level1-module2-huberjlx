package _04_tea_maker;

public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaBag tea = new TeaBag("Mint");
		Kettle kettle = new Kettle();
		kettle.Water water = new Water();
		kettle.boil();
		kettle.getWater()
		Cup cup = new Cup();
	}

}
