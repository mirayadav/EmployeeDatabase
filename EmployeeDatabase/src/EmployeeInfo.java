
public class EmployeeInfo {
	protected int empNum;
	protected String firstName;
	protected String lastName;
	protected int sex; //encode 0 for M, 1 for F, etc.
	protected int workLoc; //encode 0 for Mississauga, etc.
	protected double deductRate; //0.21 for 21% gross income -21% of gross income = net worth
	
	//CONSTRUCTOR
	public EmployeeInfo(int eN, String fN, String lN, int s, int wL, double dR) {
		empNum = eN;
		firstName = fN;
		lastName = lN;
		sex = s;
		workLoc = wL;
		deductRate = dR;
	}
	
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getWorkLoc() {
		return workLoc;
	}
	public void setWorkLoc(int workLoc) {
		this.workLoc = workLoc;
	}
	public double getDeductRate() {
		return deductRate;
	}
	public void setDeductRate(double deductRate) {
		this.deductRate = deductRate;
	} 
	
	public void displayEmployee() {
		System.out.println("\n\nEmployee number " + empNum);
		System.out.println("First name " + firstName);
		System.out.println("Last name " + lastName);
		
		if (this instanceof PartTimeEmployee) {
			PartTimeEmployee thePTE = (PartTimeEmployee) this;
			System.out.println("Hourly wage is " + thePTE.getHourlyWage());
			System.out.println("Hours per week are " + thePTE.getHoursPerWeek());
			System.out.println("Weeks per year are " + thePTE.getWeeksPerYear());
			System.out.println("Annual gross income is " + thePTE.calcAnnualGrossIncome());;
			System.out.println("Annual net income is " + thePTE.calcAnnualNetIncome());
		}
		if (this instanceof FullTimeEmployee) {
			FullTimeEmployee theFTE = (FullTimeEmployee) this;
			System.out.println("Yearly salary is " + theFTE.getYearlySalary());
			System.out.println("Hours per week are " + theFTE.calcAnnualGrossIncome());
			System.out.println("Weeks per year are " + theFTE.calcAnnualNetIncome());
		}
	}


}
