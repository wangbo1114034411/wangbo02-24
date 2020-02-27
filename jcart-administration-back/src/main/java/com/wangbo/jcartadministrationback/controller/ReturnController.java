package com.wangbo.jcartadministrationback.controller;


import com.wangbo.dto.in.ReturnSearchInDTO;
import com.wangbo.dto.in.ReturnUpdateActionInDTO;
import com.wangbo.dto.out.PageOutDTO;
import com.wangbo.dto.out.ReturnListOutDTO;
import com.wangbo.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
