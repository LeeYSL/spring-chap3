package xml;

public class ReadArticleServiceImpl implements ReadArticleService {

	@Override
	public Article getArticleAndReadCnt(int id) throws Exception {
		System.out.println("getArticleAndReadCnt("+id+") 호출");
		if(id==0) {
			throw new Exception("id는 0이 안 됨"); //id가 0일 때 예외발생
		}
		return new Article(id);
	}

}
