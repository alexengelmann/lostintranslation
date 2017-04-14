package com.lostintranslation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.lostintranslation.repository.TranslationRepository;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	TranslationRepository translationRepository;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		translationRepository.loadTranslations();
	}

}