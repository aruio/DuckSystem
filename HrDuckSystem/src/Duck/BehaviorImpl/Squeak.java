package Duck.BehaviorImpl;

import Duck.IDuck.IQuackBehavior;

public class Squeak implements IQuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
