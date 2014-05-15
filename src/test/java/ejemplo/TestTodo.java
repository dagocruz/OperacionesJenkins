package ejemplo;
import org.junit.*;


public class TestTodo{
	@Test
	public void testSaludo(){
	HolaJava o = new HolaJava();
	assert "Hola, Mundo! (en Java)".equals(o.saluda("Mundo"));
	}	
}