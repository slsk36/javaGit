package orgdics.service;

import orgdics.dao.MemberDAO;
import orgdics.dto.MemberDTO;

public class MemberService {
	
	private String version;
	

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


	//	MemberDAO dao = new MemberDAO();
	MemberDAO dao;
	
	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}
	
	public MemberService() {}
	
	// 2. getter setter를 통한  di의존주입
	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	

	public void memberjoin(String inputid) {
		boolean test = dao.selectById(inputid);
		if(test) {
			dao.insert(new MemberDTO());
		}
		else {
			System.out.println("존재한다.");
		}
	}
}
