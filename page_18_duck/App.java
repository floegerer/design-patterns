package page_18_duck;



// Only for project view

public class App {}



// Main class

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
        modelDuck.setFlyBehaviour(new FlyWithPlane());
        modelDuck.performFly();

        DuckPipe duckPipe = new DuckPipe();
        duckPipe.quack();

    }
}
