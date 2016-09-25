package com.adsa.dto;
/**
 * 
 * @author alberto.garcia
 *
 */
public class SiteDTO {
	private String advertiserBusinessId;
	private Long bcProductId;
	private BusinessContactDTO businessContactDTO;
	private CompanyDataDTO companyDataDTO;
	public String getAdvertiserBusinessId() {
		return advertiserBusinessId;
	}
	public void setAdvertiserBusinessId(String advertiserBusinessId) {
		this.advertiserBusinessId = advertiserBusinessId;
	}
	public Long getBcProductId() {
		return bcProductId;
	}
	public void setBcProductId(Long bcProductId) {
		this.bcProductId = bcProductId;
	}
	public BusinessContactDTO getBusinessContactDTO() {
		return businessContactDTO;
	}
	public void setBusinessContactDTO(BusinessContactDTO businessContactDTO) {
		this.businessContactDTO = businessContactDTO;
	}
	public CompanyDataDTO getCompanyDataDTO() {
		return companyDataDTO;
	}
	public void setCompanyDataDTO(CompanyDataDTO companyDataDTO) {
		this.companyDataDTO = companyDataDTO;
	}
	
}
