
public class TestHashTable {
	public static void main(String[] args) {
	    	int numOfBoxes = 2;
	    	MyHashTable firstHashTable = new MyHashTable(numOfBoxes);
	    	EmployeeInfo Employee = new FullTimeEmployee(1203, "Mira", "Yadav", 1, 0, 0.21, 20000);
	    	firstHashTable.addEmployee(Employee);
	    	Employee = new PartTimeEmployee(125, "Parita", "Yadav", 1, 0, 0.48, 10, 40, 40);
	    	firstHashTable.addEmployee(Employee);
	    	Employee = new FullTimeEmployee(129, "Gita", "Yadav", 1, 0, 0.30, 250000);
	    	firstHashTable.addEmployee(Employee);
	    	Employee = new PartTimeEmployee(332, "Paresh", "Yadav", 0, 0, 0.12, 120, 40, 50);
	    	firstHashTable.addEmployee(Employee);
	    	firstHashTable.displayContents();
	    	firstHashTable.searchByEmployeeNumber(125);
	    	EmployeeInfo theEmp = firstHashTable.removeEmployee(125);
	    	theEmp.displayEmployee();
	    	firstHashTable.displayContents();
    	
    }

}
