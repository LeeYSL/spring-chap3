package xml;

public class MemberService {
	public void regist(Member member) {
		System.out.println("MemberService.regist() 메서드 실행");
	}

	public boolean update(String memberid, UpdateInfo info) {
		System.out.println("MemberSivice.update() 메서드 실행");
		return true;

	}

	public boolean delete(String id, String str) {
		System.out.println("MemberSivice.delete() 메서드 실행");
		return false;

	}
}