package com.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description 用户业务接口
 * @author zhaisp
 * @date 2023-3-26
 */
@Component
public class UserService implements InitializingBean {
	@Autowired
	private OrderService orderService;

	private String name;

	/**
	 * 初始化前
	 * jdk支持的注解
	 * 依赖注入前，且该方法需要满足一定要求，详见javax.annotation.PostConstruct
	 */
	@PostConstruct
	public void beforeCreate(){
		this.name = "name属性";
		System.out.println("初始化前.....");
	}

	public void test(){
		System.out.println(this.orderService);
	}

	/**
	 * 初始化
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化...执行自定义初始化，或者仅仅检查是否设置了所有强制属性");
	}
}
