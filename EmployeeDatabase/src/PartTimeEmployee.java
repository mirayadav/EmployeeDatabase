
public class PartTimeEmployee extends EmployeeInfo {
	
	//ATTRIBUTES
	
	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	//CONSTRUCTOR

	public PartTimeEmployee(int eN, String fN, String lN, int s, int wL, double dR, double hW, double hPW, double wPY) {
		super(eN, fN, lN, s, wL, dR);
		hourlyWage = hW;
		hoursPerWeek = hPW;
		weeksPerYear = wPY;
	}
	
	//METHODS
	
	public double calcAnnualGrossIncome() {
		return(hourlyWage * hoursPerWeek * weeksPerYear);
	}
	
	public double calcAnnualNetIncome() {
		return((hourlyWage * hoursPerWeek * weeksPerYear) - (1-deductRate));
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getWeeksPerYear() {
		return weeksPerYear;
	}

	public void setWeeksPerYear(double weeksPerYear) {
		this.weeksPerYear = weeksPerYear;
	}
}
