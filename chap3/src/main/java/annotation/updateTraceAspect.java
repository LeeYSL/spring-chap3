package annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import xml.UpdateInfo;

@Component
@Aspect
@Order(1)
public class updateTraceAspect {
	//args(..,id,info) : 마지막 매개변수가 id,info인 메서드를 선택
	 @AfterReturning(pointcut="args(..,id,info)",
			 argNames="ret,id,info", returning = "ret")
	 public void traceReturn(Object ret, String id, UpdateInfo info) {
		 System.out.println("[TA] 정보 수정 결과:" +ret+",대상ID:"+"id"
		 		+ ",수정정보:"+info);
	 }

}
