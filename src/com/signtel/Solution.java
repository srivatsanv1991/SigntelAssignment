package com.signtel;

import java.util.Locale;
import java.util.ResourceBundle;

import com.signtel.model.*;

public class Solution {

	
	public static void main(String a[]) {
		
		
		System.out.println("Current Locale: " + Locale.getDefault());
		ResourceBundle mybundle = ResourceBundle.getBundle("MyLabels");
		
		mybundle.getString("how_are_you");
		int flyCount=0,swimCount=0,singCount=0,walkCount=0;
		
		Duck duck = new Duck();
		duck.setFly("Duck cannot fly");
		duck.setSing("Duck says Quak Quak");
		singCount++;
		duck.setSwim("Duck can swim");
		swimCount++;
		duck.setWalk("Duck can walk");
		walkCount++;
		
		Chicken chicken = new Chicken();
		chicken.setFly("Chicken cannot fly");
		chicken.setSing("Chicken says cluck cluck");
		singCount++;
		chicken.setSwim("Chicken cannot swim");
		chicken.setWalk("chicken can walk");
		walkCount++;
		
		Rooster rooster = new Rooster();
		rooster.setFly("Rooster can fly");
		flyCount++;
		
		rooster.setSing("Rooster says Cock-a-doodle-doo");
		System.out.println(rooster.getSing());
		Locale.setDefault(new Locale("da", "DA"));
		System.out.println("Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		rooster.setSing(mybundle.getString("Rooster.says.Cock.a.doodle.doo"));
		System.out.println(rooster.getSing());
		Locale.setDefault(new Locale("de", "DE"));
		System.out.println("Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		rooster.setSing(mybundle.getString("Rooster.says.Cock.a.doodle.doo"));
		System.out.println(rooster.getSing());
		Locale.setDefault(new Locale("du", "DU"));
		System.out.println("Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		rooster.setSing(mybundle.getString("Rooster.says.Cock.a.doodle.doo"));
		System.out.println(rooster.getSing());
		Locale.setDefault(new Locale("fi", "FI"));
		System.out.println("Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		rooster.setSing(mybundle.getString("Rooster.says.Cock.a.doodle.doo"));
		System.out.println(rooster.getSing());
		Locale.setDefault(new Locale("fr", "FR"));
		System.out.println("Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		rooster.setSing(mybundle.getString("Rooster.says.Cock.a.doodle.doo"));
		System.out.println(rooster.getSing());
		
		
		singCount++;
		rooster.setSwim("Rooster cannot swim");
		rooster.setWalk("Rooster can walk");
		walkCount++;
		
		Fish fish  = new Fish();
		fish.setFly("Fish cannot fly");
		fish.setSing("Fish cannot sing");
		fish.setSwim("Fish can swim");
		fish.setWalk("Fish cannot walk");
		
		Shark shark = new Shark();
		shark.setSize("Sharks are large and grey");
		shark.setBehavior("Sharks eat other fish");
		shark.setSwim("Shark can swim");
		swimCount++;
		
		ClownFish clownFish = new ClownFish();
		clownFish.setSize("ClownFish are small and colorful(orange)");
		clownFish.setBehavior("ClownFish makes jokes");
		clownFish.setSwim("ClownFish can swim");
		swimCount++;
		
		Dolphin dolphin = new Dolphin();
		dolphin.setSwim("Dolphins are good swimmers");
		swimCount++;
		
		Butterfly butterFly = new Butterfly();
		butterFly.setFly("ButterFly can fly");
		flyCount++;
		butterFly.setSing("ButterFly does not make sound");
		
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.setFly("caterpillar cannot fly");
		caterpillar.setWalk("Caterpillar can walk");
		walkCount++;
		
		Dog dog = new Dog();
		dog.setSing("Dog says Woof Woof");
		walkCount++;
		singCount++;
		
		Cat cat = new Cat();
		cat.setSing("Cat says meow meow");
		walkCount++;
		singCount++;
		
		Parrot parrot = new Parrot();
		parrot.setFly("Parrots can fly");
		flyCount++;
		parrot.setParrotWithCat("Parrot with cat says meow meow");
		parrot.setParrotWithDog("Parrot with dog says woof woof");
		parrot.setParrotWithRooster("Parrot with rooster says Cock-a-doodle-doo");
		singCount++;
		walkCount++;
		
		System.out.println("----------Animals that can Fly----------");
		
		System.out.println(duck.getFly());
		System.out.println(chicken.getFly());
		System.out.println(rooster.getFly());
		System.out.println(fish.getFly());
		System.out.println(butterFly.getFly());
		System.out.println(caterpillar.getFly());
		System.out.println(parrot.getFly());
		System.out.println();
		
		System.out.println("----------Animals that can Sing----------");
		
		System.out.println(duck.getSing());
		System.out.println(chicken.getSing());
		System.out.println(rooster.getSing());
		System.out.println(fish.getSing());
		System.out.println(butterFly.getSing());
		System.out.println(dog.getSing());
		System.out.println(cat.getSing());
		System.out.println(parrot.getParrotWithCat());
		System.out.println(parrot.getParrotWithDog());
		System.out.println(parrot.getParrotWithRooster());
		System.out.println();
		
		System.out.println("----------Animals that can Walk----------");
		
		System.out.println(duck.getWalk());
		System.out.println(chicken.getWalk());
		System.out.println(rooster.getWalk());
		System.out.println(fish.getWalk());
		System.out.println(caterpillar.getWalk());
		System.out.println();
		
		System.out.println("----------Animals that can Swim----------");
		
		System.out.println(duck.getSwim());
		System.out.println(chicken.getSwim());
		System.out.println(rooster.getSwim());
		System.out.println(fish.getSwim());
		System.out.println(shark.getSwim());
		System.out.println(clownFish.getSwim());
		System.out.println(dolphin.getSwim());
		System.out.println();
		
		System.out.println("Total number of Animal that can fly-->"+flyCount);
		System.out.println("Total number of Animal that can walk-->"+walkCount);
		System.out.println("Total number of Animal that can swim-->"+swimCount);
		System.out.println("Total number of Animal that can sing-->"+singCount);
	}
}
