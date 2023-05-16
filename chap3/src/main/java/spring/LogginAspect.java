package spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogginAspect {
	 public Object logging(ProceedingJoinPoint joinPoint) throws Throwable { 
		 //joinPoint 다음 writer라는 메서드 호출?
		 System.out.println("[LA]로그 시작");
		 StopWatch sw = new StopWatch(); //스탑워치 객체 생성 후 
		 sw.start(); // 실행
		 Object ret = joinPoint.proceed(); //내 다음 순서의 메서드를 호출하라(writer 호출)
		 sw.stop();
		 System.out.println("[LA]메서드 실행 시간"+sw.getTotalTimeMillis()+"밀리초");
		 return ret; //writer이 전달해준 객체가 리턴이 된다.
	 }

}
