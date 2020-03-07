package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleprogram {
	@Test
	public void sum() {
		System.out.println("SUM");
		int a=5,b=10;
		Assert.assertEquals(b+a , 15, "SUM");
	}
	@Test
	public void sub() {
		System.out.println("SUB");
		int a=5,b=10;
		Assert.assertEquals(b-a , 5, "SUB");
	}
	@Test
	public void mul() {
		System.out.println("MUL");
		int a=5,b=10;
		Assert.assertEquals(b*a , 50, "MUL");
	}
	@Test
	public void div() {
		System.out.println("DIV");
		int a=5,b=10;
		Assert.assertEquals(b/a , 2, "DIV");
	}
}
