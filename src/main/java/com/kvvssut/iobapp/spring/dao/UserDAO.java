package com.kvvssut.iobapp.spring.dao;

import java.util.List;
import com.kvvssut.iobapp.spring.model.User;

public interface UserDAO {
	public List<User> list();
}