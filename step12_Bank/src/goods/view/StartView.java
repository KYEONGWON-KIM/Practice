package goods.view;

import goods.controller.GoodsController;
import goods.model.dto.Deposit;
import goods.model.dto.Goods;
import goods.model.dto.GoodsProject;
import goods.model.dto.Withdraw;

public class StartView {

	public static void main(String[] args) {

		GoodsController controller = GoodsController.getInstance();

		//
		Deposit deposit4 = new Deposit("월1회", "청원", "기간제 근무요원", "145만원", "월급");
		//
		Withdraw withdrawe4 = new Withdraw("월1회", "청원", "기간제 근무요원", "10만원", "휴대폰 요금 납부");
		//
		Goods Goods4 = new Goods("대기2번", "농협은행 NH20해봄적금", "자동이체 공과금, 가입대상: 19세 이상 만 40세 미만 개인 (1인 1계좌)", "무통장 거래 가능",
				"12개월 이상 36개월 이내");
		//
		String ProjectContent4 = new String("장기 거래자");
		GoodsProject newProject = new GoodsProject("농협은행 NH20해봄적금", Goods4, deposit4, withdrawe4, ProjectContent4);

		// 모든 프로젝트 검색
		System.out.println("***** 1. 모든 Project 검색 *****");
		controller.projectListView();

		System.out.println();

		// 새로운 프로젝트 저장
		System.out.println("***** 2. 새로운 Project 저장 후  모든 Project 검색 *****");
		controller.insertProject(newProject);
		controller.projectListView();

		System.out.println();

		// 존재하는 프로젝트 검색
		System.out.println("***** 3. 존재하는 Project 검색 *****");
		controller.projectView("농협은행 NH20해봄적금");

		System.out.println();

		System.out.println("***** 4. 미존재하는 Project 검색 - 예외처리 확인용 *****");
		controller.projectView("농협은행 NH20해봄적금 ---");

		System.out.println();

		// 존재하는 프로젝트 업데이트 test
		System.out.println("***** 5. 존재하는 Project 수정 후 수정한 Project 검색 *****");
		controller.updateProject("우리은행 올포미 적금", new Withdraw("24", "명란", "건축기계 운전원", "150만원", "월세 모으기"));
		controller.projectView("우리은행 올포미 적금");

		System.out.println();

		// 미 존재하는 프로젝트 업데이트 test : 예외 발생
		System.out.println("***** 6. 미존재하는 Project 수정 - 예외처리 확인용 *****");
		controller.updateProject("집 앞 은행--", new Withdraw("30", "장윤", "버스 기사", "200만원", "대출 이자"));

		System.out.println();

		// 모든 프로젝트 검색 또는 삭제한 프로젝트 검색
		System.out.println("***** 7. 삭제 후  해당 Project 검색 *****");
		controller.deleteProject("국민은행 KB Smart 폰 예금");
		controller.projectView("국민은행 KB Smart 폰 예금");

		// 제이슨 출력
		System.out.println("***** 8. 제이슨 변환 및 출력 *****");
		controller.JsongetAllProjects();

	}
}
