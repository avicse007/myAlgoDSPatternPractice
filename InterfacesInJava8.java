
interface I {
    default void message() {
        System.out.println("Hello from interface I ");
    }

    static void show() {
        System.out.println("Interface I");
    }
}

interface J {
    default void message() {
        System.out.println("Hello from interface J ");
    }

    static void show() {
        System.out.println("Interface J");
    }
}

class A implements I, J {
    public void message() {
        System.out.println("Hello from class A");
    }
}

class InterfacesInJava8 {

    public static void main(String[] args) {
        A a = new A();
        a.message();
        I.show();
        J.show();
    }

}
