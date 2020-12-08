package Chapter3;

public class EmployeeClass {
    String firstName;
    String lastName;
    double monthlySalary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0)
            System.out.println("Invalid input");
        else
            this.monthlySalary = monthlySalary;
    }
    public double yearlySalary() {
        double yearlySalary = 12 * monthlySalary;
        return yearlySalary;
    }
    public double yearlySalaryIncrement() {
        double yearlyPercentIncrease = (10 * 1.0)/100;
        double increment = yearlyPercentIncrease * yearlySalary();
        double newYearlySalary = increment + yearlySalary();
        return newYearlySalary;
    }

    public EmployeeClass (String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass("", "", 0);
        employee.setFirstName("Billy");
        employee.setLastName("Audu");
        employee.setMonthlySalary(90);

        System.out.println("First name is: " + employee.getFirstName() +
                "\nLast name is: " + employee.getLastName() +
                "\nMonthly salary is: " + employee.getMonthlySalary() +
                "\nYearly salary is: " + employee.yearlySalary());
        System.out.println("The new yearly salary is: " + employee.yearlySalaryIncrement());

        System.out.println();
        System.out.println();
        System.out.println();

            EmployeeClass employee1 = new EmployeeClass("", "", 0);
            employee1.setFirstName("Amaka");
            employee1.setLastName("Anusionwu");
            employee1.setMonthlySalary(1000);

            System.out.println("First name is: " + employee1.getFirstName() +
                    "\nLast name is: " + employee1.getLastName() +
                    "\nMonthly salary is: " + employee1.getMonthlySalary() +
                    "\nYearly salary is: " + employee1.yearlySalary());
            System.out.println("The new yearly salary is: " + employee1.yearlySalaryIncrement());
    }
}
