import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker jim;

    @BeforeEach
    void setUp() {
        jim = new Worker("123451", "James", "Falcon", "Esq.", 1942, 14.00);
    }

    @Test
    void calculateWeeklyPayTest() {
        assertEquals(560, jim.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPayTest() {
        assertEquals("Normal Hours: 40.0\n" +
                            "Normal Pay: 560.0\n" +
                            "Overtime Hours: 20.0\n" +
                            "Overtime Pay: 420.0\n" +
                            "Total Pay: 980.0", jim.displayWeeklyPay(60));
    }

    @Test
    void toStringTest() {
        assertEquals("Worker{Person{ID='123451', " +
                    "firstName='James', " +
                    "lastName='Falcon', " +
                    "title='Esq.', " +
                    "YOB=1942}" +
                    ", hourlyPayRate=14.0}", jim.toString());
    }

    @Test
    void toCSVTest() {
        assertEquals("123451, James, Falcon, Esq., 1942, 14.0", jim.toCSV());
    }

    @Test
    void toJSONTest() {
        char DQ = '\u0022';
        assertEquals("{{" + DQ + "ID" + DQ + ":" + DQ + "123451" + DQ + ", "
                    + DQ + "firstName" + DQ + ":" + DQ + "James" + DQ + ", "
                    + DQ + "lastName" + DQ + ":" + DQ + "Falcon" + DQ + ", "
                    + DQ + "title" + DQ + ":" + DQ + "Esq." + DQ + ", "
                    + DQ + "YOB" + DQ + ":" + DQ + "1942" + DQ + "}, "
                    + DQ + "hourlyPayRate" + DQ + ":" + DQ + "14.0" + DQ + "}", jim.toJSON());
    }

    @Test
    void toXMLTest() {
        assertEquals("<Worker><Person><ID>123451</ID><firstName>James</firstName><lastName>Falcon</lastName><title>Esq.</title><YOB>1942</YOB></Person><hourlyPayRate>14.0</hourlyPayRate></Worker>", jim.toXML());
    }
}