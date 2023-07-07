package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.User;
import com.example.demo.domain.UserTranslation;

@Service
public class TestService {

	private final UserRepository userRepository;
	private final UserTranslationRepository translationRepository;

	public TestService(UserRepository userRepository, UserTranslationRepository translationRepository) {
		this.userRepository = userRepository;
		this.translationRepository = translationRepository;
	}

	@Transactional
	public void test() {
		System.out.println("Starting...");

		User u1 = new User("xxx");
		System.out.println(userRepository.save(u1));

		System.out.println(userRepository.findBy("xxx"));
		System.out.println(userRepository.findBy(1L));

		UserTranslation t1 = new UserTranslation(u1, "ET", "Kasutaja 1");
		UserTranslation t2 = new UserTranslation(u1, "EN", "USER 1");
		translationRepository.save(t1);
		translationRepository.save(t2);

		List<UserTranslation> translations = translationRepository.findTranslationsByClassifierId(u1.getId());
		System.out.println(translations);
	}

}
