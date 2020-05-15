/*
 * 클래스의 상속
 */

class AA{
	
}

class BB extends AA{
	
}

class CC extends BB{
	//CC클래스는 BB와 AA에 있는 클래스를  모두 상속받음
}

public class EX04 extends CC {
	//EX04클래스는 AA BB CC에 있는 클래스를 모두 사용가능
}
