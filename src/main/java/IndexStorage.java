public class IndexStorage {
    private int size;
    public IndexStorage(int size) throws IllegalArgumentException {
        if (size < 0)
            throw new IllegalArgumentException("Размер массива не может быть отрицательным");
        this.size = size;
    }
    public int size() {
        return size;
    }
    protected int getVal(int index) {
        return index % 2 == 0 ? index : -index;
    }
    public int get(int index) {
        if (index < 0 || index >= size())
            throw new IllegalArgumentException("Индекс выходит за пределы массива");
        return getVal(index);
    }
    public int[] reverse () {
        int[] array = new int[size()];
        for (int i = 0; i < size(); i++) {
            array[size() - i - 1] = get(i);
        }
        return array;
    }
}