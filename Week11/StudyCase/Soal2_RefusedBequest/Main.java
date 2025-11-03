class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        
        System.out.println("=== Full-Time Employee ===");
        FullTimeEmployee fullTime = new FullTimeEmployee("John Doe", "FT001");
        service.processSalary(fullTime);
        service.processLeave(fullTime);
        
        System.out.println("\n=== Intern ===");
        Intern intern = new Intern("Jane Smith", "INT001");
        service.processSalary(intern);
        System.out.println("Intern cannot apply leave - prevented at compile time!");
        
        System.out.println("\n=== Contract Employee ===");
        ContractEmployee contract = new ContractEmployee("Bob Johnson", "CT001");
        service.processSalary(contract);
        service.processLeave(contract);
        
        // Demonstrasi polymorphism yang benar
        System.out.println("\n=== Batch Salary Processing ===");
        SalaryCalculable[] employees = {fullTime, intern, contract};
        for (SalaryCalculable emp : employees) {
            service.processSalary(emp);
        }
        
        System.out.println("\n=== Batch Leave Processing ===");
        LeaveApplicable[] leaveEligible = {fullTime, contract}; // Intern tidak masuk!
        for (LeaveApplicable emp : leaveEligible) {
            service.processLeave(emp);
        }
    }
}