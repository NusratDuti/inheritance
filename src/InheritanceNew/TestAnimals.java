package InheritanceNew;

public class TestAnimals {
    public static void main(String[] args) {

        Salmon s1 = new Salmon();
        System.out.println("Salmon has " + s1.setEyesNo(2) + " eyes");
        System.out.println("Salmon has " + s1.setMouthNo(1) + " mouth");
        System.out.println("Salmon has " + s1.setFinsNo(1) + " Fin");
        System.out.println("Salmon has " + s1.setTailNo(1) + " Tail");
        System.out.println(s1.setSilverBody(true) + "! Salmon has silver body.");
        System.out.println();

        Parrot p1 = new Parrot();
        System.out.println("Parrot has " + p1.setEyesNo(2) + " eyes");
        System.out.println("Parrot has " + p1.setMouthNo(1) + " mouth");
        System.out.println("Parrot has " + p1.setWingsNo(2) + " wings");
        System.out.println(p1.setFeathers(true) + "! Parrot has Feathers");
        System.out.println("Parrot has " + p1.setBeakNo(1) + " beak.");
        System.out.println("Parrot has " + p1.setTailFeatherNo(1) + " big tail feather.");
        System.out.println();

        Tiger t1 = new Tiger();
        System.out.println("Tiger has " + t1.setEyesNo(2) + " eyes.");
        System.out.println("Tiger has " + t1.setMouthNo(1) + " mouth.");
        System.out.println("Tiger has " + t1.setNoseNo(1) + " nose.");
        System.out.println(t1.setHasHair(true) + "! Tiger has furry body");
        System.out.println(t1.setHasClaws(true) + "! Tiger has claws");
    }
}

