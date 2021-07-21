package javaio.employeepayrollservice;

import java.util.List;
import java.util.Scanner;

public class EmployeePayrollImpl {

	public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
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

    public void writeEmployeePayrollData(IOService ioService)
    {
    	if (ioService.equals(IOService.CONSOLE_IO))
        {
            System.out.println("\nWriting Employee Payroll To Console:\n" + employeePayrollDataList);
        }
        else if (ioService.equals(IOService.FILE_IO))
        {
            new EmployeePayrollFileIOService().writeData(employeePayrollDataList);
        }
    }
    public void printData(IOService ioService)
    {
        if (ioService.equals(IOService.FILE_IO))
        {
            new EmployeePayrollImpl(employeePayrollDataList).printData(ioService);
        }
    }
    
    public long countEntries(IOService ioService)
    {
        if (ioService.equals(IOService.FILE_IO))
        {
            return new EmployeePayrollImpl(employeePayrollDataList).countEntries(ioService);
        }
        return 0;
    }

    public long readEmployeePayrollData(IOService ioService)
    {
        if (ioService.equals(IOService.FILE_IO))
        {
            this.employeePayrollDataList = new EmployeePayrollFileIOService().readData();
            return employeePayrollDataList.size();
        }
        return 0;
    }
	
}
