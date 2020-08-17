

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class EmployeeModel {
	
	private String empId;
	private String empName;
	private int empAge;
	private int empSalary;
	
	
	 
	 public EmployeeModel() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

	
	

	public EmployeeModel(String empId, String empName, int empAge, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {

		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {

		this.empAge = empAge;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {

		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return " Employee Id=" + empId + ",    Employee Name=" + empName + ",     Employee Age=" + empAge + ",     Employee Salary="
				+ empSalary + "";
	}

	
	

	

}
