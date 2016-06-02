package Duck.DuckImpl;

import Duck.AbstractDuck.Duck;
import Duck.BehaviorImpl.FlyNoWay;
import Duck.BehaviorImpl.Squeak;

public class RubberDuck extends Duck {
	  public RubberDuck() {
		  setFlyBehavior(new FlyNoWay());
		   setQuackBehavior(new Squeak());
		  }
		  
		  public void display() {
		    System.out.println("I'm RubberDuck!");
		  }
		}

