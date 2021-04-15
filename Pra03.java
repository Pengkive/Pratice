
public class Test20 {

	public static void main(String[] args) {
		
		//복습
		// if else if else 조건문을 이용한 예제
		
		//학생점수를 저장할 변수 score 선언 후 45저장
		
		int score = 45;
		
		//학생점수에 따른 학점을 저장할 grade 변수 선언 후 기본값으로 초기화
		char grade = '\u0000';
		
		//조건식: 학생점수가 90점 이상이면? (score변수에 저장된 값이 90보다 크거나 같냐?)
		if(score>=90) {
			
			grade = 'A'; //'A'학점 저장
			
		//조건식 : 학생점수가 80점 이상이면?(score변에서 저장된 값이 80보다 크거나 같으면?)	
		}else if(score >= 80) {
			
			grade = 'B'; //'B'학점 저장
		
		//나머지 점수라면
		}else {

			grade = 'C'; //'C'학점 저장
		}
		
		System.out.println("당신의 학점은" + grade + "입니다.");
		
		// 위 if else if else 조건문을 삼항조건연산자로 변경하기
		
		grade = (score>= 90? 'A' : (score>= 80)? 'B' : 'C' );    //"" <-로 넣으면 string으로 인식
		
		
		System.out.println("당신의 학점은" + grade + "입니다.");
		
		
		
		
		
		
		
		
		
	}

}
