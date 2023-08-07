package com.starter.weatherapp.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class WeatherAppCallService {
	
	private static final String WEATHER_DATA_API = "http://api.weatherapi.com/v1/current.json?key=782a561e62be431c853132507230608&q=Galway";

	@PostConstruct
	public HttpResponse<String> getWeatherData() throws IOException, InterruptedException {
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(WEATHER_DATA_API))
				.build();
		
		HttpResponse<String> httpResponse = 
				client.send(request, HttpResponse.BodyHandlers.ofString());
		
		
		return httpResponse;
	}

}
