/**
 * This class contains several methods for manipulating dates.
 * @author ADD YOUR NAME HERE
 * @version 1.0
 * Lab07 - DateManipulator
 * Fall 2018
 */
public class DateManipulator {

	/**
	 * Empty-argument constructor
	 */
	public DateManipulator() {
		
	}//end constructor
	
	public boolean isLeapYear(int Year){
	/**
	 * This method determines if a year is a leap year. Years 
	 * less than 1582 return -1 (not valid leap years). Otherwise
	 * the year must be evenly divisible by 4 or 400. However, years
	 * divisible by 100 are not leap years (although they are divisible
	 * by 4.
	 * @param year - four-digit integer representing a year.
	 * @return - true or false
	 */
	if(Year < 1582){
		return false;
	}
	else if(Year%4 !=0){
		return false;
	}
	else if(Year % 400 == 0){
		return true;
	}
	else if(Year % 100 == 0){
		return false;
	}
	else{
		return true;
	}
	}//end isLeapYear
}//end class