package lesson_10;


public class StoneMonster implements Monster {
	String name;
	StoneMonster(String s) {
		this.name = s;
	}

	public String attack() {
		return "I am a stone monster" + this.name;
	}
}
