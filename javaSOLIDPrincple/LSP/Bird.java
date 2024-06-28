package javaSOLIDPrincple.LSP;

public class Bird {
    public void fly() {
        System.out.println("the bird is flying ");
    }
}

 class Ostrich extends Bird {
    @Override
    public void fly() {
        System.out.println("Ostriches can't fly");
    }
}
