package com.witherspoon.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * {@code ApplicationConfig}
 *
 * @author david.witherspoon
 * @since Jul 10, 2017
 */
@Configuration
@ImportResource("classpath:config.xml")
public class ApplicationConfig {
}