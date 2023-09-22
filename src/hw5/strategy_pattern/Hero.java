package hw5.strategy_pattern;

public abstract class Hero implements DefendBehavior, MoveBehavior {
	// 省略 getter/setter...
	private DefendBehavior defendBehavior;
	private MoveBehavior moveBehavior;
	private String name;
	private int level;
	private double exp;

	public Hero() {
		this("David", 1, 0);
	}

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public void setDefendBehavior(DefendBehavior defendBehavior) {
		this.defendBehavior = defendBehavior;
	}

	public void setMoveBehavior(MoveBehavior moveBehavior) {
		this.moveBehavior = moveBehavior;
	}

	public abstract void attack();

	public void move() {
		moveBehavior.move();
	}

	public void defend() {
		defendBehavior.defend();
	}
}
