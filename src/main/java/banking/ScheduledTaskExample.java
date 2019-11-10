package banking;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskExample {
    private final ScheduledExecutorService scheduler = Executors
            .newScheduledThreadPool(1);

    public void startScheduleTask() {

        final ScheduledFuture<?> taskHandle = scheduler.scheduleAtFixedRate(
                new Runnable() {
                    public void run() {
                        try {
                         SavingAccount savingAccount = new SavingAccount();
                         savingAccount.checkMinimumBalance();
                        }catch(Exception ex) {
                            ex.printStackTrace(); //or loggger would be better
                        }
                    }
                }, 0, 1, TimeUnit.MINUTES);
    }




}