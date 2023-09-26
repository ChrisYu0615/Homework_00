package hw7;

/**
 * Dog類(繼承Animal類)
 */
public class Dog extends Animal {
	private static final long serialVersionUID = 988133412771L;

	public Dog(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("This is Dog " + getName() + " speaking.");
	}
}
