public class Dog extends AnimalsMain {
    public Dog(String name) {
        super (name);
        }
    int maxMove = 500;

    public void move(int i) {
        System.out.println(name + " пробежал(а) "+ i + " метров из " + maxMove + " метров");
    }
    public void swim(boolean b){
        if (b){
            System.out.println("Может плавать");
        } if (!b)
            System.out.println("Не может плавать");
        }
    }

