package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//REST exercise 1. uses GET, POST, and DELETE
@SpringBootApplication
public class InfyCabsImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyCabsImplApplication.class, args);
	}

}
/*
infycab_db
Get:
http://localhost:8765/bookings/9877766756

Post:
http://localhost:8765/bookings/
{
        "source": "San Jose",
        "destination": "Los Angles",
        "fare": 1524.00,
        "travelDate": "2019-07-25",
        "userMobile": 9998766756,
        "status":"B"
}

Delete:
http://localhost:8765/bookings/1
*/