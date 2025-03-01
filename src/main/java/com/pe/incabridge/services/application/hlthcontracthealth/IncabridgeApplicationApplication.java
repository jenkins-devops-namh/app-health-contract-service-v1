package com.pe.incabridge.services.application.hlthcontracthealth;

import com.pe.incabridge.core.starter.openapi.configuration.OpenApiConfiguration;
import com.pe.incabridge.core.starter.web.runner.StarterWebApplication;
import org.springdoc.core.SpringDocConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Main class for running Spring Boot framework.<br/>
 * <b>Class</b>: AtlasApplicationApplication<br/>
 * <b>Copyright</b>: &copy; 2020 Banco de Cr&eacute;dito del Per&uacute;.<br/>
 * <b>Company</b>: Banco de Cr&eacute;dito del Per&uacute;.<br/>
 *
 * @author Banco de Cr&eacute;dito del Per&uacute; (BCP) <br/>
 * <u>Service Provider</u>: Everis <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>Israel Romero</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>Aug 3, 2020 Creaci&oacute;n de Clase.</li>
 * </ul>
 * @version 1.0
 */

@Import({SpringDocConfiguration.class, OpenApiConfiguration.class})
@ComponentScan(lazyInit = true)
@SpringBootApplication(scanBasePackages =
		{"com.pe.incabridge.services.application.hlthcontracthealth", "com.pe.incabridge.core.starter.web.error.handlers"})
public class IncabridgeApplicationApplication extends StarterWebApplication {
	private static ApplicationContext applicationContext;

	/**
	 * Main method.
	 */
	public static void main(String[] args) {

		applicationContext = new SpringApplication(IncabridgeApplicationApplication.class).run(args);
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
