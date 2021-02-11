package com.ptbc.simpleproject.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptbc.simpleproject.dto.Response;
import com.ptbc.simpleproject.dto.UserRequest;
import com.ptbc.simpleproject.model.MstUsers;
import com.ptbc.simpleproject.repository.MstUsersRepository;
import com.ptbc.simpleproject.service.MstUsersService;

@Service
public class MstUsersServiceImpl implements MstUsersService {
	
	@Autowired
	private MstUsersRepository mstUsersRepo;

	@Override
	public Response findAll() {
		Response r = new Response();
		r.setData(mstUsersRepo.findAll());
		r.setStatus("success");
		return r;
	}

	@Override
	@Transactional
	public Response save(UserRequest request) {
		Response r = new Response();
		MstUsers mr = new MstUsers();
		mr.setName(request.getName());
		mr.setPhone(request.getPhone());
		
		r.setData(mstUsersRepo.save(mr));
		r.setStatus("success");
		return r;
	}

	@Override
	public Response update(UserRequest request) {
		Response r = new Response();
		MstUsers mr = new MstUsers();
		mr.setId(request.getId());
		mr.setName(request.getName());
		mr.setPhone(request.getPhone());
		
		r.setData(mstUsersRepo.save(mr));
		r.setStatus("success");
		return r;
	}

	@Override
	public Response delete(int id) {
		Response r = new Response();
		mstUsersRepo.deleteById(id);
		r.setData("Id "+id+" Successfully Deleted");
		r.setStatus("success");
		return r;
	}

}
