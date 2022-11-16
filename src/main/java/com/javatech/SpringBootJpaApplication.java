package com.javatech;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javatech.entities.User;
import com.javatech.repository.UserRepsoitory;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		UserRepsoitory userRepsoitory = context.getBean(UserRepsoitory.class);
		// Insert or save User into database
//		User user1 = new User();
//		user1.setuName("Durgesh");
//
//		// Save Single object call this method save(object);
//
//		User user2 = new User();
//		user2.setuName("Honey");
//
//		// save List of Object call this method saveAll(Iterable);
//
//		List<User> list = List.of(user1, user2);
//		Iterable<User> users = userRepsoitory.saveAll(list);
//		users.forEach(user->{
//			System.out.println(user);
//		});
//		System.out.println(users);
//		System.out.println("User data successfully saved");

		// Update User Object
//		Optional<User>optional = userRepsoitory.findById(1);
//		User user = optional.get();
//		user.setuName("Deepak Tiwari");
//		userRepsoitory.save(user);
//		System.out.println(user);
//		System.out.println("User object updated");

		// List of user print
//		Iterable<User> itr = userRepsoitory.findAll();
//		Iterator<User> list = itr.iterator();
//		while (list.hasNext()) {
//			User user = list.next();
//			System.out.println(user);
//		}

		// Delete user by User id
		userRepsoitory.deleteById(6);
		System.out.println("Deleted successfully");
	}

}
