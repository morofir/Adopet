package Model;

public class Volunteer extends Guest {

	private String phoneNum;
	private String Region;
	private String startDay;
	private String startMonth;
	private String startYear;
	private String msg;

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		if(msg.length() == 0)
		{
			this.msg = "<No Message>";
		}
		else
		{
			this.msg = msg;
		}
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String Region) {
		this.Region = Region;
	}
	public String getStartDay() {
		return startDay;
	}
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	public String getStartMonth() {
		return startMonth;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	} 
}
