public class StaticStack {
    private int top;
    private int[] elements;

    public StaticStack(int capacity) {
        if(capacity <= 0) {
            System.out.println("Capacity has to be greater then 1");
        }
        top = -1;
        elements = new int[capacity];
    }

    public void push(int element) {
        if(isFull()) {
            System.out.println("Stack is full");
        }
        top = top + 1; //top += 1, top++;
        elements[top] = element;
        //elements[++top] = element;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        int elem = elements[top];
        top = top - 1; //top -= 1, top--;
        return elem;
    }

    public int getSize() {
        return top + 1;
    }

    public int getCapacity() {
        return elements.length;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= getCapacity() -1;
    }

    @Override
    public String toString() {
        String out = "[";
        if(getSize() > 0) {
            out += this.elements[0];
        }
        for (int i = 1; i < getSize(); i++) {
            out += ", " + this.elements[i];
        }
        out += "]";
        return out;
    }
}
