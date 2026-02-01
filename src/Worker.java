public class Worker extends Person {
    double hourlyPayRate;

    /**
     * Person
     * Makes a person data record based on an inputted
     * ID number, first name, last name, title, and YOB.
     *
     * @param ID        is the person's ID number
     * @param firstName is the person's first name
     * @param lastName  is the person's last name
     * @param title     is the person's title
     * @param YOB       is the person's YOB
     */
    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = 0;
        if (hoursWorked >= 0 && hoursWorked <= 40) {
            weeklyPay = hoursWorked * hourlyPayRate;
        }
        else if (hoursWorked > 40) {
            double hourlyPayRate = this.hourlyPayRate;
            double overTimePayRate = hourlyPayRate * 1.5;
            double overTime = hoursWorked - 40;
            double overTimePay = overTime * overTimePayRate;
            double normalPay = 40 * hourlyPayRate;
            weeklyPay = normalPay + overTimePay;
        }
        else {
            System.out.println("You can't work negative hours!");
        }
        return weeklyPay;
    }

    String displayWeeklyPay (double hoursWorked) {
        double hourlyPayRate = this.hourlyPayRate;
        double normalHours = 40;
        double normalPay = 0;
        double overTimePayRate = hourlyPayRate * 1.5;
        double overTimeHours = 0;
        double overTimePay = 0;
        double weeklyPay = 0;
            if (hoursWorked >= 0 && hoursWorked <= 40) {
                normalHours = hoursWorked;
                weeklyPay = hoursWorked * hourlyPayRate;
                overTimeHours = 0;
            }
            else if (hoursWorked > 40) {
                // (normalHours still 40 as initialized)
                overTimeHours = hoursWorked - 40;
                overTimePay = overTimeHours * overTimePayRate;
                normalPay = 40 * hourlyPayRate;
                weeklyPay = normalPay + overTimePay;
            }
            else {
                System.out.println("You can't work negative hours!");
            }
        return "Normal Hours: " + normalHours +
                "\nNormal Pay: " + normalPay +
                "\nOvertime Hours: " + overTimeHours +
                "\nOvertime Pay: " + overTimePay +
                "\nTotal Pay: " + weeklyPay;
    }


    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + hourlyPayRate;
    }

    @Override
    public String toJSON() {
        char DQ = '\u0022';
        return "{" + super.toJSON() + ", " + DQ + "hourlyPayRate" + DQ + ":" + DQ + this.hourlyPayRate + DQ + "}";
    }

    public String toXML() {
        return "<Worker>" +
                super.toXML() +
                "<hourlyPayRate>" + this.hourlyPayRate + "</hourlyPayRate>" +
                "</Worker>";
    }
}
