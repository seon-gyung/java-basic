package site.metacoding.study.ex03.protoss;

public class Dragoon {

   public final String name; // 이름 / 수정 불가하므로 final 불변 데이터이므로 public으로 공개해도 됨
   private static int power = 15; // 공격력 // 모든 질럿 오브젝트에 적용이 될 것이고 메모리에 뜨기 전부터 정해져 있음
   private static int armor = 5; // 방어력 // 질럿 생성 전부터 정해져있기 때문에 static
   private int hp; // 체력
   
   // 할 수 있는 것과 당하는 것은 다르다.
   // 할 수 있는 것이 상대방의 상태를 변경하는 건지 내 상태를 변경하는 건지 생각해야 함.
   
   public int getPower() {
      return power;
   }
   
   public void 공격당함(Dragoon unit) {
      hp = hp - unit.getPower();
      System.out.println(this.name+"가 "+unit.name+"에게 공격 당했습니다. 현재 hp :"+this.hp);
   }
   
   public void 공격당함(Zealot unit) { // 오버로딩 : 메서드 명은 동일하지만 매개변수의 타입이 다르거나, 개수가 다른 것
      hp = hp - unit.getPower();
      System.out.println(this.name+"가 "+unit.name+"에게 공격 당했습니다. 현재 hp :"+this.hp);
   }
   
   public void powerUpgrade() {
      power++;
      System.out.println("공격력이 1 증가하였습니다.");
   }
   
   public void armorUpgrade() {
      armor++;
      System.out.println("방어력이 1 증가하였습니다.");
   }
   
   public Dragoon(String name) {
      super();
      this.name = name;
      this.hp = 100; // 소환되면 무조건 100으로 고정이므로 초기화
   } 
   

}