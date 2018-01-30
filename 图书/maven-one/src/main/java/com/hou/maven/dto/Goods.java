package com.hou.maven.dto;

/**
 * 商品表
 * @author lenovo
 *
 */

public class Goods {
	private String goodsid;
	private String goodsname;
	private String breifintroduction;
	private String detailintroduction;
	private float goodsprice;
	private String photo;
	private String categroy;
	private int num;
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getBreifintroduction() {
		return breifintroduction;
	}
	public void setBreifintroduction(String breifintroduction) {
		this.breifintroduction = breifintroduction;
	}
	public String getDetailintroduction() {
		return detailintroduction;
	}
	public void setDetailintroduction(String detailintroduction) {
		this.detailintroduction = detailintroduction;
	}
	public float getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(float goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCategroy() {
		return categroy;
	}
	public void setCategroy(String categroy) {
		this.categroy = categroy;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Goods [goodsid=" + goodsid + ", goodsname=" + goodsname + ", breifintroduction=" + breifintroduction
				+ ", detailintroduction=" + detailintroduction + ", goodsprice=" + goodsprice + ", photo=" + photo
				+ ", categroy=" + categroy + ", num=" + num + "]";
	}
	
}
