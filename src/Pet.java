public abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Pet Name: " + this.name + ", Age: " + this.age);
    }

    public String getName() {
        return this.name;
    }
}