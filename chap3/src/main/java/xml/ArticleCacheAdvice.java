package xml;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class ArticleCacheAdvice {
	//cache ={1,new Article(1)}
	private Map<Integer,Article> cache = new HashMap<Integer,Article>();
	public Object cache(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("[ACA] cache before 실행");
		//joinPoint.getArgs() : 핵심메서드의 매개변수 목록
		Integer id = (Integer)joinPoint.getArgs()[0]; //매개변수 중 1
		Article article = cache.get(id); //null
		if(article != null) { //id에 해당하는 객체가 map 객체에 저장
			System.out.println("[ACA] cache에서 Article["+id+"] 가져옴");
			return article; // 다음 메서드로 진행하지 않음
		}
		//ret : 핵심메서드의 리턴값. new Article(1)
		Object ret = joinPoint.proceed(); //다음 메서드 호출(LogginAdvice.before())
		System.out.println("[ACA] cache after 실행");
		if(ret != null && ret instanceof Article) {
			cache.put(id, (Article)ret);
			System.out.println("[ACA] cache에서 Article["+id+"] 추가함");
		}
	    return ret;
	}
	
}
