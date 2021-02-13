import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Circulo_VASTestParametrizada {
	private double radioTest;
	private double resultadoWait;
	
	public Circulo_VASTestParametrizada(double rad,double res) {
		radioTest=rad;
		resultadoWait=res;
	}
	@Parameters
	public static Collection<Object[]>numeros(){
		return Arrays.asList(new Object[][]{
			{7,153.9},{0,0},{-3,28.2}});
		}
	@Test
	public void testarea() {
		Circulo_VAS cero=new Circulo_VAS(radioTest,"circulo");
		double resultado= cero.area();
		assertEquals(resultadoWait,resultado,0.1);
	}

}
