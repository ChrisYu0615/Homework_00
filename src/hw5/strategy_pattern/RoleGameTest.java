package hw5.strategy_pattern;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		MoveBehavior move = new Move();
		DefendBehavior defend = new Defend();

		saber.setMoveBehavior(move);
		saber.setDefendBehavior(defend);
		saber.attack();
		saber.defend();
		saber.move();

		archer.setMoveBehavior(move);
		archer.setDefendBehavior(defend);
		archer.attack();
		archer.defend();
		archer.move();
	}

}
