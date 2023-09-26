package hw7;

import java.io.Serializable;

/**
 * Animal類(共同抽象父類)
 */
public abstract class Animal implements Serializable {
	private static final long serialVersionUID = 5044112112771L;
	private String name;

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void speak();

}
