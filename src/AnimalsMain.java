public class AnimalsMain {
    String name;
    public AnimalsMain(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        System.out.println("Кошки:");
        Cat cat = new Cat("Варвара");
        cat.move(10);
        cat.swim(false);
        System.out.println("\nСобаки:");
        Dog dog = new Dog("Шарик");
        dog.move(25);
        dog.swim(true);
    }
}
