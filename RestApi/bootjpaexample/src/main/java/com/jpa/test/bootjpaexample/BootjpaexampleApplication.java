package com.jpa.test.bootjpaexample;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.bootjpaexample.dao.UserRepository;
import com.jpa.test.bootjpaexample.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = ((BeanFactory) context).getBean(UserRepository.class);

		// User user = new User();
		// user.setName("Sakshi Kathe");
		// user.setCity("Pune");
		// user.setStatus("I am java Programmer");
		// User user1 = userRepository.save(user);
		// System.out.println(user1);

		//Create object of User
		// User user1 = new User();
		// user1.setName("Asjad");
		// user1.setCity("Pune");
		// user1.setStatus("Java Programmer");

		// User user2 = new User();
		// user2.setName("Ankush");
		// user2.setCity("Mumbai");
		// user2.setStatus("Python Programmer");

		// //Saving single user
		// // User resultUser = userRepository.save(user2);
	
		// //Saving multiple user
		// List<User> users = List.of(user1,user2);
		// Iterable<User> result = userRepository.saveAll(users);

		// result.forEach(user->{
		// 	System.out.println(user);
		// });

		// //System.out.println("Saved User "+users);
		// System.out.println("Done");

		//Update the user of id-52
		// Optional<User> optional = userRepository.findById(52);
		// User user = optional.get();
		// user.setName("Asjad Samdani");
		// User result = userRepository.save(user);
		// System.out.println(result);

		//how to get the data
		//findById(id) -> return Optional Containing your data

		//to get all the data
		// Iterable<User> itr = userRepository.findAll();
		// itr.forEach(User -> {
		// 	System.out.println(user);
		// });

		//Delete the user element
		// userRepository.deleteById(53);
		// System.out.println("Deleted");

		// Iterable<User> allusers = userRepository.findAll();
		// allusers.forEach(user -> System.out.println(user));
		// userRepository.deleteAll(allusers);

		List<User> users = userRepository.findByName("Asjad");
		users.forEach(e->{System.out.println(e);});
	}

}
