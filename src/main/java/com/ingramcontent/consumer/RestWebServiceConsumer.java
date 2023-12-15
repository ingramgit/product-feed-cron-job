package com.ingramcontent.consumer;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RestWebServiceConsumer implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public RestWebServiceConsumer() {
    }


    public static void get(String uri) throws Exception {
	    HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create(uri))
	          .build();

	    HttpResponse<String> response =
	          client.send(request, BodyHandlers.ofString());
        
	    System.out.println("Status Code = " + response.statusCode() + ", Response = "+ response.body());
	}
	
	public static void post(String uri, String data) throws Exception {
	    HttpClient client = HttpClient.newBuilder().build();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create(uri))
	            .POST(BodyPublishers.ofString(data))
	            .build();

	    HttpResponse<?> response = client.send(request, BodyHandlers.discarding());
	    System.out.println("Status Code = " + response.statusCode() + ", Response = "+ response.body());
	}

}