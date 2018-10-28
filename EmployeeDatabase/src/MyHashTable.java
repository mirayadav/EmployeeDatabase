import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	private ArrayList<EmployeeInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}

	
	// METHODS

	public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
	

	
	public boolean addEmployee(EmployeeInfo theEmployee) {
		buckets[this.calcBucket(theEmployee.getEmpNum())].add(theEmployee);
		return(true);
		// Add the employee to the hash table.  Return true if employee is added successfully,
		// return false otherwise.
	}

	
	
	public int searchByEmployeeNumber(int employeeNum) {
        int listSize = buckets[this.calcBucket(employeeNum)].size();
		for (int i = 0; i < listSize; i++) {
            if (buckets[this.calcBucket(employeeNum)].get(i).empNum == employeeNum) {
            	return i;
            }
		}
		return -1;
		// Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
		// If the employee is not found, return -1.
	}

	
	
	public EmployeeInfo removeEmployee(int employeeNum) {
		if (this.searchByEmployeeNumber(employeeNum) != -1) {
			EmployeeInfo toRemove =  buckets[this.calcBucket(employeeNum)].get(this.searchByEmployeeNumber(employeeNum));
			buckets[this.calcBucket(employeeNum)].remove(this.searchByEmployeeNumber(employeeNum));
			return(toRemove);
		}
		else {
			return(null);
		}
		// Remove the employee from the hash table and return the reference to that employee.
		// If the employee is not in the hash table, return null.
	}

	
	
	public void displayContents() {
		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.
		
		for (int i = 0; i < buckets.length; i++) {

		    // For the current bucket, print out the emp num for each item
                    // in its ArrayList.

                    System.out.println("\nExamining the ArrayList for bucket " + i);
                    int listSize = buckets[i].size();
                    if (listSize == 0) {
		        System.out.println("  Nothing in its ArrayList!");
                    }
                    else {
                        for (int j = 0; j < listSize; j++) {
                           int theEmpNum = buckets[i].get(j).getEmpNum();
                           System.out.println("  Employee " + theEmpNum);
                        }
                    }

                }

	} // end displayContents
	
} // end class MyHashTable

