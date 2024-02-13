import java.util.Scanner;
public class App {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FanFootball obj1 = new FanFootball();
		FanFootball obj2 = new FanFootball();
		LiveScoreManager obj = new LiveScoreManager();              
		obj.add(obj1);              
		obj.add(obj2);              

		while(true){
			System.out.print("Enter Score ");
			String score = sc.nextLine();

			if(score.equals("")){
				break;
			}
			else obj.setScore(score);
		}	
    }
}
