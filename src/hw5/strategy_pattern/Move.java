package hw5.strategy_pattern;

public class Move implements MoveBehavior {
	@Override
	public void move() {
		System.out.println("跑步");
	}
}
