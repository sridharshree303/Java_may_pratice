package com.plurasight.conference;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;

import com.plurasight.conference.utill.CalenderFactory;

//import com.plurasight.conference.repository.HibernateSpeakerRepositoryImpl;
//import com.plurasight.conference.repository.SpeakerRepository;
//import com.plurasight.conference.service.SpeakerService;
//import com.plurasight.conference.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"com.plurasight"})
public class AppConfig {
	
	@Bean(name="cal")
	public CalenderFactory calFactory() {
		CalenderFactory factory = new CalenderFactory();
		factory.addDays(2);
		return factory;
	}
	
	@Bean
	public Calendar cal() throws Exception{
		return calFactory().getObject();
	}
	
	
	
	/*
	@Bean(name = "speakerService")
	@Scope(value=BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getSpeakerService() {
		
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		return service;
		
		//	//setter injection
		//	SpeakerServiceImpl service = new SpeakerServiceImpl();
		//	service.setRepository(getSpeakerRepository());
		//	return service;
				
		//	//constructor injection
		//	SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
		//	return service;
	}
	*/
	
	/*
	@Bean(name="speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	*/
}
