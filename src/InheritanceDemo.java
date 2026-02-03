import java.util.ArrayList;

public class InheritanceDemo {
    public static void main (String[] args) {
        ArrayList<Worker> workerRecords = new ArrayList<>();
        Worker james = new Worker("123451", "James", "Falcon", "Mr.", 1942, 14.00);
        Worker joyce = new Worker("123452", "Joyce", "Falcon", "Mrs.", 1944, 10.0);
        Worker jill = new Worker("123455", "Jill", "Falcon", "Ms.", 1974, 14.00);
        SalaryWorker jeff = new SalaryWorker("123453", "Jeff", "Falcon", "Mr.", 1967, 16.00, 33280);
        SalaryWorker jamie = new SalaryWorker("123454", "Jamie", "Falcon", "Ms.", 1969, 15.00, 31200);
        SalaryWorker eric = new SalaryWorker("123763", "Eric", "Blue", "Mr.", 1976, 15.50, 32240);
        workerRecords.add(james);
        workerRecords.add(joyce);
        workerRecords.add(jill);
        workerRecords.add(jeff);
        workerRecords.add(jamie);
        workerRecords.add(eric);
        System.out.println(workerRecords);

    }
}
