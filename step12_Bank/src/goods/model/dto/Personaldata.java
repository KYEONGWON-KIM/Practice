package goods.model.dto;

public class Personaldata {
	private String No;
	private String name;
	private String job;
	private String money;

	public Personaldata() {
	}

	public Personaldata(String No, String name, String job, String money) {
		this.No = No;
		this.name = name;
		this.job = job;
		this.money = money;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		this.No = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[사용횟수 : ");
		builder.append(No);
		builder.append(", 이름 : ");
		builder.append(name);
		builder.append(", 직업 : ");
		builder.append(job);
		builder.append(", 금액 : ");
		builder.append(money);
		return builder.toString();
	}
}