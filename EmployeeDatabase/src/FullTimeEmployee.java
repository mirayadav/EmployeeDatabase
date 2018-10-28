
public class FullTimeEmployee extends EmployeeInfo {

	//ATTRIBUTES 
	
	private double yearlySalary;
	
	//CONSTRUCTOR

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public FullTimeEmployee(int eN, String fN, String lN, int s, int wL, double dR, double yS) {
		super(eN, fN, lN, s, wL, dR);
		yearlySalary = yS;
	}
	
	//METHODS
	
	public double calcAnnualGrossIncome() {
		return(yearlySalary);
	}
	
	public double calcAnnualNetIncome() {
		return(yearlySalary * (1-deductRate));
	}
	
	public double getYearlySalary() {
		return yearlySalary;
	}
		
}
