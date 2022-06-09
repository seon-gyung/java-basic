package site.metacoding.study.ex02;

class UtilTest {
	public static void divide(int n) {
		try {
			System.out.println(10 / n);
		} catch (Exception e) {
			System.out.println("0을 나눌 수 없어요. 다른 값을 넣으세요.");
		}
	}

	public static void divide2(int n) throws Exception{
		System.out.println(10 / n);
	}
}

public class ExceptionTest {

	public static void main(String[] args) {
		UtilTest.divide(0);
		
		try {
			UtilTest.divide2(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
