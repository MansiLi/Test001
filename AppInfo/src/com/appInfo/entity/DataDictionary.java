package com.appInfo.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DataDictionary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "data_dictionary", catalog = "appinfodb")
public class DataDictionary implements java.io.Serializable {

	// Fields

	private Long id;
	private String typeCode;
	private String typeName;
	private Long valueId;
	private String valueName;
	private Long createdBy;
	private Timestamp creationDate;
	private Long modifyBy;
	private Timestamp modifyDate;

	// Constructors

	/** default constructor */
	public DataDictionary() {
	}

	/** full constructor */
	public DataDictionary(String typeCode, String typeName, Long valueId,
			String valueName, Long createdBy, Timestamp creationDate,
			Long modifyBy, Timestamp modifyDate) {
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.valueId = valueId;
		this.valueName = valueName;
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

	@Column(name = "typeCode", length = 50)
	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	@Column(name = "typeName", length = 50)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Column(name = "valueId")
	public Long getValueId() {
		return this.valueId;
	}

	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}

	@Column(name = "valueName", length = 50)
	public String getValueName() {
		return this.valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
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