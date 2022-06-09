package site.metacoding.study.ex00;

abstract class 요리사{
	abstract public void 요리하다(); // 오버라이드됨
}

// 요리사
class 임꺽정 extends 요리사{
	public void 요리하다() { // 재정의가 됨
		System.out.println("요리를 시작합니다. 케이크가 만들어졌습니다.");
	}
}

// 사장
class 장보고{
	임꺽정 p1;
	
	public void 계산() {
		System.out.println("계산을 합니다.");
	}
	
	public 장보고(임꺽정 p1) {
		this.p1 = p1;
	}
}

public class MockTest {
	
	public static void main(String[] args) {
		장보고 s = new 장보고(new 임꺽정());
		s.계산();
	}
}
