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
		Assert.assertEquals(3,o.suma(1,2));
	}
	
	@Test
	public void testsuma2(){
		HolaJava o = new HolaJava();
		Assert.assertEquals(1,o.suma(1,2));
	}
	
}