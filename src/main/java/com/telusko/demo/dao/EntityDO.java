package com.telusko.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.telusko.demo.model.Alien;

@Component
public class EntityDO {
	@Autowired
	AlienRepo repo;
	public Alien getNameById(int id) {
		Alien ent = repo.findById(id).orElse(new Alien());
		return ent;
	}
	public Alien save(Alien alien) {
		if(repo.existsById(alien.getAid())) {
			return new Alien();
		}else {
			Alien entityStatus = repo.save(alien);
			return entityStatus;
		}
	}
	
	public void listAllOrdered() {
		System.out.println(repo.findAllByOrderByAnameAsc());
		System.out.println(repo.findAll( new Sort(Sort.Direction.ASC, "aname")));
	}
	
}
