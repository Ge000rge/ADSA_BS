package com.adsa.bs;

import java.util.List;

import com.adsa.dto.SiteDTO;

/**
 * 
 * @author alberto.garcia
 *
 */
public interface BusinessService {
	List<SiteDTO> getProductList(String advertiserBusinessId);
}
