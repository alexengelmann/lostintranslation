package com.lostintranslation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lostintranslation.service.TranslationService;

@RestController
@RequestMapping(value = "/search")
public class SearchController {
	
		@Autowired
		TranslationService translationService;
	
		@RequestMapping(value = "/bylabel", method = RequestMethod.GET)
		public String byLabel(@RequestParam String label){
			return translationService.searchForLabel(label);
		}
}

