package employeemanagementsystemusingmap;
import java.util.Map;
import java.util.Scanner;

public class UpdateEmployeeData {
	Scanner cin = new Scanner(System.in);
	String empName; // Name of the Employee
	String empDept; // Department of the Employee
	String empAdr; // Address of the Employee
	String empPN; // Phone Number of the Employee
	String empDoB; // Date of birth of the Employee
	String empSex; // Sex of the Employee
	String empMS; // Marriage Status of the Employee
	String empJT; // Job Title of the Employee
	String empDsgn; // Designation of the EMployee
	public void updateEmpData() {
		
		int empId,option,flag=0;
		System.out.print("Please Enter the Employee ID whose data You want to Update :");
		empId = cin.nextInt();
		
		AddEmployeeName name = new AddEmployeeName();
		AddEmployeeAddress adr = new AddEmployeeAddress();
		AddEmployeeDateOfBirth dob = new AddEmployeeDateOfBirth();
		
		
for (Map.Entry<Integer,EmployeeData> data: ListEmployeeData.employData.entrySet()) {
	if(data.getKey()==empId){
					flag=1;
				System.out.print("\nEmployee Found.\nPlease Enter:"
						+ "\n1. To update Name"
						+ "\n2. To Update Department"
						+ "\n3. To Update Address"
						+ "\n4. To Update Phone Number"
						+ "\n5. To Update Date of Birth"
						+ "\n6. To Update Sex"
						+ "\n7. To Update Marital Status"
						+ "\n8. To Update Job Title"
						+ "\n9. To Update DesignEation"
						+ "\nYour Choice: ");
				option = cin.nextInt();
				switch(option){
				case 1:
					empName = name.addEmployeeName(cin);
					data.getValue().setEmpName(empName);
					break;
				case 2:
					System.out.print("Please Enter the Employee Department: ");
					empDept = cin.next();
					data.getValue().setEmpDept(empDept);
					break;
				case 3:
					empAdr = adr.addEmployeeAddress(cin);
					data.getValue().setEmpAdr(empAdr);
					break;
				case 4:
					System.out.print("Please Enter the Employee Phone No.: ");
					empPN = cin.next();
					data.getValue().setEmpPN(empPN);
					break;
				case 5:
					empDoB = dob.addEmployeeDoB(cin);
					data.getValue().setEmpDoB(empDoB);
					break;
				case 6:
					System.out.print("Please Enter the Employee Sex: ");
					empSex = cin.next();
					data.getValue().setEmpSex(empSex);
					break;
				case 7:
					System.out.print("Please Enter the Employee Marital Status: ");
					empMS = cin.next();
					data.getValue().setEmpMS(empMS);
					break;
				case 8:
					System.out.print("Please Enter the Employee Job Title: ");
					empJT = cin.next();
					data.getValue().setEmpJT(empJT);
					break;
				case 9:
					System.out.print("Please Enter the Employee Designation: ");
					empDsgn = cin.next();
					data.getValue().setEmpDsgn(empDsgn);
					break;
				default:
					System.out.print("You dont want to update anything.");
					break;
				}
			}
		}
		if(flag==0){
			System.out.print("Employee ID not Found: Could Not Be Updated");
		}
	}
}
