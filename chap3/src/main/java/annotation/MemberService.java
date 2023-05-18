package annotation;

import org.springframework.stereotype.Component;

import xml.Member;
import xml.UpdateInfo;

@Component
public class MemberService {
	public void regist(Member member) {
		System.out.println("MemberService.regist(Member)");
	}
	public boolean update(Member member,String memberid, UpdateInfo info) {
		System.out.println("MemberService.update(String,UpdateInfo) 메서드 실행");
		return true;
	
	}
	public boolean delete(String memberid, String neme,UpdateInfo info) {
		System.out.println("MemberService.delete(String,String) 메서드 실행");
		return false;
	}

}
