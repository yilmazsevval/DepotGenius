package com.depotgenius.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.depotgenius.entities.concretes.Role;
import com.depotgenius.entities.concretes.User;

public interface UserService extends BaseService<User> {

	String getUserRoles(User user);

	User getUser(UUID userId);

	boolean changePassword(String lastPassword, String newPassword, String email);

	List<Role> getAllRoles();
}
