package com.banyuijo.foundation.repository;

import com.banyuijo.foundation.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductTypeRepository extends JpaRepository <ProductType, UUID> {
    Boolean existsByProductTypeCode(String productTypeCode);
    ProductType findByProductTypeCode(String productTypeCode);
}
