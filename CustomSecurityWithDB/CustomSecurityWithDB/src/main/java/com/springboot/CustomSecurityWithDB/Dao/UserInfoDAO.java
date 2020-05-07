package com.springboot.CustomSecurityWithDB.Dao;

import com.springboot.CustomSecurityWithDB.entities.UserInfo;

public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}
