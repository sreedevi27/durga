package com.spring.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.entity.ClassName;
import com.spring.demo.entity.Response;
import com.spring.demo.service.DBservice;

@RestController
@RequestMapping("/class")
public class ClassController {

	@Autowired
	public DBservice db;
	
	@RequestMapping(method = RequestMethod.POST,value="/create")
	public Response createClass() {
		
		return  db.create();
	
	}
	


}
