public class TestingClass {
    public static void main (String[] args) {
        Worker test = new Worker("123451", "James", "Falcon", "Esq.", 1942, 14.00);
        System.out.println(test.toString());
        System.out.println(test.toJSON());
        SalaryWorker test2 = new SalaryWorker("123451", "James", "Falcon", "Esq.", 1942, 14.0, 29120);
        System.out.println(test2.displayWeeklyPay(29120));
        System.out.println(test2.toCSV());
        System.out.println(test2.toJSON());
        System.out.println(test2.toXML());
        System.out.println(test2.toString());
    }
}
