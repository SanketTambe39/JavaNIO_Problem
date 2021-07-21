package javaio.employeepayrollservice;

import java.util.List;
import java.util.Scanner;

public class EmployeePayrollImpl {

	private List<EmployeePayrollData> employeePayrollDataList;

    public EmployeePayrollImpl(List<EmployeePayrollData> employeePayrollDataList)
    {
        this.employeePayrollDataList = employeePayrollDataList;
    }

    void readEmployeePayrollData(Scanner consoleInputReader)
    {
        System.out.print("Enter Employee-Id : ");
        int id = consoleInputReader.nextInt();
        System.out.print("Enter Employee-Name : ");
        String name = consoleInputReader.next();
        System.out.print("Enter Employee-Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollDataList.add(new EmployeePayrollData(id, name, salary));
    }

    void writeEmployeePayrollData()
    {
        System.out.println("\nWriting Employee Payroll To Console:\n" + employeePayrollDataList);
    }
	
}
