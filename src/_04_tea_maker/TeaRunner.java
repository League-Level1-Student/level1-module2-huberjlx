package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaBag tea = new TeaBag("Mint");
		Kettle kettle = new Kettle();
		
		Water w = kettle.getWater();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(tea, w);
		
	}

}
