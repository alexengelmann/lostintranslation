package com.lostintranslation.repository;

import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class TranslationRepositoryImpl implements TranslationRepository {
	public static String translations;

	public void loadTranslations() {

		try {
			Resource resource = new ClassPathResource("translation.json");
			translations = IOUtils.toString(resource.getInputStream());
		} catch (Exception e) {
			// here i would log the error to file/db
		}
	}

	public String getTranslations() {
		return translations;
	}
}
