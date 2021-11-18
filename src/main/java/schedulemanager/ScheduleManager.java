package schedulemanager;


import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton
public class ScheduleManager {
     @Schedule(hour = "*", minute = "*/10", second = "*")
     private void calcAlgo() {
        HttpConnector.requestRoutesCalc();
     }
}