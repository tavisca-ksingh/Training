package banking;


public class SavingAccount extends Account {
    ScheduledTaskExample ste = new ScheduledTaskExample();

    @Override
    public void openAccount() {
        super.openAccount();
        ste.startScheduleTask();
    }

    public void checkMinimumBalance(){
        showAccount();
    }

}

