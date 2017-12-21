package com.contact.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProfileImage {
	@Id
	@GeneratedValue
	private int id;

}
