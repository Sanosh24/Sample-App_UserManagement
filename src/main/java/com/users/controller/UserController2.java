//package com.users.controller;
//
//import java.util.HashMap;
//
//import java.util.List;
//import java.util.Map;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.users.exception.ResourceNotFoundException;
//import com.users.model.User;
//import com.users.repository.UserRepository;
//
//
//@RestController
//@RequestMapping("/api/v1")
//public class UserController2 {
//	@Autowired
//	private UserRepository userRepository;
//
//	@GetMapping("/users")
//	public List<User> getAllUsers() {
//		return userRepository.findAll();
//	}
//
//	@GetMapping("/users/{id}")
//	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId)
//			throws ResourceNotFoundException {
//		User user = userRepository.findById(userId)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
//		return ResponseEntity.ok().body(user);
//	}
//
//	@PostMapping("/users")
//	public User createUser(@Valid @RequestBody User user) {
//		return userRepository.save(user);
//	}
//
//	@PutMapping("/users/{id}")
//	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
//			@Valid @RequestBody User userDetails) throws ResourceNotFoundException {
//		User user = userRepository.findById(userId)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
//
//		user.setEmailId(userDetails.getEmailId());
//		user.setLastName(userDetails.getLastName());
//		user.setFirstName(userDetails.getFirstName());
//		final User updatedUser = userRepository.save(user);
//		return ResponseEntity.ok(updatedUser);
//	}
//
//	@DeleteMapping("/users/{id}")
//	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
//			throws ResourceNotFoundException {
//		User user = userRepository.findById(userId)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
//
//		userRepository.delete(user);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
//}
