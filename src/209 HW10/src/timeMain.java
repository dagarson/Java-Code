/* Daniel Garson 
 * CIS 209
 * 12/5/17
 */


public class timeMain {
    public static void main(String[] args) {
        Time time = new Time();
        Time time555550000 = new Time(555550000);

        System.out.print("Time1st = ");
        System.out.printf("%02d:%02d:%02d", time.hour(), time.minute(), time.second());
        
        //split the two outputs
        System.out.println();
        System.out.println("------------------");
        
        System.out.print("Time2nd = ");
        System.out.printf("%02d:%02d:%02d", time555550000.hour(), time555550000.minute(), time555550000.second());
    }

    //time class
    static class Time {
         int hours;
         int minutes;
         int seconds;

        Time() {
            this(System.currentTimeMillis());
        }

        Time(long timeMilliSec) {
            setTime(timeMilliSec);
        }

      
        void setTime(long elapseTime) {
            hours = (int) ((elapseTime / (1000 * 60 * 60)) % 24);
            minutes = (int) ((elapseTime / (1000 * 60)) % 60);
            seconds = (int) ((elapseTime / 1000) % 60);
        }

        
        int hour() {
            return hours;
        }

        int minute() {
            return minutes;
        }

        int second() {
            return seconds;
        }
    }
}