package main;

import shoes.Shoe;
import shoes.SportsShoe;
import shoes.TrekkingShoe;

public class ShoeTesting {

	public static void main(String[] args) {
		Shoe shoe = new SportsShoe();

		shoe.test();
		
		System.out.println(shoe instanceof SportsShoe);
		System.out.println(shoe instanceof Shoe);
		System.out.println(shoe instanceof Object);
	}
}
