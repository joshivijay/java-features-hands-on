package com.learn.comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract public String makeNoise();

	@Override
	public String toString() {
		return name;
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public String makeNoise() {
		return "Woof! Woof!!";
	}

	@Override
	public String toString() {
		return super.toString() + "-" + getName();
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public String makeNoise() {
		return "Mew! Mew!!";
	}

	@Override
	public String toString() {
		return super.toString() + "-" + getName();
	}
}

class MyComparator implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getName().compareTo(a2.getName());
	}

}

public class LearnComparator {

	public static void main(String[] args) {
		List<Animal> listAnimals = new ArrayList<>();
		Dog jimmy = new Dog("Jimmy");
		Dog marshal = new Dog("Marshal");
		Cat kitty = new Cat("Kitty");
		Cat tom = new Cat("Tom");
		listAnimals.add(jimmy);
		listAnimals.add(marshal);
		listAnimals.add(kitty);
		listAnimals.add(tom);

		System.out.println("Before Sorting");
		listAnimals.forEach(System.out::println);

		listAnimals.sort(new MyComparator());

		System.out.println("After Sorting");
		listAnimals.forEach(System.out::println);

//		MyPrivate myPrivate = new MyPrivate();
//		myPrivate.id = 7;
	}

}
