package com.lostintranslation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import com.lostintranslation.repository.TranslationRepository;

@Service
public class TranslationServiceImpl implements TranslationService {

	@Autowired
	TranslationRepository translationRepository;

	public String searchForLabel(String label) {

		String result;
		String translations = translationRepository.getTranslations();
		
		try{
			result = JsonPath.parse(translations).read("$."+ label);
		} catch (PathNotFoundException e) {
			return "";
		}
		return result;
	}
}
