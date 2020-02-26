package io.cjf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.wangbo.dto.in.ProductCreateInDTO;
import com.wangbo.dto.in.ProductUpdateInDTO;
import com.wangbo.dto.out.ProductListOutDTO;
import com.wangbo.dto.out.ProductShowOutDTO;


import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
