package com.adsa.dto;
/**
 * 
 * @author alberto.garcia
 *
 */
public class CompanyDataDTO {
	//TODO
	private Boolean isConnectToApi;
	private String category;
	//TODO
	private String categories;
	private String timeZone;
	private String companyName;
	//TODO
	private String companyId;
	private String slogan;
	private String description;
	//TODO
	private String openingHours;
	private StructuredOpeningHoursDTO structuredOpeningHoursDTO;
	private Boolean useStructuredOpeningHoursAsCompanyOpeningHours;
	private String logoSrc;
	private String mainImageSrc;
	private String logoUrl;
	private String mainImageUrl;
	private PaymentOptionsDTO paymentOptionsDTO;
	//TODO
	private String address;
	private Boolean useStructuredAddressAsCompanyAddress;
	private Boolean hideCountry;
	private String latitude;
	private String longitude;
	private String displayNumber;
	private String phone;
	private String mobile;
	//TODO
	private String goldNumber;
	private String shortNumber;
	private String fax;
	private String noProblemNumber;
	private String noProblemMobile;
	private String default_phone;
	private String default_phone_link_to_key;
	private String email;
	private String facebook;
	private String googleplus;
	private String twitter;
	private String pinterest;
	private String instagram;
	private String linkedin;
	private String youtubechannel;
	private String blog;
	private String package_key;
	private String mainsite;
	private String websiteDomain;
	private String dashboardOrder;

	public Boolean getIsConnectToApi() {
		return isConnectToApi;
	}
	public void setIsConnectToApi(Boolean isConnectToApi) {
		this.isConnectToApi = isConnectToApi;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public StructuredOpeningHoursDTO getStructuredOpeningHoursDTO() {
		return structuredOpeningHoursDTO;
	}
	public void setStructuredOpeningHoursDTO(StructuredOpeningHoursDTO structuredOpeningHoursDTO) {
		this.structuredOpeningHoursDTO = structuredOpeningHoursDTO;
	}
	
	
}
