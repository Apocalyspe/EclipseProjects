package com.starter.weatherapp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starter.weatherapp.service.WeatherAppCallService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private WeatherAppCallService weatherAppCallService;
	
	@GetMapping("/data")
	public ResponseEntity<Object> sendWeatherData() throws IOException, InterruptedException {
		
		String jsonResp = weatherAppCallService.getWeatherData().body();
		
		return  new ResponseEntity<Object>(jsonResp, HttpStatus.OK);
	}

}
