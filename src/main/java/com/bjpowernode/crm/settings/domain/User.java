package com.bjpowernode.crm.settings.domain;

import java.util.Objects;

/**
 * @author jackson
 * @date 2021/8/7
 */
public class User {
	/**
	 * 关于字符串中表现的日期及时间
	 * 常用有两种表现方式
	 *  日期：年月日
	 *  	yyyy-MM-dd 10位字符串
	 *
	 *  日期+时间：年月日时分秒 19位字符串
	 *  	yyyy-MM-dd HH:mm:ss
	 *
	 *
	 */
	private String id; // 编号  主键
	private String loginAct;  //登陆账号
	private String name;  //用户真实姓名
	private String loginPwd;  // 登陆密码
	private String email;  // 邮箱
	private String expireTime;  // 失效时间
	private String lockState;  // 锁定状态  0：表示锁定   1： 表示启用
	private String deptno;  //  部门编号
	private String allowIps;  // 允许访问的IP地址
	private String createTime;  // 创建时间
	private String createBy;  //  创建人
	private String editTime;  // 修改时间
	private String editBy;  // 修改人

	public User() {
	}

	public User(String id, String loginAct, String name, String loginPwd, String email, String expireTime, String lockState, String deptno, String allowIps, String createTime, String createBy, String editTime, String editBy) {
		this.id = id;
		this.loginAct = loginAct;
		this.name = name;
		this.loginPwd = loginPwd;
		this.email = email;
		this.expireTime = expireTime;
		this.lockState = lockState;
		this.deptno = deptno;
		this.allowIps = allowIps;
		this.createTime = createTime;
		this.createBy = createBy;
		this.editTime = editTime;
		this.editBy = editBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginAct() {
		return loginAct;
	}

	public void setLoginAct(String loginAct) {
		this.loginAct = loginAct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getLockState() {
		return lockState;
	}

	public void setLockState(String lockState) {
		this.lockState = lockState;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getAllowIps() {
		return allowIps;
	}

	public void setAllowIps(String allowIps) {
		this.allowIps = allowIps;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getEditTime() {
		return editTime;
	}

	public void setEditTime(String editTime) {
		this.editTime = editTime;
	}

	public String getEditBy() {
		return editBy;
	}

	public void setEditBy(String editBy) {
		this.editBy = editBy;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(id, user.id) &&
				Objects.equals(loginAct, user.loginAct) &&
				Objects.equals(name, user.name) &&
				Objects.equals(loginPwd, user.loginPwd) &&
				Objects.equals(email, user.email) &&
				Objects.equals(expireTime, user.expireTime) &&
				Objects.equals(lockState, user.lockState) &&
				Objects.equals(deptno, user.deptno) &&
				Objects.equals(allowIps, user.allowIps) &&
				Objects.equals(createTime, user.createTime) &&
				Objects.equals(createBy, user.createBy) &&
				Objects.equals(editTime, user.editTime) &&
				Objects.equals(editBy, user.editBy);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, loginAct, name, loginPwd, email, expireTime, lockState, deptno, allowIps, createTime, createBy, editTime, editBy);
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", loginAct='" + loginAct + '\'' +
				", name='" + name + '\'' +
				", loginPwd='" + loginPwd + '\'' +
				", email='" + email + '\'' +
				", expireTime='" + expireTime + '\'' +
				", lockState='" + lockState + '\'' +
				", deptno='" + deptno + '\'' +
				", allowIps='" + allowIps + '\'' +
				", createTime='" + createTime + '\'' +
				", createBy='" + createBy + '\'' +
				", editTime='" + editTime + '\'' +
				", editBy='" + editBy + '\'' +
				'}';
	}
}
