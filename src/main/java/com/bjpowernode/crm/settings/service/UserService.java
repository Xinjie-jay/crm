package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.exception.LoginException;
import com.bjpowernode.crm.settings.domain.User;

/**
 * @author jackson
 * @date 2021/8/7
 */
public interface UserService {
	User login(String loginAct, String loginPwd, String ip) throws LoginException;

}
