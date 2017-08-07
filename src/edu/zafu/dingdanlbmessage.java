package edu.zafu;

public class dingdanlbmessage {
	private String DD_tuname;
	private String DD_dianming;
	private String DD_zhuangtai;
	private String DD_shijian;
	
	public String getDD_tuname() {
		return DD_tuname;
	}

	public String getDD_dianming() {
		return DD_dianming;
	}

	public String getDD_zhuangtai() {
		return DD_zhuangtai;
	}

	public String getDD_shijian() {
		return DD_shijian;
	}


	public dingdanlbmessage(String DDtuname,String DDdianming,String DDzhuangtai,String DDshijian)
	{
		this.DD_tuname=DDtuname;
		this.DD_dianming=DDdianming;
		this.DD_zhuangtai=DDzhuangtai;
		this.DD_shijian=DDshijian;
	}
	
	

}
