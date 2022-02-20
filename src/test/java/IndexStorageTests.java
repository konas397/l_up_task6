import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTests {
    @Test
    public void NegativeSize() {
        int size = -10;
        try {
            IndexStorage idxSt = new IndexStorage(size);
            Assertions.fail("Массив создан");
        }
        catch (IllegalArgumentException thrown) {
            Assertions.assertEquals("Размер массива не может быть отрицательным", thrown.getMessage());
        }
        catch (Exception e) {
            Assertions.fail("Иное исключение");
        }
    }
    @Test
    public void HighOutOfRange() {
        int size = 10;
        try {
            IndexStorage idxSt = new IndexStorage(size);
            idxSt.get(20);
        }
        catch (IllegalArgumentException thrown) {
            Assertions.assertEquals("Индекс выходит за пределы массива", thrown.getMessage());
        }
        catch (Exception e) {
            Assertions.fail("Иное исключение");
        }
    }
    @Test
    public void LowOutOfRange() {
        int size = 10;
        try {
            IndexStorage idxSt = new IndexStorage(size);
            idxSt.get(-5);
        }
        catch (IllegalArgumentException thrown) {
            Assertions.assertEquals("Индекс выходит за пределы массива", thrown.getMessage());
        }
        catch (Exception e) {
            Assertions.fail("Иное исключение");
        }
    }
    @Test
    public void getValFromRange() {
        int size = 10;
        IndexStorage idxSt = new IndexStorage(size);
        int valAct = idxSt.get(5);
        Assertions.assertEquals(-5, valAct);
    }
    @Test
    public void getOddVal() {
        int size = 10;
        IndexStorage idxSt = new IndexStorage(size);
        int valAct = idxSt.getVal(5);
        Assertions.assertEquals(-5, valAct);
    }
    @Test
    public void getEvenVal() {
        int size = 10;
        IndexStorage idxSt = new IndexStorage(size);
        int valAct = idxSt.getVal(6);
        Assertions.assertEquals(6, valAct);
    }
    @Test
    public void getReversArr() {
        int size = 10;
        IndexStorage idxSt = new IndexStorage(size);
        int[] array = idxSt.reverse();
        Assertions.assertEquals(array[0], idxSt.get(idxSt.size() - 1));
    }
}
