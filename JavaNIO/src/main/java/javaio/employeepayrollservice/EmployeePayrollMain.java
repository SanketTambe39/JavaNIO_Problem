package javaio;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollMain {

	public static void main(String[] args)
    {
        ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        EmployeePayrollImpl employeePayrollImpl = new EmployeePayrollImpl(employeePayrollDataList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollImpl.readEmployeePayrollData(consoleInputReader);
        employeePayrollImpl.writeEmployeePayrollData();
    }
}
