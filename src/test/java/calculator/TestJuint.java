package calculator;
import org.junit.Test;
import com.anup.calculator.Calculator;
import junit.framework.TestCase;
public class TestJuint extends TestCase {
	Calculator c=new Calculator();
	@Test
	public void testadd() 
	{		
		assertEquals(100.0 , c.addition(50, 50));
	}
}