public abstract class AbstractStack implements Stack {
    protected int top;
    protected int[] elements;

    public AbstractStack(int capacity) {
        if(capacity <= 0) {
            throw new IllegalArgumentException("Capacity has to be greater then 1");
        }
        top = -1;
        elements = new int[capacity];
    }

    @Override
    public int pop() {
        if(isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        int elem = elements[top];
        elements[top] = 0;
        top = top - 1;
        return elem;
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public int getCapacity() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }
}
