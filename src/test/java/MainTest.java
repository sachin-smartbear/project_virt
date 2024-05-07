
import org.example.Company;
import org.example.CompanyUtil;
import org.example.Employee;
import org.example.Main;
import org.example.Util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Util utilMock;
    private CompanyUtil companyUtilMock;

    @BeforeEach
    void setUp() {
        utilMock = new Util();
        companyUtilMock = new CompanyUtil();
        Main.util = utilMock;
        Main.companyUtil = companyUtilMock;
    }

    @Test
    void main() {
        Employee mockEmployee = new Employee("John", 30, 5000, "IT");
        Company mockCompany = new Company("ABC", "IT", "India", "Bangalore");
        Main.main(new String[]{});

    }
}