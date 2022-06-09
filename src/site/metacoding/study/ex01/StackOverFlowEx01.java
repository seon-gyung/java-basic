package site.metacoding.study.ex01;

// 0년도 ~ 2022년도
// 0년도 ~~~~~ 끝까지 (static)
// 1999년도 ~~죽을때까지 (heap)
// 행위가 시작될 때 메모리 뜨는 것 (stack) - 재민이 성현이 공격
// heap, stack, static(클래스종속 키워드)

class Lion{
   private int 배상태 = 0;
   
   public int get배상태() {
      return 배상태;
   }
   
   public void eat() { // 재귀 메서드
      
      int happy = 0;
      배상태++;
      happy = happy + 10;
      
      if(배상태 >= 100) {
         
      }else {
         eat();
      }
      
   }
}

public class StackOverFlowEx01 {

   public static void main(String[] args) {
      Lion lion = new Lion();
      lion.eat();
      System.out.println("아 배불러 : "+lion.get배상태());
   }

}