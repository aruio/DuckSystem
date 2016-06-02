package Duck.DuckImpl;

import Duck.AbstractDuck.Duck;
import Duck.BehaviorImpl.FlyWithWings;
import Duck.BehaviorImpl.Quack;

public class MallardDuck extends Duck{
	  public MallardDuck() {
		   setFlyBehavior(new FlyWithWings());
		   setQuackBehavior(new Quack());
	    
	  }
	  
	  public void display() {
	    System.out.println("I'm MallarDuck! ");
	  }
	}