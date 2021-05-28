package step02.calcul.impl;

import step02.calcul.Calculator;

public class Plus extends Calculator{

	@Override
	protected double doCalculation(int a, int b) {
		return a+b;
	}

}
