package com.example.vanita.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("Java 8", "java", "Java 8 course"),
			new Topic("Spring Framework", "spring", "IOC container"),
			new Topic("Angular MVC Framework", "angular", "Typescript	")
		) ;
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
}
