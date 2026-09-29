import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import tut.meven.test.Calculater;

public class DemoTest {
	@Test
	public void testAdd() {
		Calculater c = new Calculater();
		int res = c.add(10, 20);
		assertEquals(30, res);
	}
	@Test
	public void testMulti() {
		Calculater c = new Calculater();
		int res = c.multi(10, 20);
		assertEquals(200, res);
	}
}
