package javaiotest.employeepayrolltest;

import java.util.Arrays;

import org.junit.Test;

import javaio.employeepayrollservice.EmployeePayrollData;
import javaio.employeepayrollservice.EmployeePayrollImpl;

public class EmployeePayrollServiceTest {

	
	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps = { new EmployeePayrollData(1, "Naruto", 1000000.0),
				new EmployeePayrollData(2, "Hinata", 2000000.0), new EmployeePayrollData(3, "Sasuke", 3000000.0) };
		EmployeePayrollImpl employeePayrollService;
		employeePayrollService = new EmployeePayrollImpl(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollImpl.IOService.FILE_IO);
	}

}
