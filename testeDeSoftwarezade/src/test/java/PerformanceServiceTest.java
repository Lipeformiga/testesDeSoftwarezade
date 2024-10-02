import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceServiceTest {

    private PerformanceService performanceService = new PerformanceService();

    @Test
    public void testSortArrayPerformance(){
        int[]array = {5,2,8,14,1,16,7};
        long startTime = System.nanoTime();
        performanceService.sortArray(array);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        assertArrayEquals(new int[]{1,2,5,7,8,14,16}, array);

        System.out.println("Tempo de execução: "+ duration + " nanosegundos");
    }
}