class Intern extends Employee implements SalaryCalculable {
    
    public Intern(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void calculateSalary() {
        System.out.println("Intern salary calculated for " + name);
    }
}