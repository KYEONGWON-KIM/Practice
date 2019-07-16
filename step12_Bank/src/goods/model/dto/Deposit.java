package goods.model.dto;

import lombok.Data;

@Data
public class Deposit extends Personaldata {
	private String option;

	public Deposit() {
	}

	public Deposit(String major) {
		this.option = option;
	}

	public Deposit(String no, String name, String job, String money, String option) {
		super(no, name, job, money);
		this.option = option;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 예금 상세 : ");
		builder.append("option");
		builder.append("]");
		return builder.toString();
	}

}
