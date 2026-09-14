public class Main {
    public static void main(String[] args) {
        // First log
        System.out.println("Java Employees Project!");

        int managerCount = 0;
        int engineerCount = 0;
        int internCount = 0;
        
        Employee[] employees = {
            new Manager(),
            new Engineer(),
            new Manager(),
            new Intern(),
            new Intern(),
            new Manager(),
            new Engineer(),
            new Engineer(),
            new Engineer(),
            new Engineer()
        };

        for (int i=0; i<employees.length; i++){
            if (employees[i] instanceof Manager) {
                managerCount++;
            } else if (employees[i] instanceof Engineer) {
                engineerCount++;
            } else {
                internCount++;
            }
        }

        EmployeeReport report = new EmployeeReport(managerCount, engineerCount, internCount);
        System.out.println(
            String.format("Managers '%s'", report.getNumberOfManagers())
        );
        System.out.println(
            String.format("Engineers '%s'", report.getNumberOfEngineers())
        );
        System.out.println(
            String.format("Interns '%s'", report.getNumberOfInterns())
        );
    }
}

class Employee {}

class Manager extends Employee {}

class Engineer extends Employee {}

class Intern extends Employee {}

class EmployeeReport {
    private int numberOfManagers;
    private int numberOfEngineers;
    private int numberOfInterns;

    public EmployeeReport() {
        setNumberOfManagers(0);
        setNumberOfEngineers(0);
        setNumberOfInterns(0);
    }

    public EmployeeReport(int numberOfManagers, int numberOfEngineers, int numberOfInterns){
        setNumberOfManagers(numberOfManagers);
        setNumberOfEngineers(numberOfEngineers);
        setNumberOfInterns(numberOfInterns);
    }

    public int getNumberOfManagers() {
        return numberOfManagers;
    }

    public void setNumberOfManagers(int numberOfManagers) {
        this.numberOfManagers = numberOfManagers;
    }

    public int getNumberOfEngineers() {
        return numberOfEngineers;
    }

    public void setNumberOfEngineers(int numberOfEngineers) {
        this.numberOfEngineers = numberOfEngineers;
    }

    public int getNumberOfInterns() {
        return numberOfInterns;
    }

    public void setNumberOfInterns(int numberOfInterns) {
        this.numberOfInterns = numberOfInterns;
    }
}