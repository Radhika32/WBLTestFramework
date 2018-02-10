package edu.wbl.base;

public class WBLWrapper {

	private String url;
	private String pageTitle;
	private String loginID;
	private String batch;
	private String[] subjectList;
	public static final int CLASS = 1;
	public static final int MOCK = 2;
	public static final int SESSION = 3;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String[] getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(String[] subjectList) {
		this.subjectList = subjectList;
	}
	
	
	
	
	
	
}
