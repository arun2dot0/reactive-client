package com.example.reactive.controller;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactive.model.Event;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EventController {
	
	
	@GetMapping("/events/{id}")
	public Mono<Event> getEvent(@PathVariable long id)
	{
		return Mono.just(new Event(id , new Date()));
	}
	
	@GetMapping (headers="Accept=*/*",produces= MediaType.TEXT_EVENT_STREAM_VALUE, value ="/events")
	public Flux<Event> getEvents()
	{
		Flux<Event> eventFlux = Flux.fromStream(Stream.generate(() -> new Event(System.currentTimeMillis() , new Date())) );
		Flux<Long> durationFlux = Flux.interval(Duration.ofSeconds(1));
		
		return Flux.zip(eventFlux, durationFlux).map(t1-> t1.getT1());
	}
	

}
