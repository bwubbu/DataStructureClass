public class C {
    public static void main(String[] args) {
        Object[] o = {new A(), new B()};
        System.out.println(o[0]);
        System.out.println(o[0]);
    }
}
class A extends B {
    public String toString() {
        return "A";
    }
}
class B {
    public String toString() {
        return "B";
    }
}
