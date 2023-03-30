import java.util.Scanner;

public class Bmi {
	public static void main(String args[]) {
	
		//String name = "윤주영";
		//System.out.println("내가 좋아하는 연예인은? " + name + "입니다.");
		
		/*
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("당신이 좋아하는 연예인은 누구입니까?");
		name = sc.next();
		System.out.println("당신이 좋아하는 연예인은? " + name + " 입니다.");
		
		float height = 1.80f;
		float weight = 73.0f;
		float result;
		result = weight / (height * height);
		System.out.println("당신의 체질량 지수는 " + result + " 입니다.");
		*/
		
		Scanner sc = new Scanner(System.in);
		String name, bmi_result;
		float weight, height;
         
		System.out.println();
		System.out.println("***** 지금부터 체질량 지수를 측정하겠습니다.*****");
		System.out.println();
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("키 입력 : ");
		height = sc.nextFloat();

		System.out.print("몸무게 입력 : ");
		weight = sc.nextFloat();
		

		float result = weight / (height * height);
		
		
		if(result > 30.0){
			bmi_result = "비만";

		}
		else if(result > 25.0){
			bmi_result = "과체중";

		}
		else if(result > 18.5){
			bmi_result = "정상";

		}
		else {
			bmi_result = "저체중";

		}
		
		
		System.out.println(name + "님의 체질량 지수는 " + result + "이고 결과는 " + bmi_result + "입니다.");

		
		
		
		
		
		
	}
}