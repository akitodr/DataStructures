public class Array {
    private int[] data;

    Array(int size) {
        this.data = new int[size];
    }

    public static Array create(int... data) {
        Array array = new Array(data.length);
        for (int i = 0; i < data.length; i++) {
            array.set(i, data[i]);
        }
        return array;
    }

    public void set(int index, int value) {
        this.data[index] = value;
    }

    public int get(int index) {
        return this.data[index];
    }

    public int size() {
        return this.data.length;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size(); i++) {
            if(data[i] == value) return i;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    @Override
    public String toString() {
        String out = "[";
        if(size() > 0) {
            out += this.data[0];
        }
        for (int i = 1; i < size(); i++) {
            out += ", " + this.data[i];
        }
        out += "]";
        return out;
    }
}
