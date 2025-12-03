package curriculum_B;

public class Question2 {

	public static void main(String[] args) {
		
		/* Q1
		 * 変数名score int型に「75」を代入
		 * scoreが60以上なら「合格です！」を表示
		 */
		
		int score = 75;if ( score >= 60 ) {System.out.println("合格です！");}
		
		/* Q2
		 * 変数名age int型に「25」を代入
		 * age が 20 以上 30 以下なら "適正年齢です" と表示
		 * それ以外の場合は "対象外です" と表示
		 */
		int age = 25;
		if( age >= 20 && age < 30) {
			System.out.println("適正年齢です");
		}else {
			System.out.println( "対象外です" );
		}
		
		
		
		
	}

}
