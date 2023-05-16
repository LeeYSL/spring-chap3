package main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.WriteImpl;

public class Main1 {
	public static void main(String[] agas) {
		AbstractApplicationContext ctx = 
				  new GenericXmlApplicationContext("classpath:aop.xml");
		WriteImpl bean = ctx.getBean("write",WriteImpl.class);
		bean.write(); //핵심메서드임 
		              //핵심 메서드 실행 전 loggin 메서드 먼저 호출(spring이 알아서 해줌?).
				  
	}

}
