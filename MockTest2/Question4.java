package MockTest2;

interface Drawable {
	void draw();
}

class Rectangle1 implements Drawable {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle1 implements Drawable {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

public class Question4 {
	public static void main(String[] args) {
		Drawable d1 = new Rectangle1();
		d1.draw();
		Drawable d2 = new Circle1();
		d2.draw();
	}
}
