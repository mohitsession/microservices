package com.learn.accounts.dto;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDTO(String message, Map<String, String> contactDetails, String env) {

}
