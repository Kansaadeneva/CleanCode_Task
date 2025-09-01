public class CodeConventionClean {
    public static void main(String[] args) {
        System.out.println("=== Program Hitung Gaji ===");

        Employee employee1 = new Employee();
        employee1.calculateSalary("Budi", 40, 50000);

        Employee employee2 = new Employee();
        employee2.calculateSalary("Ani", 38, 45000);

        Manager manager = new Manager("Toni", 60000, 45);
        manager.calculateSalary();
    }
}

class Employee {
    void calculateSalary(String name, int workHours, int hourlyRate) {
        int totalSalary = workHours * hourlyRate;
        System.out.println("Nama: " + name + " | Gaji: " + totalSalary);
    }
}

class Manager {
    private String name;
    private int salaryPerHour;
    private int workHours;

    public Manager(String name, int salaryPerHour, int workHours) {
        this.name = name;
        this.salaryPerHour = salaryPerHour;
        this.workHours = workHours;
    }

    public void calculateSalary() {
        int totalSalary = salaryPerHour * workHours;
        System.out.println("Manager Name: " + name + " | Gaji: " + totalSalary);
    }
}
