package com.santosh.inventory.model.oracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
	@Column(name = "id")
	private Integer brandId;

	@Column(name = "name")
	private String brandName;
	
	@Column(name = "shortBrand")
	private String shortBrand;
	
	@Column(name = "categoryId")
	private String categoryId;



	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getShortBrand() {
		return shortBrand;
	}

	public void setShortBrand(String shortBrand) {
		this.shortBrand = shortBrand;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
