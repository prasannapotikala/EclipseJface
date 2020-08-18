

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.View;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class Employee {

 int flag = 1;
private int empId;
private String empName;
private int empAge;
private Double empSalary;
String gender;

private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
           this);

public Employee() {
super();
// TODO Auto-generated constructor stub
}
   
   public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
       propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
   }

   public void removePropertyChangeListener(PropertyChangeListener listener) {
       propertyChangeSupport.removePropertyChangeListener(listener);
   }




public Employee(int empId, String empName, int empAge, Double empSalary , String gender) {
super();
this.empId = empId;
this.empName = empName;
this.empAge = empAge;
this.empSalary = empSalary;
this.gender = gender;
}

public int getEmpId() {
return empId;
}

public void setEmpId(int eId) {
propertyChangeSupport.firePropertyChange("empId", this.empId,this.empId = eId);
//this.empId = empId;
}

public String getEmpName() {
return empName;
}

public void setEmpName(String empName) {
propertyChangeSupport.firePropertyChange("empName", this.empName,this.empName = empName);

//this.empName = empName;
}

public int getEmpAge() {
return empAge;
}

public void setEmpAge(int empAge) {
propertyChangeSupport.firePropertyChange("EmpAge", this.empAge,this.empAge = empAge);

//this.empAge = empAge;
}

public Double getEmpSalary() {
return empSalary;
}

public void setEmpSalary(double salary) {
propertyChangeSupport.firePropertyChange("empSalary", this.empSalary,this.empSalary = salary);

//this.empSalary = empSalary;
}



public String getGender() {
	return gender;
}

public void setGender(String gender) {
	propertyChangeSupport.firePropertyChange("gender", this.gender,this.gender= gender);

	//this.gender = gender;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
			+ ", gender=" + gender + ", propertyChangeSupport=" + propertyChangeSupport + "]";
}









}