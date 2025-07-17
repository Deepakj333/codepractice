package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	
	 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
		
		String itemfilePath = "item.txt"; // Replace with your actual file path
        ArrayList<String> itemfilelist = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(itemfilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert each line to Long and add to ArrayList
            	itemfilelist.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String productfilePath = "product.txt"; // Replace with your actual file path
        ArrayList<String> productList = new ArrayList<>();

        try (BufferedReader br2 = new BufferedReader(new FileReader(productfilePath))) {
            String line;
            while ((line = br2.readLine()) != null) {
                // Convert each line to Long and add to ArrayList
            	productList.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
        
        System.out.println(productList.size() +" "+itemfilelist.size() );
        
        productList.stream().filter(x->itemfilelist.contains(x)).collect(Collectors.toList());
        
        for(String product:productList) {
        	
        	//itemfilelist.
        	
        	
        }
        
        System.out.println(productList.size());
		
		

       // String json = "{ \"fields\": { \"project\": { \"key\": \"APIBAU\" }, \"parent\": { \"key\": \"TEST-101\" }, \"summary\": \"Sub-task of TEST-101\", \"description\": \"Don't forget to do this too.\", \"issuetype\": { \"id\": \"5\" } } }";

		
  //      ResponseEntity<String> jiraResponse = atlassianHostRestClients.authenticatedAsHostActor().postForEntity("https://morrisons.atlassian.net/rest/api/latest/issue/", json,String.class);
//			
        
//        try {
////			URL url = new URL("https://cicd.p.platform.morconnect.com/wholesale/job/trigger-wholesale-test/build");
////			String user = "wholesaletestuser"; // username
////
////			String pass = "11a03f56bedb286da634d1edb9dc9c254a"; // password or API token
//			
//			URL url = new URL("https://morrisons.atlassian.net/rest/api/latest/issue/");
//			String user = "deepak.yadav@morrisonsplc.co.uk"; // username
//
//			String pass = "r3fTMB46bxduNn9O60rs7148"; // password or API token
//
//			String authStr = user + ":" + pass;
//			String encoding = Base64.getEncoder().encodeToString(authStr.getBytes("utf-8"));
//
//			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//			connection.setRequestMethod("POST");
//			connection.setDoOutput(true);
//			connection.setRequestProperty("Authorization", "Basic " + encoding);
//
//			System.out.println("Job status is " + connection.getResponseCode());
////			System.out.println(connection.getPermission() + "  " );
//			System.out.println("execution ended");
//			connection.disconnect();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        
        
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor("deepak.yadav@morrisonsplc.co.uk", "r3fTMB46bxduNn9O60rs7148"));
//		ResponseEntity<String> jiraResponse = restTemplate.postForEntity("https://morrisons.atlassian.net/rest/api/latest/issue/", json,String.class);
//				
//		
//		
//		
//		
//		//log.debug("postDataToJira:{}", jiraResponse);
//		
//	System.out.print(jiraResponse.getBody());
		//return jiraResponse.getBody();
		
	}
	
	
	

}
