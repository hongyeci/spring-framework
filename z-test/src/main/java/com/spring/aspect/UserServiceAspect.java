package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zhaisp
 * @description TODO 切面
 * @date 2023/3/29 0:01
 */

@Component
@Aspect
public class UserServiceAspect {

	@Before("execution(public void com.spring.service.UserService.test())")
	public void beforeTest(JoinPoint joinPoint){
		System.out.println("before test function : "+joinPoint.getTarget());
	}

}
