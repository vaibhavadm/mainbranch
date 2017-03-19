package org.vaibhav.jaxrs.JAXRSMessenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vaibhav.jaxrs.JAXRSMessenger.database.DummyDatabase;
import org.vaibhav.jaxrs.JAXRSMessenger.model.Profile;

public class ProfileService {
	
	public ProfileService(){
		profiles.put("Vaibhav", new Profile(1L, "vaibhav", "vaibhavreddy", "Guddeti"));
		profiles.put("Vaibhav2", new Profile(2L, "vaibhav2", "vaibhavreddy2", "Guddeti2"));
		profiles.put("Vaibhav3", new Profile(3L, "vaibhav3", "vaibhavreddy3", "Guddeti3"));
		profiles.put("Vaibhav4", new Profile(4L, "vaibhav4", "vaibhavreddy4", "Guddeti4"));
	}
	
	public Map<String, Profile> profiles = DummyDatabase.getProfiles();

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getSingleProfile(String name) {
		return profiles.get(name);
	}

	public Profile addProfile(Profile profile) {
		if (profile.getId() <= 0) {
			return null;
		} else {
			profile.setId(profiles.size() + 1);
			profiles.put(profile.getProfileName(), profile);
			return profile;
		}
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile deleteProfile(String profileName) {
		return profiles.remove(profileName);

	}

}
