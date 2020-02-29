package calc.test;


	import static org.junit.Assert.assertEquals;

	import org.junit.Assert;
	import org.junit.Test;

import calc.java.calculator;

	

	
	public class test {
		@Test
		public void test() {
			calculator calc = new calculator();
			assertEquals(725, calc.add(722, 3));
			assertEquals(725, calc.sub(728, 3));
			assertEquals(1024, calc.multiply(512, 2));
			assertEquals(512, calc.divide(1024, 2));
		}

		@Test
		public void Test_ADDOP_TwoPosNum() {
			// Arrange
			int a = 12;
			int b = 13;
			calculator calc = new calculator();
			// Act
			int result = calc.add(a, b);
			// Assert
			Assert.assertTrue(result > 0);
		}


		@Test
		public void Test_ADDOP_TwoNegNum() {
			// Arrange
			int a = -12;
			int b = -13;
			calculator calc = new calculator();
			// Act
			int result = calc.add(a, b);
			// Assert
			Assert.assertTrue(result < 0);
		}
	}

