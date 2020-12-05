package _02_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature spongebob = new SeaCreature("spongebob");
		spongebob.eat();
		System.out.println(spongebob.getName());
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		patrick.eat();
		System.out.println(patrick.getName());
		patrick.laugh();
		squidward.eat();
		System.out.println(squidward.getName());
		squidward.laugh();
		
	}

}
