import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        // Создаем IndexStorage с размером 10
        IndexStorage idxSt = new IndexStorage(10);
        System.out.println("IndexStorage вывод через get() прямой порядок:");
        for (int i = 0; i < idxSt.size(); i++) {
            System.out.println(idxSt.get(i) );
        }
        System.out.println("IndexStorage вывод через reverse():");
        System.out.println(Arrays.toString(idxSt.reverse()));

        // Создаем ArrayIndexStorage с размером
        ArrayIndexStorage arrIdxSt = new ArrayIndexStorage(new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("ArrayIndexStorage вывод через get() прямой порядок:");
        for (int i = 0; i < arrIdxSt.size(); i++) {
            System.out.println(arrIdxSt.get(i) );
        }
        System.out.println("ArrayIndexStorage вывод через reverse():");
        System.out.println(Arrays.toString(arrIdxSt.reverse()));
    }
}