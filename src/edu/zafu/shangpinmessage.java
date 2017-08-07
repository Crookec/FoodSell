package edu.zafu;

public class shangpinmessage {
	private String SP_name;
	private String SP_xiaoliang;
	private String SP_jiage;
	
	public String getSP_name() {
		return SP_name;
	}

	public String getSP_xiaoliang() {
		return SP_xiaoliang;
	}

	public String getSP_jiage() {
		return SP_jiage;
	}



	public shangpinmessage(String spname,String spxiaoliang,String spjiage)
	{
		this.SP_name=spname;
		this.SP_xiaoliang=spxiaoliang;
		this.SP_jiage=spjiage;
	}
	
	

}
