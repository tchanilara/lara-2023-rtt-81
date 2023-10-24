package org.perscholas.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "products")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "product_code")
	private String productCode;

	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "productline_id")
	private Integer productlineId;
	
	@Column(name = "product_scale")
	private String productScale;
	
	@Column(name = "product_vendor")
	private String productVendor;

	@Column(name = "product_description")
	private String productDescription;
	
	@Column(name = "quantity_in_stock", columnDefinition = "smallint")
	private Integer quantityInStock;
	
	@Column(name = "buy_price", columnDefinition="Decimal(10,2)")
	private Double buyPrice;
	
	@Column(name = "msrp", columnDefinition="Decimal(10,2)")
	private Double msrp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductlineId() {
		return productlineId;
	}

	public void setProductlineId(Integer productlineId) {
		this.productlineId = productlineId;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getMsrp() {
		return msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}
	
	//getters and setters
	

} 