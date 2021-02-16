package day02;

/*
	문제 5 ]
		54232원으로 제가 원두를 샀습니다.
		현금으로 지불하려고 한다.
		
		우리나라 화폐단위별로 각 단위가 몇개가 필요한지 계산해서 출력하세요.
		단, 큰 화폐가 먼저 지불되고 남은 금액으로 작은화폐로 지불한다.
		
		화폐단위
			10000
			1000
			100
			10
			1
		를 사용해서 처리하세요.
 */
public class Ex05 {
	public static void main(String[] args) {
		// 할일
		// 변수준비한다.
		int man, chun, baek, ten, il, money, tmoney;
		money = 54232;
		tmoney = money;
		
		//  만원단위 계산
		man = tmoney / 10000;
		// 남은 금액을 변수에 다시 기억시킨다.
		tmoney %= 10000; // ==> tmoney = tmoney % 10000;
		
		chun = tmoney / 1000;
		tmoney %= 1000;
		
		baek = tmoney / 100;
		tmoney %= 100;
		
		ten = tmoney / 10;
		
		il = tmoney % 10;
		
		// 결과 출력
		System.out.println("총 지불 금액 : " + money);
		System.out.println("만원짜리 지불 장 수 : " + man);
		System.out.println("천원짜리 지불 장 수 : " + chun);
		System.out.println("100원짜리 지불 갯수 : " + baek);
		System.out.println("10원짜리 지불 갯수 : " + ten);
		System.out.println("1원짜리 지불 갯수 : " + il);
	}
}
