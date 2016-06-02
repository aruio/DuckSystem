package Duck.BehaviorImpl;

import Duck.IDuck.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
	public void fly() {
		System.out.println("I fly with wings!");
	}
}