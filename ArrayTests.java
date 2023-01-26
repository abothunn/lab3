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
  public void testReverseInPlace321(){
    int[] input2 = {10, 9, 8, 7, 6};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{6, 7, 8, 9, 10}, input2);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversed321(){
    int[] input2 = {3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3}, ArrayExamples.reversed(input2));
  }

  

}
