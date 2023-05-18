package annotation;

import javax.print.DocFlavor.STRING;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
 
@Component  //객체화
@Aspect     //AOP 클래스.
@Order(3)   //xml에서 aop 중 순서 지정
public class LogginAspect {
        final String publicMethod = "execution(public * annotation..*(..))"; //pointcut 설정 : annotation에 속한 모든 클래스의 public 메서드 
        @Before(publicMethod) //pointcut 설정
        public void before() {
        	System.out.println("[LA] 메서드 실행 전 실행: Before");
        }
        @AfterReturning(pointcut=publicMethod, returning = "ret")
        public void afterReturning(Object ret) { // ret : 핵심메서드의 리턴값
        	System.out.println("[LA] afterReturning 메서드 정상 종류 후 실행. 리턴값=" +ret);
        }
        @AfterThrowing(pointcut=publicMethod, throwing="ex")
        public void afterThrowing(Throwable ex) { //ex : 예외 객체
        	System.out.println("[LA] afterThrowing 메서드 예외 종류 후 실행.예외 메세지=" +ex.getMessage());
        }
        @After(publicMethod)
        public void afterFinally() {
        	System.out.println("[LA] After 메서드 종류 후 실행");
        }
}
