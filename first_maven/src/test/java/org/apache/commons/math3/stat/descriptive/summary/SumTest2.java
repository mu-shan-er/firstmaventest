package org.apache.commons.math3.stat.descriptive.summary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest2 {
	double[] values= {1,2,3,4,5,6,7};
	int begin=0;
	int length=7;
	Sum S=new Sum();
	
	@Test
	void testClear() {
		S.clear();
		assertEquals(S.getN(),0);
	}
	@Test
	void testgetN()
	{
		S.incrementAll(values);
		assertEquals(S.getN(),7);
	}
	@Test
	void testgetResult()
	{
		S.incrementAll(values);
		assertEquals(S.getResult(),28);
	}
	@Test
	void testicrement() {
		S.incrementAll(values);
		assertEquals(S.getN(),7);
	}
	@Test
	void testEvaluateDoubleArrayIntInt() {
		assertEquals(S.evaluate(values,begin,length),28);
	}

}
