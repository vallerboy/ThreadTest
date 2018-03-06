import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class NewThread {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);


        AtomicBoolean cos = new AtomicBoolean(false);

        executorService.scheduleAtFixedRate(() -> {if(!cos.get())  System.out.println("Hejo2");}
        , 0, 2000, TimeUnit.MILLISECONDS);


        executorService.schedule(() -> {
            cos.set(true);
        }, 10000, TimeUnit.MILLISECONDS);

    }
}
