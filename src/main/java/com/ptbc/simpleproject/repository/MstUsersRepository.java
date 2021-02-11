package com.ptbc.simpleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ptbc.simpleproject.model.MstUsers;

@Repository
public interface MstUsersRepository extends JpaRepository<MstUsers, Integer> {

}
