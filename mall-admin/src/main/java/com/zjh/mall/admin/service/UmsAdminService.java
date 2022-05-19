package com.zjh.mall.admin.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UmsAdminService {
    UserDetails loadUserByUsername(String username);
}
