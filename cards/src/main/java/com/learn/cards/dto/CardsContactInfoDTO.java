package com.learn.cards.dto;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardsContactInfoDTO {

	private String message;
	private Map<String, String> contactDetails;
	private String env;
}
