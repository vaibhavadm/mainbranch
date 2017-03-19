package org.vaibhav.jaxrs.JAXRSMessenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vaibhav.jaxrs.JAXRSMessenger.model.Profile;
import org.vaibhav.jaxrs.JAXRSMessenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profileService = new ProfileService();

	@GET
	public List<Profile> getAllProfiles() {
		return profileService.getAllProfiles();
	}

	@GET
	@Path("/{profileName}")
	public Profile getSingleProfile(@PathParam("profileName") String profileName) {
		return profileService.getSingleProfile(profileName);
	}

	@POST
	public Profile addProfile(Profile profile) {
		return profileService.addProfile(profile);
	}

	@DELETE
	@Path("/{profileName}")
	public Profile deleteProfile(@PathParam("profileName") String name) {
		return profileService.deleteProfile(name);
	}
	
	@PUT
	public Profile updateProfile(Profile profile){
		return profileService.updateProfile(profile);
	}

}
