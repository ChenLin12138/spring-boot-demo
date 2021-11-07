package com.chenlin.aop;

import org.springframework.stereotype.Component;

/**
 * @author Chen Lin
 * @date 2021-10-12
 */

@Component
public class PerformanceImpl implements Performance {

	@Override
	public void perform() {
		System.out.println("PerformnaceImpl.perform()");
	}

}
