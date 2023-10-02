package lesson_10;

public class FireMonster implements Monster {
	String name;
	FireMonster(String s) {
		this.name = s;
	}

	public String attack() {
		return "I am a fire monster" + this.name;
	}
}