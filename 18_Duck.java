abstract class Duck { 

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

class MallardDuck extends Duck {

    public MallardDuck() { 

        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();

    }

    public void display() { 

        System.out.println("\nI'm a real mallard duck.");

    }
}

class RubberDuck extends Duck {

    public RubberDuck() { 

        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();

    }

    public void display() { 

        System.out.println("\nI'm a toy rubber duck.");

    }
}

interface FlyBehaviour {

    public void fly();

}

class FlyWithRocket implements FlyBehaviour {  

    public FlyWithRocket() {

        System.out.println("\nReceiving rocket...");

    }

    public void fly() { 

        System.out.println("I fly on a fucking rocket and i'ts great!");

    }

}

class FlyWithWings implements FlyBehaviour {

    public void fly() { 

        System.out.println("I'm flying!");
        
    }
}

class FlyNoWay implements FlyBehaviour {

    public void fly() { 

        System.out.println("I can't fly! :[");
        
    }

}

interface QuackBehaviour {

    public void quack();

}

class Quack implements QuackBehaviour {

    public void quack() { 

        System.out.println("Quack, quack, quack!");

    }
}

class NoQuack implements QuackBehaviour {

    public void quack() { 

        System.out.println("I can't quack.");

    }
}

class Squeak implements QuackBehaviour {

    public void quack() { 

        System.out.println("Squeak, squeak, squeak!");

    }
}

class MiniDuckSimulator {

    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck();
        mallard.swim();
        mallard.performQuack();
        mallard.performFly();

        Duck rubberthing = new RubberDuck();
        rubberthing.swim();
        rubberthing.performQuack();
        rubberthing.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.swim();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyWithRocket());
        modelDuck.performFly();

        DuckPipe duckPipe = new DuckPipe();
        duckPipe.quack();

    }
}