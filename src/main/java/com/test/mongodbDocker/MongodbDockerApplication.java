package com.test.mongodbDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongodbDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbDockerApplication.class, args);
	}

}
