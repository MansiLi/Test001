package com.appInfo.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdPromotion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ad_promotion", catalog = "appinfodb")
public class AdPromotion implements java.io.Serializable {

	// Fields

	private Long id;
	private Long appId;
	private String adPicPath;
	private Long adPv;
	private Integer carouselPosition;
	private Timestamp startTime;
	private Timestamp endTime;
	private Long createdBy;
	private Timestamp creationDate;
	private Long modifyBy;
	private Timestamp modifyDate;

	// Constructors

	/** default constructor */
	public AdPromotion() {
	}

	/** full constructor */
	public AdPromotion(Long appId, String adPicPath, Long adPv,
			Integer carouselPosition, Timestamp startTime, Timestamp endTime,
			Long createdBy, Timestamp creationDate, Long modifyBy,
			Timestamp modifyDate) {
		this.appId = appId;
		this.adPicPath = adPicPath;
		this.adPv = adPv;
		this.carouselPosition = carouselPosition;
		this.startTime = startTime;
		this.endTime = endTime;
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

	@Column(name = "appId")
	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	@Column(name = "adPicPath", length = 100)
	public String getAdPicPath() {
		return this.adPicPath;
	}

	public void setAdPicPath(String adPicPath) {
		this.adPicPath = adPicPath;
	}

	@Column(name = "adPV")
	public Long getAdPv() {
		return this.adPv;
	}

	public void setAdPv(Long adPv) {
		this.adPv = adPv;
	}

	@Column(name = "carouselPosition")
	public Integer getCarouselPosition() {
		return this.carouselPosition;
	}

	public void setCarouselPosition(Integer carouselPosition) {
		this.carouselPosition = carouselPosition;
	}

	@Column(name = "startTime", length = 0)
	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	@Column(name = "endTime", length = 0)
	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
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