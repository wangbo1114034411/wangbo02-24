package com.wangbo.jcartadministrationback.service;

import com.wangbo.dto.in.*;
import com.wangbo.dto.out.AdministratorGetProfileOutDTO;
import com.wangbo.dto.out.AdministratorListOutDTO;
import com.wangbo.dto.out.AdministratorShowOutDTO;
import com.wangbo.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-27 17:39
 */
public interface AdministratorService {

    public String login(AdministratorLoginInDTO administratorLoginInDTO);

    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId);

    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO);

    public String getPwdResetCode(@RequestParam String email);

    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO);

    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum);

    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId);


    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO);

    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO);

    public void delete(@RequestBody Integer adminstratorId);

    public void batchDelete(@RequestBody List<Integer> administratorIds);
}
