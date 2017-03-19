package org.vaibhav.jaxrs.JAXRSMessenger.database;

import java.util.HashMap;
import java.util.Map;

import org.vaibhav.jaxrs.JAXRSMessenger.model.Message;
import org.vaibhav.jaxrs.JAXRSMessenger.model.Profile;

public class DummyDatabase {
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
