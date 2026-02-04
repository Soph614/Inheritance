import java.util.ArrayList;
import java.util.Iterator;

public class InheritanceDemo {
    public static void main (String[] args) {
        ArrayList<Worker> workerRecords = new ArrayList<>();
        boolean done = false;
        double jamesPay;
        double joycePay;
        double jillPay;
        double jeffPay;
        double jamiePay;
        double ericPay;
        Worker james = new Worker("123451", "James", "Falcon", "Mr.", 1942, 14.00);
        Worker joyce = new Worker("123452", "Joyce", "Falcon", "Mrs.", 1944, 10.0);
        Worker jill = new Worker("123455", "Jill", "Falcon", "Ms.", 1974, 14.00);
        SalaryWorker jeff = new SalaryWorker("123453", "Jeff", "Falcon", "Mr.", 1967, 16.00, 33280);
        SalaryWorker jamie = new SalaryWorker("123454", "Jamie", "Falcon", "Ms.", 1969, 15.00, 31200);
        SalaryWorker eric = new SalaryWorker("123763", "Eric", "Hawk", "Mr.", 1976, 15.50, 32240);
        workerRecords.add(james);
        workerRecords.add(joyce);
        workerRecords.add(jill);
        workerRecords.add(jeff);
        workerRecords.add(jamie);
        workerRecords.add(eric);

        ArrayList<Double> hoursPerWeek = new ArrayList<>(); // stores the number of hours per week everyone worked
        hoursPerWeek.add(40.0); // week 1
        hoursPerWeek.add(50.0); // week 2
        hoursPerWeek.add(40.0); // week 3


        for(int i=0; i < hoursPerWeek.size(); i++) {
            double hoursForWeek = hoursPerWeek.get(i);
            int iPlusOne = i + 1; // So week one shows up as 1 and not 0, and so on.
            System.out.println("WEEK " + iPlusOne + " (" + hoursForWeek + " hours):");
            for (int j = 0; j < workerRecords.size(); j++) {
                Worker worker = workerRecords.get(j);
                double workerPay = worker.calculateWeeklyPay(hoursForWeek);
                System.out.printf("%-20s %8s\n", worker.fullName(), workerPay);
            }
            System.out.println();
        }

        /*
        System.out.println();
        System.out.println("WEEK 1: 40 hours");
        double hoursWorked = 40;
        jamesPay = james.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", james.fullName(), jamesPay);
        joycePay = joyce.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", joyce.fullName(), joycePay);
        jillPay = jill.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", jill.fullName(), jillPay);
        jeffPay = jeff.calculateWeeklyPay(jeff.annualSalary);
        System.out.printf("%-20s %8s\n", jeff.fullName(), jeffPay);
        jamiePay = jamie.calculateWeeklyPay(jamie.annualSalary);
        System.out.printf("%-20s %8s\n", jamie.fullName(), jamiePay);
        ericPay = eric.calculateWeeklyPay(eric.annualSalary);
        System.out.printf("%-20s %8s\n", eric.fullName(), ericPay);

        System.out.println();
        System.out.println("WEEK 2: 50 hours");
        hoursWorked = 50;
        jamesPay = james.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", james.fullName(), jamesPay);
        joycePay = joyce.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", joyce.fullName(), joycePay);
        jillPay = jill.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", jill.fullName(), jillPay);
        jeffPay = jeff.calculateWeeklyPay(jeff.annualSalary);
        System.out.printf("%-20s %8s\n", jeff.fullName(), jeffPay);
        jamiePay = jamie.calculateWeeklyPay(jamie.annualSalary);
        System.out.printf("%-20s %8s\n", jamie.fullName(), jamiePay);
        ericPay = eric.calculateWeeklyPay(eric.annualSalary);
        System.out.printf("%-20s %8s\n", eric.fullName(), ericPay);

        System.out.println();
        System.out.println("WEEK 3: 40 hours");
        hoursWorked = 40;
        jamesPay = james.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", james.fullName(), jamesPay);
        joycePay = joyce.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", joyce.fullName(), joycePay);
        jillPay = jill.calculateWeeklyPay(hoursWorked);
        System.out.printf("%-20s %8s\n", jill.fullName(), jillPay);
        jeffPay = jeff.calculateWeeklyPay(jeff.annualSalary);
        System.out.printf("%-20s %8s\n", jeff.fullName(), jeffPay);
        jamiePay = jamie.calculateWeeklyPay(jamie.annualSalary);
        System.out.printf("%-20s %8s\n", jamie.fullName(), jamiePay);
        ericPay = eric.calculateWeeklyPay(eric.annualSalary);
        System.out.printf("%-20s %8s\n", eric.fullName(), ericPay);

         */

    }
}
