package page_18_duck;



// Quack behaviour definition 

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
