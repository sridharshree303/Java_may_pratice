package com.plurasight.conference.repository;

import java.util.List;

import com.plurasight.conference.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}