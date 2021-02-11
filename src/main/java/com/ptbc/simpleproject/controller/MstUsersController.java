package com.ptbc.simpleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ptbc.simpleproject.dto.Response;
import com.ptbc.simpleproject.dto.UserRequest;
import com.ptbc.simpleproject.service.MstUsersService;

@RestController
@RequestMapping("/v1/users")
public class MstUsersController {
	
	@Autowired
	private MstUsersService mstUsersService;
	
	@PostMapping(value = "/save", produces = {"application/json"})
	public Response save(@RequestBody UserRequest request) {
		return mstUsersService.save(request);
	}
	
	@PatchMapping(value = "/update", produces = {"application/json"})
	public Response update(@RequestBody UserRequest request) {
		return mstUsersService.update(request);
	}
	
	@DeleteMapping(value = "/delete", produces = {"application/json"})
	public Response delete(@RequestParam("id") int id) {
		return mstUsersService.delete(id);
	}
	
	@GetMapping(value = "/all", produces = {"application/json"})
	public Response findAll() {
		return mstUsersService.findAll();
	}
	
}
