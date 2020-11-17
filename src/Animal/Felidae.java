package Animal;

public class Felidae extends Animal{
    public Felidae(int age, double weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
    }

    public void meowing() {
        System.out.println("Meow... Meow...");
    }
}
