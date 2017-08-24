package com.appInfo.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AppVersion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "app_version", catalog = "appinfodb")
public class AppVersion implements java.io.Serializable {

	// Fields

	private Long id;
	private Long appId;
	private String versionNo;
	private String versionInfo;
	private Long publishStatus;
	private String downloadLink;
	private Double versionSize;
	private Long createdBy;
	private Timestamp creationDate;
	private Long modifyBy;
	private Timestamp modifyDate;
	private String apkLocPath;
	private String apkFileName;

	// Constructors

	/** default constructor */
	public AppVersion() {
	}

	/** full constructor */
	public AppVersion(Long appId, String versionNo, String versionInfo,
			Long publishStatus, String downloadLink, Double versionSize,
			Long createdBy, Timestamp creationDate, Long modifyBy,
			Timestamp modifyDate, String apkLocPath, String apkFileName) {
		this.appId = appId;
		this.versionNo = versionNo;
		this.versionInfo = versionInfo;
		this.publishStatus = publishStatus;
		this.downloadLink = downloadLink;
		this.versionSize = versionSize;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.apkLocPath = apkLocPath;
		this.apkFileName = apkFileName;
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

	@Column(name = "versionNo", length = 50)
	public String getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	@Column(name = "versionInfo", length = 2000)
	public String getVersionInfo() {
		return this.versionInfo;
	}

	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}

	@Column(name = "publishStatus")
	public Long getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(Long publishStatus) {
		this.publishStatus = publishStatus;
	}

	@Column(name = "downloadLink", length = 500)
	public String getDownloadLink() {
		return this.downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	@Column(name = "versionSize", precision = 20)
	public Double getVersionSize() {
		return this.versionSize;
	}

	public void setVersionSize(Double versionSize) {
		this.versionSize = versionSize;
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

	@Column(name = "apkLocPath", length = 500)
	public String getApkLocPath() {
		return this.apkLocPath;
	}

	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}

	@Column(name = "apkFileName", length = 500)
	public String getApkFileName() {
		return this.apkFileName;
	}

	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}

}