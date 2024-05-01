package example.lookup;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.lookup.LA;
import org.springframework.example.lookup.LB;
import org.springframework.example.lookup.LC;

public class LookUpTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.springframework.example.lookup");
		context.refresh();
		LA la = context.getBean(LA.class);
		la.printInfo();
		LC lc = context.getBean(LC.class);
		lc.printInfo();
	}
}
