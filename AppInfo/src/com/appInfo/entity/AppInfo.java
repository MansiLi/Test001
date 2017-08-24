package com.appInfo.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AppInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "app_info", catalog = "appinfodb")
public class AppInfo implements java.io.Serializable {

	// Fields

	private Long id;
	private String softwareName;
	private String apkname;
	private String supportRom;
	private String interfaceLanguage;
	private Double softwareSize;
	private Date updateDate;
	private Long devId;
	private String appInfo;
	private Long status;
	private Timestamp onSaleDate;
	private Timestamp offSaleDate;
	private Long flatformId;
	private Long categoryLevel3;
	private Long downloads;
	private Long createdBy;
	private Timestamp creationDate;
	private Long modifyBy;
	private Timestamp modifyDate;
	private Long categoryLevel1;
	private Long categoryLevel2;
	private String logoPicPath;
	private String logoLocPath;
	private Long versionId;

	// Constructors

	/** default constructor */
	public AppInfo() {
	}

	/** full constructor */
	public AppInfo(String softwareName, String apkname, String supportRom,
			String interfaceLanguage, Double softwareSize, Date updateDate,
			Long devId, String appInfo, Long status, Timestamp onSaleDate,
			Timestamp offSaleDate, Long flatformId, Long categoryLevel3,
			Long downloads, Long createdBy, Timestamp creationDate,
			Long modifyBy, Timestamp modifyDate, Long categoryLevel1,
			Long categoryLevel2, String logoPicPath, String logoLocPath,
			Long versionId) {
		this.softwareName = softwareName;
		this.apkname = apkname;
		this.supportRom = supportRom;
		this.interfaceLanguage = interfaceLanguage;
		this.softwareSize = softwareSize;
		this.updateDate = updateDate;
		this.devId = devId;
		this.appInfo = appInfo;
		this.status = status;
		this.onSaleDate = onSaleDate;
		this.offSaleDate = offSaleDate;
		this.flatformId = flatformId;
		this.categoryLevel3 = categoryLevel3;
		this.downloads = downloads;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.categoryLevel1 = categoryLevel1;
		this.categoryLevel2 = categoryLevel2;
		this.logoPicPath = logoPicPath;
		this.logoLocPath = logoLocPath;
		this.versionId = versionId;
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

	@Column(name = "softwareName", length = 50)
	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	@Column(name = "APKName", length = 50)
	public String getApkname() {
		return this.apkname;
	}

	public void setApkname(String apkname) {
		this.apkname = apkname;
	}

	@Column(name = "supportROM", length = 50)
	public String getSupportRom() {
		return this.supportRom;
	}

	public void setSupportRom(String supportRom) {
		this.supportRom = supportRom;
	}

	@Column(name = "interfaceLanguage", length = 50)
	public String getInterfaceLanguage() {
		return this.interfaceLanguage;
	}

	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}

	@Column(name = "softwareSize", precision = 20)
	public Double getSoftwareSize() {
		return this.softwareSize;
	}

	public void setSoftwareSize(Double softwareSize) {
		this.softwareSize = softwareSize;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "updateDate", length = 0)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "devId")
	public Long getDevId() {
		return this.devId;
	}

	public void setDevId(Long devId) {
		this.devId = devId;
	}

	@Column(name = "appInfo", length = 5000)
	public String getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	@Column(name = "status")
	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@Column(name = "onSaleDate", length = 0)
	public Timestamp getOnSaleDate() {
		return this.onSaleDate;
	}

	public void setOnSaleDate(Timestamp onSaleDate) {
		this.onSaleDate = onSaleDate;
	}

	@Column(name = "offSaleDate", length = 0)
	public Timestamp getOffSaleDate() {
		return this.offSaleDate;
	}

	public void setOffSaleDate(Timestamp offSaleDate) {
		this.offSaleDate = offSaleDate;
	}

	@Column(name = "flatformId")
	public Long getFlatformId() {
		return this.flatformId;
	}

	public void setFlatformId(Long flatformId) {
		this.flatformId = flatformId;
	}

	@Column(name = "categoryLevel3")
	public Long getCategoryLevel3() {
		return this.categoryLevel3;
	}

	public void setCategoryLevel3(Long categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}

	@Column(name = "downloads")
	public Long getDownloads() {
		return this.downloads;
	}

	public void setDownloads(Long downloads) {
		this.downloads = downloads;
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

	@Column(name = "categoryLevel1")
	public Long getCategoryLevel1() {
		return this.categoryLevel1;
	}

	public void setCategoryLevel1(Long categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}

	@Column(name = "categoryLevel2")
	public Long getCategoryLevel2() {
		return this.categoryLevel2;
	}

	public void setCategoryLevel2(Long categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}

	@Column(name = "logoPicPath", length = 500)
	public String getLogoPicPath() {
		return this.logoPicPath;
	}

	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}

	@Column(name = "logoLocPath", length = 500)
	public String getLogoLocPath() {
		return this.logoLocPath;
	}

	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}

	@Column(name = "versionId")
	public Long getVersionId() {
		return this.versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}

}