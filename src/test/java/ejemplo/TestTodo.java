package ejemplo;
import org.junit.*;


public class TestTodo{
	@Test
	public void testSaludo(){
	HolaJava o = new HolaJava();
	assert "Hola, Mundo! (en Java)".equals(o.saluda("Mundo"));
	}
	
	@Test
	public void testsuma(){
		HolaJava o = new HolaJava();
		Assert.assertEquals(0,o.suma(1,2));
	}
	
}