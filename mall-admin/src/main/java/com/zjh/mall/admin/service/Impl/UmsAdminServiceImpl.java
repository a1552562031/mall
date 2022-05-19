package com.zjh.mall.admin.service.Impl;

import com.zjh.mall.admin.service.UmsAdminService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Override
    public UserDetails loadUserByUsername(String username) {
        return null;
    }
}
