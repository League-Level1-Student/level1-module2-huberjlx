package _03_smurf;

import java.util.concurrent.SynchronousQueue;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf("handy");
		handy.eat();
		System.out.println(handy.getName());
		Smurf papa = new Smurf("papa smurf");
		Smurf smurfette = new Smurf("smurfette");
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}

}
