package com.gensoft.ph.product.model;

import java.util.List;

public class GetCatAndSubCat {
	
    private int catId;
	
	private String catName;
	
	private String catDesc;
	
	private int type;
	
	private int delStatus;
	
	private String pictures;
	
    private String int1;
	
	private String int2;
	
	private String string1;
	
	private String string2;
	
	List<ProductSubCategory> productSubCategory;

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public String getPictures() {
		return pictures;
	}

	public void setPictures(String pictures) {
		this.pictures = pictures;
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

	public List<ProductSubCategory> getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(List<ProductSubCategory> productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	@Override
	public String toString() {
		return "GetCatAndSubCat [catId=" + catId + ", catName=" + catName + ", catDesc=" + catDesc + ", type=" + type
				+ ", delStatus=" + delStatus + ", pictures=" + pictures + ", int1=" + int1 + ", int2=" + int2
				+ ", string1=" + string1 + ", string2=" + string2 + ", productSubCategory=" + productSubCategory + "]";
	}
	
	

}
