package Duck.BehaviorImpl;

import Duck.IDuck.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}