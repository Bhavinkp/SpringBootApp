package com.bkp.learning.pojo;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User {

	@NumberFormat
	private int id;
	
	@Size(min = 2, message = "Name should have atleast 2 charachters")
	@ApiModelProperty(notes = "Name should have atleast 2 charachters")
	private String userName;
	
	@JsonIgnore
	private String userRight;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userRight
	 */
	public String getUserRight() {
		return userRight;
	}
	/**
	 * @param userRight the userRight to set
	 */
	public void setUserRight(String userRight) {
		this.userRight = userRight;
	}
	
	public User(int id, String userName, String userRight) {
		super();
		this.id = id;
		this.userName = userName;
		this.userRight = userRight;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userRight=" + userRight + ", getId()=" + getId()
				+ ", getUserName()=" + getUserName() + ", getUserRight()=" + getUserRight() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
