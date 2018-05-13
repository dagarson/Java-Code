/*Population Projection.

*The U.S. Census Bureau projects population based on the following assumptions:

*	One birth every 7 seconds
*	One death every 13 seconds
*	One new immigrant every 45 seconds

*Task #1: Write a program to display the population for each of the next five years. Assume the
*current population is 312,032,486 and one year has 365 days. 
*
*Hint*: In Java, if two
*integers perform division, the result is an integer. The fractional part is truncated. For
*example, __5__ / __4__ is __1__ (not __1.25__) and __10__ / __4__ is __2__ (not __2.5__). To get an accurate result with
*the fractional part, one of the values involved in the division must be a number with a
*decimal point. For example, __5.0__ / __4__ is __1.25__ and __10__ / __4.0__ is __2.5__.
 */


public class Polulation {

    public static void main(String[] strings) {
    	
    	//Rate of population growth or decay
        double BirthRate = 7.0;
        double DeathRate = 13.0;
        double ImmigrantRate = 45.0;


        //Original population 
        double CurrentPopulation = 312032486;
        
        double SecondsInYears = 31536000;
        
        //Births 
        double NumberBirths = SecondsInYears / BirthRate;
        
        //Deaths
        double NumberDeaths = SecondsInYears / DeathRate;
        
        //Immigrants
        double NumberImmigrants = SecondsInYears / ImmigrantRate;

        for (int i = 1; i <= 5; i++) {
            CurrentPopulation += NumberBirths + NumberImmigrants - NumberDeaths;
            
            //display years 1-5 to console
            System.out.println("Year " + i + " = " + (int)CurrentPopulation);

        }


    }
}