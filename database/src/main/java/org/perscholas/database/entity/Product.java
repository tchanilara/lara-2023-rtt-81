package org.perscholas.database.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "products")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private @Getter @Setter Integer id;
	

	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private @Getter @Setter List<OrderDetails> orderDetails;

	@Column(name = "product_code")
	private @Getter @Setter String productCode;

	@Column(name = "product_name")
	private @Getter @Setter String productName;

	@Column(name = "productline_id")
	private @Getter @Setter Integer productlineId;

	@Column(name = "product_scale")
	private @Getter @Setter String productScale;

	@Column(name = "product_vendor")
	private @Getter @Setter String productVendor;

	@Column(name = "product_description")
	private @Getter @Setter String productDescription;

	@Column(name = "quantity_in_stock", columnDefinition = "smallint")
	private @Getter @Setter Integer quantityInStock;

	@Column(name = "buy_price", columnDefinition="Decimal(10,2)")
	private @Getter @Setter Double buyPrice;

	@Column(name = "msrp", columnDefinition="Decimal(10,2)")
	private @Getter @Setter Double msrp;


}