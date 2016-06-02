package Duck.AbstractDuck;

import Duck.IDuck.IFlyBehavior;
import Duck.IDuck.IQuackBehavior;

public abstract class Duck {
	 
	  IFlyBehavior flyBehavior;
	  IQuackBehavior quackBehavior;

	  public void performFly() {
	    
	    flyBehavior.fly();
	  }

	  public void performQuack() {
	    quackBehavior.quack();
	  }
	  
	  public void setQuackBehavior(
		         IQuackBehavior behavior) {
		      this.quackBehavior = behavior;
		   }
	  
	  public void setFlyBehavior(
		         IFlyBehavior behavior) {
		      this.flyBehavior = behavior;
		   }

	  public void swim() {
	    System.out.println("I can swim!!");  
	    System.out.println("================");  
	  }
	  
	  public abstract void display();
	}
