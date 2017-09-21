package com.example.reactive.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {
	
	private  final long id;
	private  final Date when;

	
}
