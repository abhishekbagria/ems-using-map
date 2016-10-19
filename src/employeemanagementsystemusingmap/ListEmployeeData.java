package employeemanagementsystemusingmap;

import java.util.Map;
import java.util.TreeMap;

public class ListEmployeeData  {

	public static Map<Integer, EmployeeData> employData= new TreeMap<Integer, EmployeeData>();
	
	public void listEmpData() {
		if(employData.isEmpty()){
			System.out.print("There is nothing to Show.\n");
		}
		else{
//	ListEmployeeData li = new ListEmployeeData();
		//System.out.println("ID\tName\t\tDepartment\tAddress\t\t\t\t\t\t\t\t\tPhone No.\tDate of Birth"
			//	+ "\tSex\tMarital Status\tJob Title\tDesignation");
		
		for (Map.Entry<Integer, EmployeeData> data : employData.entrySet()) {
			
//			li = get(data);
			
			System.out.println(data.getKey()+" "+data.getValue().getEmpName()+" "+data.getValue().getEmpDept()+
					" "+data.getValue().getEmpAdr()+" "+data.getValue().getEmpPN()+
					" "+data.getValue().getEmpDoB()+" "+data.getValue().getEmpSex()+
					" "+data.getValue().getEmpMS()+" "+data.getValue().getEmpJT()+
					" "+data.getValue().getEmpDsgn());
			
			/*System.out.print(((EmployeeData) data).getEmpId()+"\t");
			System.out.print(((EmployeeData) data).getEmpName()+"\t");
			System.out.print(((EmployeeData) data).getEmpDept()+"\t\t");
			System.out.print(((EmployeeData) data).getEmpAdr()+"\t");
			System.out.print(((EmployeeData) data).getEmpPN()+"\t");
			System.out.print(((EmployeeData) data).getEmpDoB()+"\t");
			System.out.print(((EmployeeData) data).getEmpSex()+"\t");
			System.out.print(((EmployeeData) data).getEmpMS()+"\t");
			System.out.print(((EmployeeData) data).getEmpJT()+"\t");
			System.out.println(((EmployeeData) data).getEmpDsgn());*/
		}
		}
}
}