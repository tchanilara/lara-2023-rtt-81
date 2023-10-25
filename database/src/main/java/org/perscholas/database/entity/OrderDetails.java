package org.perscholas.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "orderdetails")

public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private @Getter @Setter Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "order_id", nullable = false)
	private @Getter @Setter Order order;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "product_id", nullable = false)
	private @Getter @Setter Product product;
	
	@Column(name = "order_id", insertable=false, updatable=false)
	private @Getter @Setter Integer orderId;

	@Column(name = "product_id", insertable=false, updatable=false)
	private @Getter @Setter Integer productId;

	@Column(name = "quantity_ordered")
	private @Getter @Setter Integer quantityOrdered;

	@Column(name = "price_each", columnDefinition="Decimal(10,2)")
	private @Getter @Setter Double priceEach;

	@Column(name = "order_line_number", columnDefinition = "smallint")
	private @Getter @Setter Integer orderLineNumber;

	
}