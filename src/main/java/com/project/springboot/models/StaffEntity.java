package com.project.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "staff")
public class StaffEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column(name = "staff_name")
	private String staffName;
	@Column(name = "staff_father")
	private String staffFather;
	@Column(name = "staff_CNIC")
	private String staffCNIC;
}
