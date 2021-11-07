package com.chenlin.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Chen Lin
 * @date 2021-10-12
 */

//定义一个切面
@Aspect
public class Audience {

	//定义一个切点
	@Pointcut("execution(** Performance.perform(..))")
	public void perform() {
		
	}
	
	@Before("perform()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	@Before("perform()")
	public void silenceCellPhones(){
       System.out.println("Slcencing cell phones");
	}
	
	@AfterReturning("perform()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("perform()")
	public void demandRefund(){
       System.out.println("Demanding a refund");
	}
}
