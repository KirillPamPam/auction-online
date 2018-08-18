package org.vagrs.auction.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.vagrs.auction.configuration.security.SecurityConfiguration;

/**
 * Created by Kirill Zhitelev on 09.01.2018.
 */
@Configuration
@ComponentScan(basePackages = "org.vagrs.auction.*")
@Import({HibernateConfig.class, SecurityConfiguration.class})
@EnableWebMvc
public class AppConfig {
}
