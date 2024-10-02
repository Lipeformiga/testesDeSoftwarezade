import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceServiceTest2 {

    private PerformaceService2 performaceService = new PerformaceService2();

    private int[] generateRandomArray(int size){
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    @Test
    public void testSortPerformance(){

        int[] array1 = generateRandomArray(10000);
        int[] array2 = array1.clone();

        long startTime = System.nanoTime();
        performaceService.setArrayNative(array1);
        long endTime = System.nanoTime();
        long durationNative = endTime - startTime;
        System.out.println("Tempo para Array;sort(): "+ durationNative + " nanosegundos");

        startTime = System.nanoTime();
        performaceService.setArrayNative(array1);
        endTime = System.nanoTime();
        long durationBubbleSort = endTime - startTime;
        System.out.println("Tempo para Bubble Sort: "+ durationBubbleSort + " nanosegundos");

        assertTrue(isSorted(array1), "O array ordenado com Array.sort() deveria estar ordenado");
        assertTrue(isSorted(array2), "O array ordenado com Bubble Sort deveria estar ordenado");

        assertTrue(durationNative < durationBubbleSort, "Array.sort() deveria ser mais rápido que Bubble Sort");
    }
    private boolean isSorted (int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
}
