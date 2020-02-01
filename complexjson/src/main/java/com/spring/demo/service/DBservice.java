package com.spring.demo.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.demo.entity.AccociatedDrug;
import com.spring.demo.entity.ClassName;
import com.spring.demo.entity.MedicationsClasses;
import com.spring.demo.entity.Response;

@Service
public class DBservice {
	
	private static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}

	public static String convertJavatoJson(Object obj) {
		String s="";
		try {
			s=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			
		}catch(JsonGenerationException e) {
			e.printStackTrace();
		}
		catch(JsonMappingException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return s;
	}
	public static Response create() {
		List<ClassName> cl=new ArrayList<ClassName>();
		ClassName cn=new ClassName();
		ClassName cn1=new ClassName();
		List<AccociatedDrug> al=new ArrayList<AccociatedDrug>();
		AccociatedDrug ad1=new AccociatedDrug();
		AccociatedDrug ad2=new AccociatedDrug();
		
		Response res=new Response();
		//List<ClassName> cl=new ArrayList<ClassName>();
		//ClassName cn=new ClassName();
		List<MedicationsClasses> ml=new ArrayList<MedicationsClasses>();
		MedicationsClasses mc=new MedicationsClasses();
		
		ad1.setName("devi");
		ad1.setDose("single Dose");
		ad1.setStrength("500 mg");
		
		ad2.setDose("2 Doses");
		ad2.setName("devraj");
		ad2.setStrength("100 mg");
		al.add(ad1);
		al.add(ad2);
		
		
		cn.setAccociatedDrug(al);
		cn1.setAccociatedDrug(al);
		cl.add(cn1);
		cl.add(cn);
		mc.setClassName(cl);
		ml.add(mc);
		res.setMedicationsClasses(ml);
		//res.setClassName(cl);
		return res;
	}
}
