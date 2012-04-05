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
	public void add���ڹ�ȯ0() throws Exception {

		int result = cal.add("");
		assertThat(result, is(0));

	}

	@Test
	public void add�����ϳ����ڹ�ȯ() throws Exception {

		int result = cal.add("7");
		assertThat(result, is(7));
	}

	@Test
	public void add���ڵΰ�������() throws Exception {

		int result = cal.add("3,5");
		assertThat(result, is(8));

	}

	@Test
	public void add���ڼ���������() throws Exception {

		int result = cal.add("1,2,3");
		assertThat(result, is(6));
	}

	@Test
	public void add������() throws Exception {
		int result = cal.add("3\n2");
		assertThat(result, is(5));
	}

	@Test
	public void addĿ���ұ�����() throws Exception {
		int result = cal.add("//;\n1;2;3;");
		assertThat(result, is(6));
	}

	@Test (expected=RuntimeException.class)
	public void add���������ܹ߻�() throws Exception {
		try {
			cal.add("-1,2,3");
			fail("RuntimeException�� �߻��ؾ� �Ѵ�.");
		} catch (RuntimeException e) {

		}
	}

}
