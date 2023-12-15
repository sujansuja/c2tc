package JDBC_Demo;

public class Excecutor {

	public static void main(String[] args) {
		StatementInterfaceDemo.showEmp();
		System.out.println("----------------------------------------------");
		System.out.println(StatementInterfaceDemo.updateEmpName(100, "Meha"));
		StatementInterfaceDemo.updateEmpSalary(3, 65000);
		System.out.println("-------------After Updating Name and Salary------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(5);
		StatementInterfaceDemo.deleteEmp(101);
		StatementInterfaceDemo.deleteEmp(102);
		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.closeConnection();

	}

}