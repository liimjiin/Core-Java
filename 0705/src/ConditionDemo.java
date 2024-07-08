import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
//		System.out.print("Favorite Season (spring, summer, fall, winter) : ");
		Scanner sc = new Scanner(System.in);
//		String season = sc.nextLine(); // 문자열은 값이 아니라 번지(주소)다. 
		
		// [if의 경우]
//		if(season == "spring") { // season (번지) == "spring" (값) -> 에러!
		
		/*
		if(season.equals("spring")) { // equals는 String class의 멤버 메소드이기 때문에 주소가 필요하다.
			System.out.println("개나리, 진달래");
		}else if(season.equals("summer")) {
			System.out.println("장마");
		}else if(season.compareTo("fall")==0) { // compareTo는 문자의 아스키 코드를 비교 같으면 '0'을 리턴한다.
			System.out.println("코스모스");
		}else{
			System.out.println("매화");
		}
		*/
		
		// [switch]
//		switch(season) {
//		case "spring" : System.out.println("개나리, 진달래");
//						break;
//		case "summer" : System.out.println("장마");
//						break;
//		case "fall" : System.out.println("코스모스");
//						break;
//		default : System.out.println("겨울");
//		}
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("신장(cm) : ");
		double tall = sc.nextDouble();
		System.out.print("몸무게(kg) :");
		double weight = sc.nextDouble();
		
		double bmi = weight / ((tall / 100.0) * (tall / 100.0));
		 System.out.println(bmi);
		
		if(bmi > 18.5) {
			System.out.println("저체중");
		}else if(bmi >= 18.5 && bmi <= 22.9){
			System.out.println("정상");
		}else if(bmi >= 23 && bmi <= 24.9){
			System.out.println("비만전단계");
		}else if(bmi >= 25 && bmi <= 29.9){
			System.out.println("1단계 비만");
		}else if(bmi >= 30 && bmi <= 34.9){
			System.out.println("2단계 비만");
		}else if(bmi >= 35){
			System.out.println("3단계 비만");
		}
		}
				
		

	}

