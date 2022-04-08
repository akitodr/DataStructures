public interface Stack {
    void push(int element);
    int pop();
    int getSize();
    int getCapacity();
    boolean isEmpty();
    boolean isFull();
}