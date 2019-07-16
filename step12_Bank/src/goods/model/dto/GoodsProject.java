package goods.model.dto;

public class GoodsProject {

	private String goodsProjectName; // 진행되는 실제 프로젝트 이름
	private Goods goods; // 기부 내용
	private Deposit deposit; // 입금
	private Withdraw withdraw; // 인출
	private String projectContent; // 내용

	public GoodsProject() {
	}

	public GoodsProject(String goodsProjectName, Goods goods, Deposit deposit, Withdraw withdraw,
			String projectContent) {
		this.goodsProjectName = goodsProjectName;
		this.goods = goods;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.projectContent = projectContent;
	}

	public String getgoodsProjectName() {
		return goodsProjectName;
	}

	public void setgoodsProjectName(String goodsProjectName) {
		this.goodsProjectName = goodsProjectName;
	}

	public Goods getgoods() {
		return goods;
	}

	public void setgoods(Goods goods) {
		this.goods = goods;
	}

	public Deposit getdeposit() {
		return deposit;
	}

	public void setdeposit(Deposit deposit) {
		this.deposit = deposit;
	}

	public Withdraw getwithraw() {
		return withdraw;
	}

	public void setwithraw(Withdraw withdraw) {
		this.withdraw = withdraw;
	}

	public String getProjectContent() {
		return projectContent;
	}

	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 상품명 : ");
		builder.append(goodsProjectName);
		builder.append("\n2. 상품 정보 : ");
		builder.append(goods);
		builder.append("\n3. 예금 정보: ");
		builder.append(deposit);
		builder.append("\n4. 인출 정보: ");
		builder.append(withdraw);
		builder.append("\n5. 인적사항 내용 : ");
		builder.append(projectContent);
		return builder.toString();
	}
}
