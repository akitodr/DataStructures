public class StaticStack extends AbstractStack {
    public StaticStack(int capacity) {
        super(capacity);
    }

    public void push(int element) {
        if(isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top = top + 1;
        elements[top] = element;
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
