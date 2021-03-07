package page_18_duck;



// Fly behaviours

interface FlyBehaviour {

    public void fly();

}

class FlyWithRocket implements FlyBehaviour {  

    public FlyWithRocket() {

        System.out.println("\nReceiving rocket behaviour object...");

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

class FlyWithPlane implements FlyBehaviour {

    public void fly() { 

        System.out.println("Got a plane, motherfucker ✈ !!!");
        
    }

}