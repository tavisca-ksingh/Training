package house;

import java.util.Date;

public class Devices {
    private String gadgets;
    private boolean currentState;
    private Date onTime;
    private Date offTIme;
    private long totalOnTime = 0;

    public Devices(String gadgets) {
        this.gadgets = gadgets;
        this.currentState = false;
    }

    public String getGadgets() {
        return gadgets;
    }

    public void changeState() {
        currentState = !currentState;
        if(currentState){
            onTime  =new Date();
        }
        else{
            offTIme = new Date();
        }
    }

    public boolean state() {
        return currentState;
    }


    public long getTotalOnTime() {
        return totalOnTime;
    }

    public void setTotalOnTime() {
        if(offTIme==null){
            offTIme = new Date();
        }
        long diff =offTIme.getTime() - onTime.getTime();
        long diffMinutes = Math.abs(diff ) / (60 * 1000) % 60;

        this.totalOnTime +=  diffMinutes;

      //  System.out.println(onTime  + " " + offTIme + " \n");
        System.out.println(getGadgets() + " " + getTotalOnTime() + " min");
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + gadgets + '\'' +
                ", currentState=" + currentState +
                '}';
    }
}
