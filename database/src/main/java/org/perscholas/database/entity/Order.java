package org.perscholas.database.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "orders")

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private @Getter @Setter Integer id;

	@Column(name = "customer_id", insertable=false, updatable=false)
	private @Getter @Setter Integer customerId;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private @Getter @Setter Customer customer;

	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private @Getter @Setter List<OrderDetails> orderDetails;

	@Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private @Getter @Setter Date orderDate;

	@Column(name = "required_date")
    @Temporal(TemporalType.DATE)
    private @Getter @Setter Date requiredDate;

	@Column(name = "shipped_date")
    @Temporal(TemporalType.DATE)
    private @Getter @Setter Date shippedDate;

	@Column(name = "status")
	private @Getter @Setter String status;

	@Column(name = "comments")
	private @Getter @Setter String comments;

	@Override
	public int hashCode() {
		return Objects.hash(comments, customer, customerId, id, orderDate, orderDetails, requiredDate, shippedDate,
				status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(comments, other.comments)
				&& Objects.equals(customerId, other.customerId) && Objects.equals(id, other.id)
				&& Objects.equals(orderDate, other.orderDate)
				&& Objects.equals(requiredDate, other.requiredDate) && Objects.equals(shippedDate, other.shippedDate)
				&& Objects.equals(status, other.status);
	}
	
	

	
}