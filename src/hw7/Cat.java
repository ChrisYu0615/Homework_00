package hw7;

/**
 * Cat類(繼承Animal類)
 */
public class Cat extends Animal {
	private static final long serialVersionUID = 11203832771L;

	public Cat(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("This is Cat " + getName() + " speaking!");
	}

}
