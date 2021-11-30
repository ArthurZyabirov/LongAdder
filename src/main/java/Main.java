import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        LongAdder shop1 = new LongAdder();
        LongAdder shop2 = new LongAdder();
        LongAdder shop3 = new LongAdder();
        IntStream.range(0, 500).forEach(shop1::add);
        IntStream.range(0, 500).forEach(shop2::add);
        IntStream.range(0, 500).forEach(shop3::add);
        sleep(6000);
        System.out.println("\nРезультат: " + (shop1.sum() + shop2.sum() + shop3.sum()));
    }
}
