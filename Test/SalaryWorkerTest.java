import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker james;

    @BeforeEach
    void setUp() {
        james = new SalaryWorker("123451", "James", "Falcon", "Esq.", 1942, 14.0, 29120);
    }

    @Test
    void calculateWeeklyPayTest() {
        assertEquals(560.0, james.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPayTest() {
        assertEquals("Weekly pay (1/52th of annual salary, 29120.0) is 560.0.", james.displayWeeklyPay(40));
    }

    @Test
    void toStringTest() {
        assertEquals("SalaryWorker" +
                    "{Worker" +
                    "{Person" +
                    "{ID='123451', " +
                    "firstName='James', " +
                    "lastName='Falcon', " +
                    "title='Esq.', " +
                    "YOB=1942}, " +
                    "hourlyPayRate=14.0}, " +
                    "annualSalary=29120.0}", james.toString());
    }

    @Test
    void toCSVTest() {
        assertEquals("123451, James, Falcon, Esq., 1942, 14.0, 29120.0", james.toCSV());
    }

    @Test
    void toJSONTest() {
        char DQ = '\u0022';
        assertEquals("{{{" + DQ + "ID" + DQ + ":" + DQ + "123451" + DQ + ", "
                + DQ + "firstName" + DQ + ":" + DQ + "James" + DQ + ", "
                + DQ + "lastName" + DQ + ":" + DQ + "Falcon" + DQ + ", "
                + DQ + "title" + DQ + ":" + DQ + "Esq." + DQ + ", "
                + DQ + "YOB" + DQ + ":" + DQ + 1942 + DQ + "}, "
                + DQ + "hourlyPayRate" + DQ + ":" + DQ + 14.0 + DQ + "}, "
                + DQ + "annualSalary" + DQ + ":" + DQ + 29120.0 + DQ + "}", james.toJSON());
    }

    @Test
    void toXMLTest() {
        assertEquals("<SalaryWorker>" +
                    "<Worker>" +
                    "<Person>" +
                    "<ID>123451</ID>" +
                    "<firstName>James</firstName>" +
                    "<lastName>Falcon</lastName>" +
                    "<title>Esq.</title>" +
                    "<YOB>1942</YOB>" +
                    "</Person>" +
                    "<hourlyPayRate>14.0</hourlyPayRate>" +
                    "</Worker>" +
                    "<annualSalary>29120.0</annualSalary>" +
                    "</SalaryWorker>", james.toXML());

    }
}