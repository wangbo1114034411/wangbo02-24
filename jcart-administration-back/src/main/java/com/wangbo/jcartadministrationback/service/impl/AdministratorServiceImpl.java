package com.wangbo.jcartadministrationback.service.impl;

import com.wangbo.dto.in.*;
import com.wangbo.dto.out.AdministratorGetProfileOutDTO;
import com.wangbo.dto.out.AdministratorListOutDTO;
import com.wangbo.dto.out.AdministratorShowOutDTO;
import com.wangbo.dto.out.PageOutDTO;
import com.wangbo.jcartadministrationback.dao.AdministratorMapper;
import com.wangbo.jcartadministrationback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-27 17:44
 */
@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorMapper administratorMapper;


    @Override
    public String login(AdministratorLoginInDTO administratorLoginInDTO) {
        return null;
    }

    @Override
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId) {
        return null;
    }

    @Override
    public void updateProfile(AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO) {
    }

    @Override
    public String getPwdResetCode(String email) {
        return null;
    }

    @Override
    public void resetPwd(AdministratorResetPwdInDTO administratorResetPwdInDTO) {

    }

    @Override
    public PageOutDTO<AdministratorListOutDTO> getList(Integer pageNum) {
        return null;
    }

    @Override
    public AdministratorShowOutDTO getById(Integer administratorId) {
        return null;
    }

    @Override
    public Integer create(AdministratorCreateInDTO administratorCreateInDTO) {
        return null;
    }

    @Override
    public void update(AdministratorUpdateInDTO administratorUpdateInDTO) {

    }

    @Override
    public void delete(Integer adminstratorId) {

    }

    @Override
    public void batchDelete(List<Integer> administratorIds) {

    }
}
