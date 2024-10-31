package com.descomplica.FrameBlog.service;

import java.util.List;

import com.descomplica.FrameBlog.models.User;

public interface UserService {

	User save(User user);

	List<User> getAll();

	User get(Long id);

	User update(long id, User user);

	User delete(long id);

}
