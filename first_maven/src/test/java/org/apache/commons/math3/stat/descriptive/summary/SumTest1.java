package org.apache.commons.math3.stat.descriptive.summary;

public class SumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] values= {1,2,3,4,5,6,7};
		int begin=0;
		int length=7;
		Sum S=new Sum();
		
		S.incrementAll(values);
		if(S.getN()!=7)
		{
			System.err.println("wrong increment");
		}
		S.clear();
		if(S.getN()!=0||S.getResult()!=0)
		{
			System.err.println("wrong clear");
		}
		if(S.evaluate(values,begin,length)!=28)
		{
			System.err.println("wrong evaluate");
		}
	}

}
