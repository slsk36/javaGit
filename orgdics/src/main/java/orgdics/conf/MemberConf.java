package orgdics.conf;

import org.springframework.context.annotation.Bean;



import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import orgdics.dao.MemberDAO;
import orgdics.service.MemberService;
import orgdics.service.MemberServiceAuto;



@Configuration
@Import(GuestBoardConf.class)

public class MemberConf {

	@Bean
	public MemberServiceAuto memberServiceAuto() {
		return new MemberServiceAuto();
	}
	
	@Bean
	public MemberDAO memberDao() {
		return new MemberDAO();
	}
	
	@Bean
	public MemberService memberService() {
		MemberService ms = new MemberService(memberDao());
		ms.setVersion("3.0");
		return ms; 
	}
}
