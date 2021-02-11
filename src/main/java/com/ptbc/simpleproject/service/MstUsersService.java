package com.ptbc.simpleproject.service;

import com.ptbc.simpleproject.dto.Response;
import com.ptbc.simpleproject.dto.UserRequest;

public interface MstUsersService {
	
	public Response findAll();
	
	public Response save(UserRequest request);
	
	public Response update(UserRequest request);
	
	public Response delete(int id);

}
