package edu.zafu;

public class gouwuchemessage {
	private String GWC_name;
	private String GWC_shuliang;
	private String GWC_zongjia;
	
	public String getGWC_name() {
		return GWC_name;
	}

	public String getGWC_shuliang() {
		return GWC_shuliang;
	}

	public String getGWC_zongjia() {
		return GWC_zongjia;
	}

	public gouwuchemessage(String gwcname,String gwcshuliang,String gwczongjia)
	{
		this.GWC_name=gwcname;
		this.GWC_shuliang=gwcshuliang;
		this.GWC_zongjia=gwczongjia;
	}
	
	

}
