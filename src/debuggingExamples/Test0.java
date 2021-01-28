package debuggingExamples;

import org.testng.annotations.Test;

public class Test0 {
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

	@Test
	public void test()
	{
	System.out.println("Hello");
	Test0 t=new Test0();
	t.add();

	}

}
