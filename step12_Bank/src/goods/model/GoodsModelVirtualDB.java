//DB
package goods.model;

import java.util.ArrayList;

import javax.swing.text.html.Option;

import goods.model.dto.Deposit;
import goods.model.dto.Goods;
import goods.model.dto.GoodsProject;
import goods.model.dto.Personaldata;
import goods.model.dto.Withdraw;

public class GoodsModelVirtualDB {
	private static GoodsModelVirtualDB instance = new GoodsModelVirtualDB();
	private ArrayList<GoodsProject> projectList = new ArrayList<GoodsProject>();

	private GoodsModelVirtualDB() {// ));

		projectList.add(new GoodsProject("우리은행 올포미 적금",
				new Goods("3위", "올포미 적금", "가입기간 6개월 이상 36개월 이하.", "적립금액 월300만원 이하",
						"정액적립 6개월 이상: 1.90, 자유적립 6개월 이상: 1.70 "),
				new Deposit("30회", "영원", "생산 근로자", "4만원", "정액적립6개월 이상"),
				new Withdraw("1회", "영원", "생산 근로자", "누적자본 120만원", "여행 자금"), new String("중도해지")));
		projectList.add(new GoodsProject("국민은행 KB Smart 폰 예금",
				new Goods("2위", "국민은행 KB Smart 폰 예금", "가입기간 1~12개월", "가입금액 100만원 이상",
						"비과세종합저축으로 가입가능-세제혜택 있음, 6~12개월 연 이율 1.65~2.25"),
				new Deposit("월1회", "한원", "직업군인", "150만원", "자동예치 불가"),
				new Withdraw("주1회", "한원", "직업군인", "10만원", "현질 자금"), new String("적정 소비 고객")));
		projectList.add(new GoodsProject("신한은행 마이홈플랜 주택청약 종합저축",
				new Goods("1위", "신한은행 마이홈플랜 주택청약 종합저축", "가입기간 840개월", "가입금액 2만원부터 1500만원까지",
						"비과세종합저축으로 가입가능, 자동재 예치 및 일부해지 불가"),
				new Deposit("월1회", "다원", "취업준비생", "3만원", "자동예치 불가"), new Withdraw("0회", "다원", "취업준비생", "0만원", "7개월 경과"),
				new String("20대 후반 사회 초년생")));

	}

	public static GoodsModelVirtualDB getInstance() {
		return instance;
	}

	public ArrayList<GoodsProject> getProjectList() {
		return projectList;
	}

	public void insertProject(GoodsProject newProject) {
		projectList.add(newProject);
	}

	public void deleteProject(GoodsProject newProject) {
//		projectList.add(newProject);
		projectList.remove(newProject);
	}
}
