public class SalaryWorker extends Worker {
    double annualSalary;

    /**
     * Person
     * Makes a person data record based on an inputted
     * ID number, first name, last name, title, and YOB.
     *
     * @param ID            is the person's ID number
     * @param firstName     is the person's first name
     * @param lastName      is the person's last name
     * @param title         is the person's title
     * @param YOB           is the person's YOB
     * @param hourlyPayRate
     */
    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary/52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = annualSalary/52;
        return "Weekly pay (1/52th of annual salary, " + annualSalary + ") is " + weeklyPay + ".";
    }

    @Override
    public String toString() {
        return "SalaryWorker{" + super.toString() +
                ", annualSalary=" + annualSalary +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.annualSalary;
    }

    @Override
    public String toJSON() {
        char DQ = '\u0022';
        return "{" + super.toJSON() + ", " + DQ + "annualSalary" + DQ + ":" + DQ + this.annualSalary + DQ + "}";
    }

    @Override
    public String toXML() {
        return "<SalaryWorker>" + super.toXML() + "<annualSalary>" + this.annualSalary + "</annualSalary></SalaryWorker>";
    }
}
