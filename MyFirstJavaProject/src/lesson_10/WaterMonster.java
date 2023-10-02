package lesson_10;

public class WaterMonster implements Monster {
	String name;
	WaterMonster(String s) {
		this.name = s;
	}

	public String attack() {
		return "I am a water monster" + this.name;
	}
}
