package com.wangbo.clientservice;


import com.wangbo.dto.in.ProductCreateInDTO;
import com.wangbo.dto.in.ProductSearchInDTO;
import com.wangbo.dto.in.ProductUpdateInDTO;
import com.wangbo.dto.out.PageOutDTO;
import com.wangbo.dto.out.ProductListOutDTO;
import com.wangbo.dto.out.ProductShowOutDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(value = "MICROSERVICECLOUD-PRODUCT")
public interface DeptClientService
{
	@GetMapping("/search")
	public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
												@RequestParam(required = false, defaultValue = "1") Integer pageNum);
	@GetMapping("/getById/{productId}")
	public ProductShowOutDTO getById(@RequestParam Integer productId);

	@PostMapping("/create")
	public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO);

	@PostMapping("/update")
	public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO);

	@PostMapping("/delete")
	public void delete(@RequestBody Integer productId);

	@PostMapping("/batchDelete")
	public void batchDelete(@RequestBody List<Integer> productIds);
}
