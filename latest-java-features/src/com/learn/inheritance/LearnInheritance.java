package com.learn.inheritance;

class Sound {
	private String sound;

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}

class Woof extends Sound {
	public Woof() {
		setSound("Woof");
	}
}

class Animal {
	private String name;
	private Sound sound;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sound getSound() {
		return sound;
	}

	public void setSound(Sound sound) {
		this.sound = sound;
	}

	protected void makeSound() {
		System.out.println(this.sound.getSound());
	}

}

class Dog extends Animal {
	public Dog(String name) {
		setName(name);
		setSound(new Woof());
	}

	@Override
	public void makeSound() {
		System.out.println("Custom");
	}
}

public class LearnInheritance {

	public static void main(String[] args) {

	}

}
