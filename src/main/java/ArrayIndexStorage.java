import com.sun.jdi.Value;

public class ArrayIndexStorage extends IndexStorage {
    private int[] array;
    public ArrayIndexStorage(int[] array) {
        super(array == null ? 0 : array.length);
        if (array == null) {
            throw new IllegalArgumentException("Массив не передан");
        }
        this.array = array;
    }
    @Override
    protected int getVal(int index) {
        return array[index];
    }
}
