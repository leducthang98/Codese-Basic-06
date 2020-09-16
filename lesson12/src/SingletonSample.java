public class SingletonSample {
    private static final SingletonSample
            INSTANCE = new SingletonSample();

    private SingletonSample() {
    }

    public static SingletonSample getInstance() {
        return INSTANCE;
    }

    public void show() {
        System.out.println("aa");
    }

}
