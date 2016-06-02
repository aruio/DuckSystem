package Duck.BehaviorImpl;

import Duck.IDuck.IQuackBehavior;

public class Quack implements IQuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
