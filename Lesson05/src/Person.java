public class Person {
    static String kind = "Nguoi"; //TYPE: CLASS VARIABLE
    String name; // TYPE: OBJECT VARIABLE
    int age;

    public Person() {
        System.out.println("Chay ham khoi tao default");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
    }

    public Person A() {
        Person returnValue = new Person("Demo", 200);
        return returnValue;
    }


}
