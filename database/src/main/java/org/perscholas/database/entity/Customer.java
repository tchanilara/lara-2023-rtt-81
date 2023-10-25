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
@Table(name= "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private @Getter @Setter Integer id;

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private @Getter @Setter List<Order> orders;
	
	@Column(name = "customer_name")
	private @Getter @Setter String customerName;

	@Column(name = "contact_lastname")
	private @Getter @Setter String contactLastname;

	@Column(name = "contact_firstname")
	private @Getter @Setter String contactFirstname;

	@Column(name = "phone")
	private @Getter @Setter String phone;

	@Column(name = "address_line1")
	private @Getter @Setter String addressLine1;

	@Column(name = "address_line2")
	private @Getter @Setter String addressLine2;

	@Column(name = "city")
	private @Getter @Setter String city;

	@Column(name = "state")
	private @Getter @Setter String state;

	@Column(name = "postal_code")
	private @Getter @Setter String postalCode;

	@Column(name = "country")
	private @Getter @Setter String country;

	@Column(name = "sales_rep_employee_id")
	private @Getter @Setter Integer salesRepEmployeeId;

	@Column(name = "credit_limit", columnDefinition="Decimal(10,2)")
	private @Getter @Setter Double creditLimit;

}
