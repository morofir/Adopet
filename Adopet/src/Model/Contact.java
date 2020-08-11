package Model;

public class Contact extends Guest {

	private String email;
	private String phoneNum;
	private String contactSubject;
	private String messageBody;
	
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;

	}
	public String getcontactSubject() {
		return contactSubject;
	}
	public void setcontactSubject(String contactSubject) {
		if (contactSubject.isEmpty())
		{
			this.contactSubject = "<No Subject>";
		}
		else
		{
			this.contactSubject = contactSubject;
		}
	}
	public String getmessageBody() {
		return messageBody;
	}
	public void setmessageBody(String messageBody) {
		if (messageBody.isEmpty())
		{
			this.messageBody = "<No Message Body>";
		}
		else
		{
			this.messageBody = messageBody;
		}
	}

}
