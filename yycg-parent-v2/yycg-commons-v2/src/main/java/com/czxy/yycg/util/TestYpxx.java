package com.czxy.yycg.util;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 药品信息测试类
 * @author liangtong
 *
 */
public class TestYpxx {
	private String bm;	//编号id
	private String mc;	//名称
	@JSONField(serialize=false)
	private float price;//价格
	
	public TestYpxx(String bm,String mc,float price){
		this.bm = bm;
		this.mc = mc;
		this.price = price;
	}
	public String getBm() {
		return bm;
	}
	public void setBm(String bm) {
		this.bm = bm;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ypxx [bm=" + bm + ", mc=" + mc + ", price=" + price + "]";
	}
	
	
}
