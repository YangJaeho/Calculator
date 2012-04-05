package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator cal;

	@Before
	public void setup() {
		cal = new StringCalculator();
	}

	@Test
	public void add빈문자반환0() throws Exception {

		int result = cal.add("");
		assertThat(result, is(0));

	}

	@Test
	public void add숫자하나숫자반환() throws Exception {

		int result = cal.add("7");
		assertThat(result, is(7));
	}

	@Test
	public void add숫자두개숫자합() throws Exception {

		int result = cal.add("3,5");
		assertThat(result, is(8));

	}

	@Test
	public void add숫자세개숫자합() throws Exception {

		int result = cal.add("1,2,3");
		assertThat(result, is(6));
	}

	@Test
	public void add구분자() throws Exception {
		int result = cal.add("3\n2");
		assertThat(result, is(5));
	}

	@Test
	public void add커스텀구분자() throws Exception {
		int result = cal.add("//;\n1;2;3;");
		assertThat(result, is(6));
	}

	@Test (expected=RuntimeException.class)
	public void add음수값예외발생() throws Exception {
		try {
			cal.add("-1,2,3");
			fail("RuntimeException이 발생해야 한다.");
		} catch (RuntimeException e) {

		}
	}

}
