package com.ing.breachmanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bussinessarea")
@Setter
@Getter
public class BussinessArea implements Serializable{

	private static final long serialVersionUID = 235970504552538937L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String bussinessarea;
	@Column(name = "f_id")
	private Integer fid;
}
