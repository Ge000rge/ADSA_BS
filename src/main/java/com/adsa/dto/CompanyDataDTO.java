package com.adsa.dto;
import com.adsa.dto.StructuredOpeningHoursDTO;
import com.adsa.dto.PaymentOptionsDTO;

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
	//TODO
	private String noProblemNumber;
	//TODO
	private String noProblemMobile;
	private String defaultPhone;
	//TODO
	private String defaultPhoneLinkToKey;
	private String email;
	private String facebook;
	private String googlePlus;
	private String twitter;
	//TODO
	private String pInterest;
	private String instagram;
	private String linkedIn;
	private String youtubeChannel;
	private String blog;
	//TODO
	private String packageKey;
	private String mainSite;
	private String websiteDomain;
	//TODO
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
	public Boolean getUseStructuredOpeningHoursAsCompanyOpeningHours() {
		return useStructuredOpeningHoursAsCompanyOpeningHours;
	}
	public void setUseStructuredOpeningHoursAsCompanyOpeningHours(Boolean useStructuredOpeningHoursAsCompanyOpeningHours) {
		this.useStructuredOpeningHoursAsCompanyOpeningHours = useStructuredOpeningHoursAsCompanyOpeningHours;
	}
	public String getLogoSrc() {
		return logoSrc;
	}
	public void setLogoSrc(String logoSrc) {
		this.logoSrc = logoSrc;
	}
	public String getMainImageSrc() {
		return mainImageSrc;
	}
	public void setMainImageSrc(String mainImageSrc) {
		this.mainImageSrc = mainImageSrc;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getMainImageUrl() {
		return mainImageUrl;
	}
	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}
	public PaymentOptionsDTO getPaymentOptionsDTO() {
		return paymentOptionsDTO;
	}
	public void setPaymentOptionsDTO(PaymentOptionsDTO paymentOptionsDTO) {
		this.paymentOptionsDTO = paymentOptionsDTO;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getUseStructuredAddressAsCompanyAddress() {
		return useStructuredAddressAsCompanyAddress;
	}
	public void setUseStructuredAddressAsCompanyAddress(Boolean useStructuredAddressAsCompanyAddress) {
		this.useStructuredAddressAsCompanyAddress = useStructuredAddressAsCompanyAddress;
	}
	public Boolean getHideCountry() {
		return hideCountry;
	}
	public void setHideCountry(Boolean hideCountry) {
		this.hideCountry = hideCountry;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDisplayNumber() {
		return displayNumber;
	}
	public void setDisplayNumber(String displayNumber) {
		this.displayNumber = displayNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGoldNumber() {
		return goldNumber;
	}
	public void setGoldNumber(String goldNumber) {
		this.goldNumber = goldNumber;
	}
	public String getShortNumber() {
		return shortNumber;
	}
	public void setShortNumber(String shortNumber) {
		this.shortNumber = shortNumber;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getNoProblemNumber() {
		return noProblemNumber;
	}
	public void setNoProblemNumber(String noProblemNumber) {
		this.noProblemNumber = noProblemNumber;
	}
	public String getNoProblemMobile() {
		return noProblemMobile;
	}
	public void setNoProblemMobile(String noProblemMobile) {
		this.noProblemMobile = noProblemMobile;
	}
	public String getDefaultPhone() {
		return defaultPhone;
	}
	public void setDefaultPhone(String defaultPhone) {
		this.defaultPhone = defaultPhone;
	}
	public String getDefaultPhoneLinkToKey() {
		return defaultPhoneLinkToKey;
	}
	public void setDefaultPhoneLinkToKey(String defaultPhoneLinkToKey) {
		this.defaultPhoneLinkToKey = defaultPhoneLinkToKey;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getGooglePlus() {
		return googlePlus;
	}
	public void setGooglePlus(String googlePlus) {
		this.googlePlus = googlePlus;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getpInterest() {
		return pInterest;
	}
	public void setpInterest(String pInterest) {
		this.pInterest = pInterest;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	public String getYoutubeChannel() {
		return youtubeChannel;
	}
	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	public String getPackageKey() {
		return packageKey;
	}
	public void setPackageKey(String packageKey) {
		this.packageKey = packageKey;
	}
	public String getMainSite() {
		return mainSite;
	}
	public void setMainSite(String mainSite) {
		this.mainSite = mainSite;
	}
	public String getWebsiteDomain() {
		return websiteDomain;
	}
	public void setWebsiteDomain(String websiteDomain) {
		this.websiteDomain = websiteDomain;
	}
	public String getDashboardOrder() {
		return dashboardOrder;
	}
	public void setDashboardOrder(String dashboardOrder) {
		this.dashboardOrder = dashboardOrder;
	}
	
}
