package pattern.template;


public abstract class AbstGameConnectHelper {
	//외부 노출을 막는다.
	protected abstract String doSecurity(String String);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	/**
	 * 템플릿 메소드 
	 * @param str 암포화된 str 가정
	 * @return connection 객체
	 */
	public String requestConnection(String encodedInfo){
		
		//보안작업 -> 암호화 된 문자열을 디코딩
		String decodedInfo = doSecurity(encodedInfo);

		//반환 된 결과로 아이디, 암호를 구함(pass)
		String id = "id";
		String pw = "pw";
		
		if(!authentication(id, pw)){
			throw new Error("id, pw 실패");
		}
		
		//아이디를 통해 권한 정보를 구함.
		int i = authorization(id);
		
		switch (i) {
		case 0://게임 매니져
			
			break;
		case 1://유료 회원
			
			break;
		case 2://무료 회원
			
			break;
		default://권한 없음. 기타 상황
			
			break;
		}
		
		
		return connection(decodedInfo);
	}
}
