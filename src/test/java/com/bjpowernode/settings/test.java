package com.bjpowernode.settings;

import com.bjpowernode.crm.utils.DateTimeUtil;
import com.bjpowernode.crm.utils.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jackson
 * @date 2021/8/8
 */
public class test {

	public static void main(String[] args) {

		// //验证失效时间
		// String expireTime = "2021-09-08 01:40:10";
		// //当前系统时间
		// String currentTime = DateTimeUtil.getSysTime();
		// int count = expireTime.compareTo(currentTime);  //大于0：    小于0：      后-前
		// System.out.println(count);

		//MD5加密
		String pwd = "zxd10171874";
		String md5 = MD5Util.getMD5(pwd);
		System.out.println(md5);
	}
}
