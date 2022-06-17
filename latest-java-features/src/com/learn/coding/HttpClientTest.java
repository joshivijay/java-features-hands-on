package com.learn.coding;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

public class HttpClientTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient h = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().header("Content-Type", "application/json")
				.header("accept", "application/problem+json")
				.method("GET", BodyPublishers.ofString("{\"name\": \"bond\",\"age\": 17}"))
				.uri(URI.create("http://localhost:8000/api/v1/users/postAsGet")).build();
		HttpResponse<String> response = h.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

}
