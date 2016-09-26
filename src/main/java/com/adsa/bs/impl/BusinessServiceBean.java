package com.adsa.bs.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.adsa.bs.BusinessService;
import com.adsa.dto.SiteDTO;
/**
 * 
 * @author alberto.garcia
 *
 */
public class BusinessServiceBean implements BusinessService{

	@Override
	public List<SiteDTO> getProductList(String advertiserBusinessId) {
		Long advertiserId = Long.valueOf(StringUtils.substringBefore(advertiserBusinessId, "_"));
		Long BusinessId = Long.valueOf(StringUtils.substringAfter(advertiserBusinessId, "_"));
		return null;
	}

}
