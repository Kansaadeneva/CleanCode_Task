public class FullTimeEmployee extends Employee implements SalaryCalculable, LeaveApplicable {
    
    public FullTimeEmployee(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void calculateSalary() {
        System.out.println("Full-time salary calculated for " + name);
    }
    
    @Override
    public void applyLeave() {
        System.out.println("Leave applied for " + name);
    }
}