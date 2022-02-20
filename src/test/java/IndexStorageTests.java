import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTests {
    @Test
    public void NegativeSize() throws IllegalArgumentException{
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
    public void OutOfRange() throws IllegalArgumentException{
        int size = 10;
        try {
            IndexStorage idxSt = new IndexStorage(size);
            idxSt.get(20);
            idxSt.get(5);
            idxSt.get(-5);
        }
        catch (IllegalArgumentException thrown) {
            Assertions.assertEquals("Индекс выходит за пределы массива", thrown.getMessage());
        }
        catch (Exception e) {
            Assertions.fail("Иное исключение");
        }
    }
}
