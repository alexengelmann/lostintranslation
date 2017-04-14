package com.lostintranslation.service.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.lostintranslation.repository.TranslationRepository;
import com.lostintranslation.service.TranslationService;
import com.lostintranslation.service.TranslationServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TranslationServiceTest {
	@Mock
	TranslationRepository mockTranslationRepository;

	@InjectMocks
	TranslationService translationService = new TranslationServiceImpl();

	@Before
	 public void setUp() {
		 when(mockTranslationRepository.getTranslations()).thenReturn(" {\"title\": \"Lost in Translation\",\"login\": {\"user\": \"User Name\"},\"menu\": {\"topMenu\": {\"home\": \"Home\",\"index\": \"Index\"},\"secondaryMenu\": {\"left\": {\"riddles\": \"Riddles\"}} }}");
		 
	}
	@Test
	public void testOneLevel() {
		// Arrange
		String expect = "Lost in Translation";
		// Act
		String actual = translationService.searchForLabel("title");
		// Assert
		assertEquals(expect, actual);
	}
	
	@Test
	public void testTwoLevels() {
		// Arrange
		String expect = "User Name";
		// Act
		String actual = translationService.searchForLabel("login.user");
		// Assert
		assertEquals(expect, actual);
	}
	
	@Test
	public void testThreeLevels() {
		// Arrange
		String expect = "Home";
		// Act
		String actual = translationService.searchForLabel("menu.topMenu.home");
		// Assert
		assertEquals(expect, actual);
	}
}
