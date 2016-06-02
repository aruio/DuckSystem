package Duck.BehaviorImpl;

import Duck.IDuck.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {
	public void quack() {
		System.out.println("Mute");
	}
}
