public interface IPerson {
    void walk();

    void eat();

    void sleep();

    void fly();
}

class NormalPerson implements IPerson {

    public NormalPerson() {

    }

    @Override
    public void walk() {
        System.out.println("walking");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void fly() {

    }

    public void work() {
        System.out.println("working");
    }

    public static void main(String[] args) {
        NormalPerson np = new NormalPerson();
        np.work();
    }
}

// Java Basic, Java OOP (extends,impliment) , Java MVC, JDBC
// 3 cu
