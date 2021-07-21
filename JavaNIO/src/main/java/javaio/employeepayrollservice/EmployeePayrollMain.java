package javaio.employeepayrollservice;

import java.util.ArrayList;
import java.util.Scanner;

import javaio.employeepayrollservice.EmployeePayrollImpl.IOService;

public class EmployeePayrollMain {

	public static void main(String[] args)
    {
        ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        EmployeePayrollImpl employeePayrollImpl = new EmployeePayrollImpl(employeePayrollDataList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollImpl.readEmployeePayrollData(consoleInputReader);
    }
}
