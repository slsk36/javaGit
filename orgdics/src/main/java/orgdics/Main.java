package orgdics;

import orgdics.dao.MemberDAO;
import orgdics.dao.OracleMemberDao;
import orgdics.service.MemberService;

public class Main {
	
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		ms.setDao(new MemberDAO());
		ms.memberjoin("aaa");
	}
}
