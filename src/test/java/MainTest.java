
import org.example.Employee;
import org.example.Main;
import org.example.Util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Util utilMock;

    @BeforeEach
    void setUp() {
        utilMock = new Util();
    }

    @Test
    void main() {
        Employee mockEmployee = new Employee("John", 30, 5000, "IT");
        Main.main(new String[]{});

    }
}