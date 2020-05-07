package com.springboot.CustomSecurityWithDB;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("vijay"));
		System.out.println(bCryptPasswordEncoder.encode("guest"));
	}
}
