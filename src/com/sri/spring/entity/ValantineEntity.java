package com.sri.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name="valantine")
public class ValantineEntity implements Serializable {
	@Id
	@GenericGenerator (name="sri",strategy = "increment")
	@GeneratedValue(generator = "sri")
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="status")
	private String status;
	@Column(name="amountspent")
	private double amountspent;
	@Column(name="gift")
	private String gift;
	
	public ValantineEntity() {
		System.out.println("created entity");
	}

	public ValantineEntity(String name, String status, double amountspent, String gift) {
		this.name = name;
		this.status = status;
		this.amountspent = amountspent;
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "ValantineEntity [id=" + id + ", name=" + name + ", status=" + status + ", amountspent=" + amountspent
				+ ", gift=" + gift + "]";
	}

}
