package hw5.strategy_pattern;

public class Defend implements DefendBehavior {
	@Override
	public void defend() {
		System.out.println("做防禦動作");
	}
}
