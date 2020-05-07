package com.springboot.CustomSecurityWithDB.Dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.CustomSecurityWithDB.entities.UserInfo;

@Repository
@Transactional
public class UserInfoDAOImpl implements com.springboot.CustomSecurityWithDB.Dao.UserInfoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public com.springboot.CustomSecurityWithDB.entities.UserInfo getActiveUser(String userName) {
		UserInfo userInfo = new UserInfo();
		short ENABLED = 1;
		List<?> list = entityManager.createQuery("SELECT u FROM UserInfo u WHERE userName=?1 and enabled=?2")
				.setParameter(1, userName).setParameter(2, ENABLED).getResultList();
		if (!list.isEmpty()) {
			userInfo = (UserInfo) list.get(0);
		}
		return userInfo;
	}
}
