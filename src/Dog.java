public class Dog extends Pet implements Trainable {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + getName() + ": Sits and shakes hands");
    }
}