package employeemanagementsystemusingmap;

import java.util.Map;
import java.util.Scanner;

public class DeleteEmployeeData extends ListEmployeeData {
	Scanner cin = new Scanner(System.in);
	public void deleteEmpData() {
		
		if(ListEmployeeData.employData.isEmpty()){
			System.out.print("There is nothing to Delete");
		}
		else{
			int empId, flag=0;
		System.out.print("Please Enter the Employee ID whose data You want to Delete:");
		empId = cin.nextInt();
		aa:
			for(Map.Entry<Integer, EmployeeData> data : ListEmployeeData.employData.entrySet()){
			if(data.getKey()==empId){
				System.out.println("Employee ID Found");
				flag=1;
				break aa;}
		}
		
		System.out.println("Deleting...");
		employData.remove(empId);
		System.out.println("Deleted");
		if(flag==0)
			System.out.println("Employee ID Not Found");
		}
	}
}