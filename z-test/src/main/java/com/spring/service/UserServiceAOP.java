//package com.spring.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.lang.annotation.Target;
//
///**
// * @author zhaisp
// * @description TODO spring AOP 切面逻辑实现
// * @date 2023/4/2 19:02
// */
//@Component
//public class UserServiceAOP extends UserService{
//	@Autowired
//	private UserService target;
//
//	/**
//	 * 重写要aop的方法
//	 */
//	@Override
//	public void test() {
//		//执行切面逻辑
//		System.out.println("before test function : ");
//		//执行被切方法逻辑
//		target.test();
//	}
//}
