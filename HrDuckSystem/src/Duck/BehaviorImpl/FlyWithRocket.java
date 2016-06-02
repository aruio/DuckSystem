package Duck.BehaviorImpl;

import Duck.IDuck.IFlyBehavior;

public class FlyWithRocket implements IFlyBehavior {
	public void fly() {
		System.out.println("<<<I fly with rocket!>>>");
	}
}