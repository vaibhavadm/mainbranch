/**
 * 
 */
package org.vaibhav.jaxrs.JAXRSClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.vaibhav.jaxrs.JAXRSMessenger.model.Message;

/**
 * @author VAIBHAVREDDYGUDDETI Mar 28, 2017
 * the below code shows different ways how the client can access the resource
 */
public class MessageClient {
	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		// procedure-1
		Response response = client.target("http://localhost:8081/JAXRSMessenger/webapi/messages/1").request().get();
		Message message = response.readEntity(Message.class);
		System.out.println("Message details here --> " + " Message Author  -->" + message.getAuthor() + "\n"
				+ " Message Id  -->" + message.getId() + "\n" + " Message Details  -->" + message.getMessage() + "\n"
				+ " Message Created on  -->" + message.getCreated() + "\n" + " Message to links  -->"
				+ message.getListofLinks());
		System.out.println("\n" + "\n" + "\n");
		
		
		// procedure-2
		WebTarget target = client.target("http://localhost:8081/JAXRSMessenger/webapi/messages/2");
		Builder builder = target.request();
		Response response2 = builder.get();
		Message message2 = response2.readEntity(Message.class);
		System.out.println("Message details here --> " + " Message Author  -->" + message2.getAuthor() + "\n"
				+ " Message Id  -->" + message2.getId() + "\n" + " Message Details  -->" + message2.getMessage() + "\n"
				+ " Message Created on  -->" + message2.getCreated() + "\n" + " Message to links  -->"
				+ message2.getListofLinks());
		System.out.println("\n" + "\n" + "\n");
		
		
		//procedure-3
		WebTarget target2 = client.target("http://localhost:8081/JAXRSMessenger/webapi/messages/3");
		Builder request = target2.request(MediaType.APPLICATION_JSON);
		Message message3 = request.get(Message.class);
		System.out.println("Message details here --> " + " Message Author  -->" + message3.getAuthor() + "\n"
				+ " Message Id  -->" + message3.getId() + "\n" + " Message Details  -->" + message3.getMessage() + "\n"
				+ " Message Created on  -->" + message3.getCreated() + "\n" + " Message to links  -->"
				+ message3.getListofLinks());
		System.out.println("\n" + "\n" + "\n");
		
		
		//procedure-4
		//this way we can see the entire payload and doesn't have to worry about the type conversions
		//as the JAX-RS coverts the returning type to string
		WebTarget target3 = client.target("http://localhost:8081/JAXRSMessenger/webapi/messages/3");
		Builder request2 = target3.request(MediaType.APPLICATION_JSON);
		String string = request2.get(String.class);
		System.out.println(string);
		
	}
}
