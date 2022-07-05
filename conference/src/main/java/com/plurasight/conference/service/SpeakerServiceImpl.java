package com.plurasight.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plurasight.conference.model.Speaker;
import com.plurasight.conference.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository;
	
	public SpeakerServiceImpl() {
		System.out.println("SpeakerService no args constructor");
	}
	
	@Autowired
	public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
		System.out.println("SpeakerService repository constructor");
		repository = speakerRepository;
	}
	
	public List<Speaker> findAll(){
		return repository.findAll();
	}
	
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SetRepository setter");
		this.repository = repository;
	}
}
