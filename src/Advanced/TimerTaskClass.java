package Advanced;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskClass {
  public static void main(String[] args) {
      Timer timer = new Timer();
//      TimerTask task = new TimerTask() {
//          @Override
//          public void run() {
//              System.out.println("Task is complete");
//          }
//      };
//      timer.schedule(task,3000);

      TimerTask task = new TimerTask() {
          @Override
          public void run() {
              System.out.println("Hello");
          }
      };

      Calendar date = Calendar.getInstance();
      date.set(Calendar.YEAR, 2024);
      date.set(Calendar.MONTH, Calendar.JANUARY);
      date.set(Calendar.DAY_OF_MONTH,24);
      date.set(Calendar.HOUR_OF_DAY,8);
      date.set(Calendar.MINUTE,39);
      date.set(Calendar.SECOND, 50);
      date.set(Calendar.MILLISECOND, 0);

      timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }

}
