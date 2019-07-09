package com.kiongroup.dc.functions.search;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@Ignore
public class SearchFunctionIntegrationTest {

	private static final String CONFIG_URL = "http://localhost:7071/api/GetConfig";
	private static final String SEARCH_URL = "http://localhost:7071/api/SearchReferences";
	private static final String AZURE_TOKEN = "";
		
	@Test
	public void someResults() throws IOException {
	
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", "Bearer " + AZURE_TOKEN);
		
		HttpEntity<?> entity = new HttpEntity<>(headers);

		Object response = new RestTemplate().exchange(CONFIG_URL, HttpMethod.GET, entity, Object.class).getBody();
	}
	 
}
