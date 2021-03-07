package page_18_duck;



// Duck class definition

public abstract class Duck { 

    FlyBehaviour flyBehaviour;           // Set to interface type
    QuackBehaviour quackBehaviour;

    public Duck() {

        display();

    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour fb) { 

        flyBehaviour = fb;

    }

    public void setQuackBehaviour(QuackBehaviour qb) { 

        quackBehaviour = qb;

    }

    public void performFly() { 

        flyBehaviour.fly();             // Delegate to object 

    }

    public void performQuack() { 

        quackBehaviour.quack();

    }

    public void swim() { 

        System.out.println("We can all swim!");

    }

}



// Fake duckpipe to imitate a duck

class DuckPipe {

    QuackBehaviour quackBehaviour;

    public DuckPipe() { 

        System.out.println("\nI'm a wooden duck pipe.");

        quackBehaviour = new Quack();

    }

    public void quack() { 

        quackBehaviour.quack();

    }
}



// Toy model duck that can be assigned new behaviours

class ModelDuck extends Duck {

    public ModelDuck() { 

        quackBehaviour = new NoQuack();
        flyBehaviour = new FlyNoWay();

    }

    public void swim() { 

        System.out.println("I can't swim.");

    }

    public void display() { 

        System.out.println("\nI'm a model duck.");

    }
}



// Real duck

class MallardDuck extends Duck {

    public MallardDuck() { 

        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();

    }

    public void display() { 

        System.out.println("\nI'm a real mallard duck.");

    }
}



// Toy rubber duck

class RubberDuck extends Duck {

    public RubberDuck() { 

        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();

    }

    public void display() { 

        System.out.println("\nI'm a toy rubber duck.");

    }
}