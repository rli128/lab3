import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceRicky() {
    int[] input1 = { 3, 2, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 2, 3 }, input1);
	}

  @Test 
	public void testReverseRicky() {
    int[] input1 = { 1, 2 };
    ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{ 2, 1 }, ArrayExamples.reversed(input1));
	}

  @Test 
	public void testAvgWithoutLowest() {
    double[] input1 = {4, 3, 2, 1, 5};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
	}


}
