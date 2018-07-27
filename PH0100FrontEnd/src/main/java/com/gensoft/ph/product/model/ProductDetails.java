package com.gensoft.ph.product.model;

public class ProductDetails {
	
	private int productId;
	
	private int catId;

	private String productName;
	
	private String productDesc;
	
	private float price;
	
	private float discount;
	
	private float weight;
	
	private String picture;
	
	private String note;
	
	private String updateDate;
	
	private String delStatus;
	
	private String int1;
	
	private String int2;
	
	private String string1;
	
	private String string2;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	
	public String getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(String delStatus) {
		this.delStatus = delStatus;
	}

	public String getInt1() {
		return int1;
	}

	public void setInt1(String int1) {
		this.int1 = int1;
	}

	public String getInt2() {
		return int2;
	}

	public void setInt2(String int2) {
		this.int2 = int2;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", catId=" + catId + ", productName=" + productName
				+ ", productDesc=" + productDesc + ", price=" + price + ", discount=" + discount + ", weight=" + weight
				+ ", picture=" + picture + ", note=" + note + ", updateDate=" + updateDate + ", delStatus=" + delStatus
				+ ", int1=" + int1 + ", int2=" + int2 + ", string1=" + string1 + ", string2=" + string2 + "]";
	}

	
}
