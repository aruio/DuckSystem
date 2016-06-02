package Duck.DuckImpl;

import Duck.AbstractDuck.Duck;
import Duck.BehaviorImpl.FlyWithRocket;
import Duck.BehaviorImpl.MuteQuack;

public class RedheadDuck extends Duck {
	  public RedheadDuck() {
		  setFlyBehavior(new FlyWithRocket());
		  setQuackBehavior(new MuteQuack());
		  }
		  public void display() {
		    System.out.println("I'm RedheadDuck!");
		  }
		}
