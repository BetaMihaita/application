package com.example.demo.init;

import com.example.demo.DemoApplication;
import com.example.demo.Repositori.LocationService;
import com.example.demo.init.model.StorageLocation;
import com.example.demo.init.model.TransitLocation;
import com.example.demo.init.model.User;
import com.example.demo.init.model.UserGroup;

import com.example.demo.Repositori.UserGroupService;
import com.example.demo.Repositori.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InitialDataInstaller {
	private final UserService userService;
	private final UserGroupService userGroupService;
	private final LocationService locationService;

	@Autowired


	public InitialDataInstaller(UserService userService, UserGroupService userGroupService,LocationService locationService) {
		this.userService = userService;
		this.userGroupService = userGroupService;
		this.locationService= locationService;
	}



	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		InitialDataInstaller initializationService = context.getBean(InitialDataInstaller.class);
		initializationService.run();
		context.close();


	}

	public void run() {

		createLocations();
		createUsers();

		// create locations
		// HBW010010101
		// Exista 10 Aisle-uri, pe fiecare din ele exista 50 de locatii pe X, 5 locatii
		// pe Y si 2 pe Z
		// StorageLocations

		// TransitLocation: RECEIVING, PICKING, SHIPPING

	}


	private void createUsers() {


				UserGroup admins = new UserGroup("Administrators", "user group for administrators");
				userGroupService.createGroup(admins);
				UserGroup sworker = new UserGroup("Shipping Workers", "user group for shipping workers");
				userGroupService.createGroup(sworker);
				UserGroup pworker = new UserGroup("Picking Workers", "user group for  picking workers");
				userGroupService.createGroup(pworker);
				UserGroup rworker = new UserGroup("Receiving Workers", "user group for  receiving workers");
				userGroupService.createGroup(rworker);
				UserGroup tworker = new UserGroup("Transport Workers", "user group for  transport workers");
				userGroupService.createGroup(tworker);
				UserGroup dworker = new UserGroup("Discard Workers", "user group for  discard workers");
				userGroupService.createGroup(dworker);
				User standard = new User("1", "1");
				standard.addUserGropu(admins);
				standard.addUserGropu(sworker);
				standard.addUserGropu(pworker);
				standard.addUserGropu(rworker);
				standard.addUserGropu(tworker);
				standard.addUserGropu(dworker);
				userService.createUser(standard);
				User test1 = new User("2", "2");
				test1.addUserGropu(sworker);
				userService.createUser(test1);
				User test2 = new User("3", "3");
				test2.addUserGropu(pworker);
				userService.createUser(test2);
				User test3 = new User("4", "4");
				test3.addUserGropu(rworker);
				userService.createUser(test3);
				User test4 = new User("5", "5");
				test4.addUserGropu(dworker);
				userService.createUser(test4);


	}

	private void createLocations() {




				for (int i = 1; i <= 5; i++) {
					for (int x = 1; x <= 10; x++) {
						for (int y = 1; y <= 5; y++) {
							for (int z = 1; z <= 2; z++) {
								String barcode = String.format("HBW%02d%03d%02d%02d", i, x, y, z);
								 System.out.println(barcode);

								locationService.saveLocatione(new StorageLocation(barcode, i, x, y, z));

							}

						}

					}

				}

		locationService.saveTransitLocatione(new TransitLocation("RECEIVING"));// RECEIVING
		locationService.saveTransitLocatione(new TransitLocation("PICKING"));// PICKING
		locationService.saveTransitLocatione(new TransitLocation("SHIPPING"));// SHIPPING
		locationService.saveTransitLocatione(new TransitLocation("LOST_AND_FOUND"));// LOST_AND_FOUND
		locationService.saveTransitLocatione(new  TransitLocation("GATE01"));//
		locationService.saveTransitLocatione(new TransitLocation("GATE02"));// ALL 3 GATES
		locationService.saveTransitLocatione(new TransitLocation("GATE03"));//

			}




}
