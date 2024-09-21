package com.banyuijo.product.service.product.site.structure.detail;

import com.banyuijo.product.dto.product.site.structure.detail.SiteProductDetailStructureOutput;
import com.banyuijo.product.dto.product.site.structure.edit.SiteProductEditStructure;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.UUID;

public interface SiteProductDetailStructureService {
    SiteProductDetailStructureOutput getSiteProductStructureDetail(UUID siteProductId) throws JsonProcessingException;
    SiteProductEditStructure getEditDetail (UUID siteProductId);

}
