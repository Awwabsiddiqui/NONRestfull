package com.telusko.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.demo.model.Alien;

@Repository
public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	List<Alien> findByAname(String aname);
	List<Alien> findAllByOrderByAnameAsc();
}
