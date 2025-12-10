package curriculum_B.objectQuestion.Object4;

public class FullTimeEmployee extends Employee {
		private static final int HOURLY_RATE = 1200; // 時給

		public FullTimeEmployee(String id, String name) {
			super(id, name);
		}
	
public int calculateDailyWage(int hoursWorked) {
	if(hoursWorked<= 8) {
		return hoursWorked*HOURLY_RATE; // 8時間までは割増なし
	}else {
		int overtime = hoursWorked-8; // 8時間超えたら残業
		return 8*HOURLY_RATE+ (int)(overtime*HOURLY_RATE*1.25); //残業分は1.25倍の割増賃金 
			}
		}
	}

