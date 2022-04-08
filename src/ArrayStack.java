import java.util.Arrays;

public class ArrayStack extends AbstractStack {
    private float growthRate;

    public ArrayStack(int capacity, float growthRate) {
        super(capacity);
        this.growthRate = growthRate;
    }

    public void push(int element) {
        if(top >= getCapacity() - 1) {
            int newCapacity = (int)(getCapacity() * (growthRate + 1));
            newCapacity = Math.max(getCapacity() + 1, newCapacity);
            var newArray = Arrays.copyOf(elements, newCapacity);
            elements = newArray;
        }

        top = top + 1;
        elements[top] = element;
    }

    public boolean isFull() {
        return false;
    }

    public void trimToSize() {
        elements = Arrays.copyOf(elements, getSize());
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
