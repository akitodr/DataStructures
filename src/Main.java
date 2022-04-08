public class Main {
    public static void main(String[] args) {
        StaticStack staticStack = new StaticStack(4);
        ArrayStack arrayStack = new ArrayStack(4, 1);

        staticStack.push(1);
        staticStack.push(5);
        staticStack.push(6);
        staticStack.push(8);

        System.out.println("Static Stack Content: " + staticStack.toString());
        System.out.println("Static Stack Size: " + staticStack.getSize());
        System.out.println("Static Stack Capacity: " + staticStack.getCapacity());
        System.out.println("Static Stack Top Item: " + staticStack.pop());
        System.out.println("Static Stack Size: " + staticStack.getSize() + "\n");

        arrayStack.push(22);
        arrayStack.push(19);
        arrayStack.push(29);
        arrayStack.push(7);

        System.out.println("Array Stack Content: " + arrayStack.toString());
        System.out.println("Array Stack Size: " + arrayStack.getSize());
        System.out.println("Array Stack Capacity: " + arrayStack.getCapacity());

        arrayStack.push(44);
        System.out.println("\n44 Added!");
        System.out.println("Array Stack Content: " + arrayStack.toString());
        System.out.println("Array Stack Size: " + arrayStack.getSize());
        System.out.println("Array Stack Capacity: " + arrayStack.getCapacity());

        arrayStack.trimToSize();
        System.out.println("Trim to Size Applied");
        System.out.println("\nArray Stack Size: " + arrayStack.getSize());
        System.out.println("Array Stack Capacity: " + arrayStack.getCapacity());
    }
}
