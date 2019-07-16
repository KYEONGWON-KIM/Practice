package goods.model.dto;

public class Goods {
	private String goodsNo;// 상품 구분을 위한 숫자
	private String goodName;// 상품 유형 이름
	private String goodsIntroduction;// 상품 소개(활동 영역)

	public Goods(String goodsNo, String goodsName, String goodsIntroduction, String String, String string2) {
		super();
		this.goodsNo = goodsNo;
		this.goodName = goodsName;
		this.goodsIntroduction = goodsIntroduction;
	}

	public String getgoodsId() {
		return goodsNo;
	}

	public void setgoodsId(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getgoodsName() {
		return goodName;
	}

	public void setgoodsName(String goodsName) {
		this.goodName = goodsName;
	}

	public String getgoodsIntroduction() {
		return goodsIntroduction;
	}

	public void setgoodsIntroduction(String goodsIntroduction) {
		this.goodsIntroduction = goodsIntroduction;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("추천순위 : ");
		builder.append(goodsNo);
		builder.append(", 상품 이름 : ");
		builder.append(goodName);
		builder.append(", 상품 소개 : ");
		builder.append(goodsIntroduction);
		builder.append("]");
		return builder.toString();
	}
}
