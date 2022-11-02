package com.example.demo;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.User;
import com.example.demo.domain.UserTranslation;

@Service
@RequiredArgsConstructor
public class TestService {

	private final UserRepository userRepository;
	private final UserTranslationRepository translationRepository;


	@Transactional
	public void test() {
		System.out.println("Starting...");

		User u1 = User.builder().name("xxx").build();
		System.out.println(userRepository.save(u1));

		System.out.println(userRepository.findBy("xxx"));
		System.out.println(userRepository.findBy(1L));

		UserTranslation t1 = UserTranslation.builder()
				.classifier(u1)
				.localeCode("ET")
				.translation("Kasutaja 1")
				.build();
		UserTranslation t2 = UserTranslation.builder()
				.classifier(u1)
				.localeCode("EN")
				.translation("USER 1")
				.build();
		translationRepository.save(t1);
		translationRepository.save(t2);

		List<UserTranslation> translations = translationRepository.findTranslationsByClassifierId(u1.getId());
		System.out.println(translations);
	}

}
