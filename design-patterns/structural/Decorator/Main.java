package Decorator;

public class Main {
    public static void main(String[] args) {
        Component base = new ConcreteComponent();

        // Erweiterung durch Decorator A
        Component decoratorA = new ConcreteDecoratorA(base);

        // Erweiterung durch Decorator B auf Decorator A
        Component decoratorB = new ConcreteDecoratorB(decoratorA);

        System.out.println("Original:");
        base.operation();

        System.out.println("\nMit Decorator A:");
        decoratorA.operation();

        System.out.println("\nMit Decorator A und B:");
        decoratorB.operation();
    }
}
