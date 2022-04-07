public class Main {
    public static void main(String[] args) {
        StaticStack staticStack = new StaticStack(4);
        staticStack.push(8);
        staticStack.push(3);
        staticStack.push(5);
        staticStack.push(12);

        System.out.println(staticStack.toString());
        System.out.println(staticStack.pop());
        System.out.println(staticStack.pop());

        staticStack.push(1);
        staticStack.push(32);

        System.out.println(staticStack.toString());
        System.out.println(staticStack.pop());
    }
}
