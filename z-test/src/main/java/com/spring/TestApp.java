package com.spring;

import com.spring.config.AppConfig;
import com.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.PrintStream;

/**
 * @description 启动类
 * @author zhaisp
 * @date 2023-3-26
 */
public class TestApp {
	public static void main(String[] args) {
		//创建spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		//注册配置类
		applicationContext.register(AppConfig.class);
		//启动容器  创建一个bean对象
		applicationContext.refresh();
		/**
		 * bean的创建和销毁
		 * userService ---> 推断构造方法(@Autowired指定的构造方法--默认构造方法--byType byName) ---> 对象（没有值） ---> DI（依赖注入@Autowired）
		 *  ---> 初始化前（@PostConstruct） ---> 初始化(实现InitializingBean接口)
		 *  ---> 初始化后(AOP)创建代理对象(cglib机制),代理对象继承普通对象重写AOP方法，执行AOP逻辑，创建普通对象，调用普通对象的方法
		 *  ---> 代理对象 Map<String,Object> 单例池 bean对象（有值）          singleBean
		 *
		 *	概念：bean的实例化 bean的初始化
		 *  jvm对象的实例化 jvm对象的初始化
		 */
		//手动注入bean对象
//		applicationContext.getBeanFactory().registerSingleton();
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();

		/**
		 * spring AOP逻辑实现
		 */
//		UserServiceAOP userServiceAOP = (UserServiceAOP) applicationContext.getBean("userServiceAOP");
//		userServiceAOP.test();


		/**
		 * DI 依赖注入
		 */
//		for (Field field : userService.getClass().getDeclaredFields()) {
//			if (field.isAnnotationPresent(Autowired.class)) {
//				field.set(userService, ??);
//			}
//		}

		/**
		 * 初始化前
		 */
//		for (Method method : userService.getClass().getDeclaredMethods()) {
//			if (method.isAnnotationPresent(PostConstruct.class)) {
//				method.invoke(userService, null);
//			}
//		}

		/**
		 * 初始化
		 */
//		if (userService1 instanceof InitializingBean) {
//			try {
//				((InitializingBean)userService).afterPropertiesSet();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = applicationContext.getBean("user",User.class);
//		System.out.println(user);
	}
}