package test;

public class IntegrationTest {

    public static void main(String[] args) {
        //this test will be run one time



        System.out.println("Hello World!!");
        sayHello("Sandra");
first commit
        //todo:Add multiple users

    }
    private int age = 15;

    public IntegrationTest(int age) {
        this.age = age;
    }

    public static void sayHello(String name) {
        System.out.println("Hello "+ name);
        System.out.println("Goodbye");
        System.out.println("Learning Git");


    }
}
