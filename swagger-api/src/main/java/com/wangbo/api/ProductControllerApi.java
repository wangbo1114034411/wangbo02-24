package com.wangbo.api;

import com.wangbo.dto.in.ProductCreateInDTO;
import com.wangbo.dto.in.ProductSearchInDTO;
import com.wangbo.dto.in.ProductUpdateInDTO;
import com.wangbo.dto.out.PageOutDTO;
import com.wangbo.dto.out.ProductListOutDTO;
import com.wangbo.dto.out.ProductShowOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-26 16:30
 */
@Api(value = "ProductControllerApi",description = "用户查询添加，登录")
public interface ProductControllerApi {

    @ApiOperation(value = "search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum);

    @ApiOperation(value = "getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId);

    @ApiOperation(value = "create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO);

    @ApiOperation(value = "update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO);

    @ApiOperation(value = "delete")
    public void delete(@RequestBody Integer productId);

    @ApiOperation(value = "batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds);
}
