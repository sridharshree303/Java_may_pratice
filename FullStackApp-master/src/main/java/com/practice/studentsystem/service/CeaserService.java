package com.practice.studentsystem.service;

public interface CeaserService {

	public String encrypt(String input, int key);
	public String encryptTwokeys(String input, int key1, int key2);
	public int getRandNumber();
	public String decrypt(String message,int key);
	public String decryptTwoKeys(String encrypted);
	public String decrptytwokey(String msg,int n1, int n2);
}
