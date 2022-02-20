import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexStorageTests {
    @Test
    public void getArrValFromRange() {
        IndexStorage arrIdxSt = new ArrayIndexStorage(new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        int valAct = arrIdxSt.getVal(5);
        Assertions.assertEquals(5, valAct);
    }
    @Test
    public void nullArray() {
        try {
            IndexStorage arrIdxSt = new ArrayIndexStorage(null);
            Assertions.fail("Класс создан");
        }
        catch (IllegalArgumentException thrown) {
            Assertions.assertEquals("Массив не передан", thrown.getMessage());
        }
        catch (Exception e) {
            Assertions.fail("Иное исключение");
        }
    }
}
