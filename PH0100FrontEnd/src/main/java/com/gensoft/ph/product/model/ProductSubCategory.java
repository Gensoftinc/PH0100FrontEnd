package com.gensoft.ph.product.model;

public class ProductSubCategory {
	
	
	private int subCatId;
	
	private int catId;
	
	private String subCatDesc;
	
	private String subCatName;
	
	private String subCatImage;
	
	private int delStatus;
	
	private int type;
	
	private int int1;
	
	private int int2;
	
	private String string1;
	
	private String string2;

	public int getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getSubCatDesc() {
		return subCatDesc;
	}

	public void setSubCatDesc(String subCatDesc) {
		this.subCatDesc = subCatDesc;
	}

	public String getSubCatName() {
		return subCatName;
	}

	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	public String getSubCatImage() {
		return subCatImage;
	}

	public void setSubCatImage(String subCatImage) {
		this.subCatImage = subCatImage;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getInt1() {
		return int1;
	}

	public void setInt1(int int1) {
		this.int1 = int1;
	}

	public int getInt2() {
		return int2;
	}

	public void setInt2(int int2) {
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
		return "ProductSubCategory [subCatId=" + subCatId + ", catId=" + catId + ", subCatDesc=" + subCatDesc
				+ ", subCatName=" + subCatName + ", subCatImage=" + subCatImage + ", delStatus=" + delStatus + ", type="
				+ type + ", int1=" + int1 + ", int2=" + int2 + ", string1=" + string1 + ", string2=" + string2 + "]";
	}
	
	

}
