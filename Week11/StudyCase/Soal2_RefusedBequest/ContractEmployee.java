class ContractEmployee extends Employee implements SalaryCalculable, LeaveApplicable {
    
    public ContractEmployee(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void calculateSalary() {
        System.out.println("Contract salary calculated for " + name);
    }
    
    @Override
    public void applyLeave() {
        System.out.println("Limited leave applied for " + name);
    }
}