public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        System.out.println(man.hiWorld());
        System.out.println(woman.hiWorld());
        System.out.println(String.valueOf(man.myAge()));
        System.out.println(String.valueOf(woman.myAge()));
    }
}