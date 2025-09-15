public class Bird extends Pet implements Trainable {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Tweet! Tweet!");
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + getName() + ": Flies in circles and lands on perch");
    }
}