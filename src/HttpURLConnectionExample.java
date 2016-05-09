/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nhutdev
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
public class HttpURLConnectionExample {

	private final String USER_AGENT = "Mozilla/5.0";

//	public static void main(String[] args) throws Exception {
//
//		HttpURLConnectionExample http = new HttpURLConnectionExample();
//
//		System.out.println("Testing 1 - Send Http GET request");
//		http.sendGet("a");
//
//	}

	// HTTP GET request
	protected String sendGet(String params) throws Exception {

		String url = "http://music.nhutuit.com/search/"+params;
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
//		System.out.println("\nSending 'GET' request to URL : " + url);
//		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                String json = response.toString();
		//print result
//                                System.out.println(json);
		return json;


	}

}
