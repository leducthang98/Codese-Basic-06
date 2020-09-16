public class Animal {
    public void bark() {
        System.out.println("Animal barking");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.info();
        cat.bark();
    }
}

class Cat extends Animal {
    int a = 0;
//    public void bark(){
//        System.out.println("Cat barking");
//    }
    public void info() {
        System.out.println("This is a cat");
        this.bark();
        super.bark();
    }
}
