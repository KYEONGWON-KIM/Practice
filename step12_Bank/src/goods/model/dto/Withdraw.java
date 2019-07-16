package goods.model.dto;

public class Withdraw extends Personaldata {
	private String withdrawContent;

	public Withdraw(String string, String string2) {
	}

	public Withdraw(String withdrawContent) {
		super();
		this.withdrawContent = withdrawContent;
	}

	public Withdraw(String no, String name, String job, String money, String withdrawContent) {
		super(no, name, job, money);
		this.withdrawContent = withdrawContent;
	}

	public String getwithdrawContent() {
		return withdrawContent;
	}

	public void setwithdrawContent(String withdrawContent) {
		this.withdrawContent = withdrawContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 인출 내역 : ");
		builder.append(withdrawContent);
		builder.append("]");
		return builder.toString();
	}
}
