package com.chenlin.aop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chenlin.aop.Performance;

/**
 * @author Chen Lin
 * @date 2021-10-12
 */

@SpringBootTest
public class AOPTest{
   
   @Autowired
   private Performance performance;
   
   @Test
   public void testPerformance(){
       performance.perform();
   }
}
