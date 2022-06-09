package site.metacoding.study.ex03.protoss;

public class Zealot {

	private final String name; // 이름 / 수정 불가하므로 final
	private static int power = 10; // 공격력 // 모든 질럿 오브젝트에 적용이 될 것이고 메모리에 뜨기 전부터 정해져 있음
	private static int armor = 10; // 방어력 // 질럿 생성 전부터 정해져있기 때문에 static
	private int hp; // 체력
	private int sh; //  쉴드(보호막)
	
	// 할 수 있는 것과 당하는 것은 다르다.
	// 할 수 있는 것이 상대방의 상태를 변경하는 건지 내 상태를 변경하는 건지 생각해야 함.
	
	// 상대방의 상태
	public void attack() {}
	
	public void powerUpgrade() {
		power++;
		System.out.println("공격력이 1 증가하였습니다.");
	}
	
	public void armorUpgrade() {
		armor++;
		System.out.println("방어력이 1 증가하였습니다.");
	}
	
	public Zealot(String name) {
		super();
		this.name = name;
		this.hp = 100; // 소환되면 무조건 100으로 고정이므로 초기화
		this.sh = 100; // 소환되면 무조건 100으로 고정이므로 초기화
	} 
	

}
