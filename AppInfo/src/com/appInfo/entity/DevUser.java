package com.appInfo.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DevUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "dev_user", catalog = "appinfodb")
public class DevUser implements java.io.Serializable {

	// Fields

	private Long id;
	private String devCode;
	private String devName;
	private String devPassword;
	private String devEmail;
	private String devInfo;
	private Long createdBy;
	private Timestamp creationDate;
	private Long modifyBy;
	private Timestamp modifyDate;

	// Constructors

	/** default constructor */
	public DevUser() {
	}

	/** full constructor */
	public DevUser(String devCode, String devName, String devPassword,
			String devEmail, String devInfo, Long createdBy,
			Timestamp creationDate, Long modifyBy, Timestamp modifyDate) {
		this.devCode = devCode;
		this.devName = devName;
		this.devPassword = devPassword;
		this.devEmail = devEmail;
		this.devInfo = devInfo;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "devCode", length = 50)
	public String getDevCode() {
		return this.devCode;
	}

	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}

	@Column(name = "devName", length = 50)
	public String getDevName() {
		return this.devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	@Column(name = "devPassword", length = 50)
	public String getDevPassword() {
		return this.devPassword;
	}

	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}

	@Column(name = "devEmail", length = 50)
	public String getDevEmail() {
		return this.devEmail;
	}

	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}

	@Column(name = "devInfo", length = 500)
	public String getDevInfo() {
		return this.devInfo;
	}

	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
	}

	@Column(name = "createdBy")
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "creationDate", length = 0)
	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "modifyBy")
	public Long getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "modifyDate", length = 0)
	public Timestamp getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

}