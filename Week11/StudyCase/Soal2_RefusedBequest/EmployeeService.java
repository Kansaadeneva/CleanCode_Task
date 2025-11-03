class EmployeeService {
    
    public void processSalary(SalaryCalculable employee) {
        employee.calculateSalary();
    }
    
    public void processLeave(LeaveApplicable employee) {
        employee.applyLeave();
    }
    
    public void processLeaveRequest(LeaveApplicable employee) {
        System.out.println("Processing leave request...");
        employee.applyLeave();
    }
}