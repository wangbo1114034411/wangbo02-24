package io.cjf.jcartadministrationback.controller;

import com.wangbo.api.CustomerControllerApi;
import com.wangbo.dto.in.CustomerSearchInDTO;
import com.wangbo.dto.out.CustomerListOutDTO;
import com.wangbo.dto.out.CustomerShowOutDTO;
import com.wangbo.dto.out.PageOutDTO;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController implements CustomerControllerApi {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
