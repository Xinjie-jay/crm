package com.bjpowernode.crm.settings.dao;

import com.bjpowernode.crm.settings.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackson
 * @date 2021/8/7
 */
public interface UserDao {

	User login(Map<String, String> map);

}
