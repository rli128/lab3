import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
	@Test 
	public void testFilter() {
    StringChecker sc = new StringChecker() {

        @Override
        public boolean checkString(String s) {
            return false;
        }
    };
    List<String> input1 = new ArrayList<>();
    ListExamples.filter(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
    
}