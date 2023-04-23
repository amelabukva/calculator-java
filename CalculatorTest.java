import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    
    @Test
    void testCalculate() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(2.0f, 3.0f, 5.0f));
        List<String> operations = new ArrayList<>(Arrays.asList("+","-", "*"));

        Calculator.calculate(numbers, operations);

        assertEquals(0.0f, Calculator.finalResult, 0.01f);
    }
}





