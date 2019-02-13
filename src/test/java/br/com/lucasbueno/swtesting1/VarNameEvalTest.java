package br.com.lucasbueno.swtesting1;

import static org.junit.Assert.assertEquals; // imports the static method assertEquals from Assert class

import org.junit.Test;

public class VarNameEvalTest {

	@Test // a test case method must return void and have no arguments
	public void trueFirstLowerCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("a");
		assertEquals(true, result);
	}

	@Test
	public void falseFirstLowerCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("A");
		assertEquals(false, result);
	}
}
