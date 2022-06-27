package com.xender.practical.services;

import java.util.List;

import javax.transaction.InvalidTransactionException;

import com.xender.practical.exception.DataAlreadyExistsException;
import com.xender.practical.exception.DataNotFoundException;
import com.xender.practical.model.UserData;

public interface UserServices {
	public abstract UserData register(UserData user) throws DataAlreadyExistsException;
	public abstract UserData login(UserData user) throws DataNotFoundException;
	public abstract String logout(String msg) throws InvalidTransactionException;
	public abstract List<UserData> allUsers() throws DataNotFoundException;
	public abstract UserData resetPassword(UserData user) throws InvalidTransactionException;
}
