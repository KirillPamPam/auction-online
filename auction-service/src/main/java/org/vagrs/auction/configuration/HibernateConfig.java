package org.vagrs.auction.configuration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.vagrs.auction.common.Constants;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Kirill Zhitelev on 08.01.2018.
 */
@Configuration
@EnableTransactionManagement
@PropertySource({"classpath:/properties/database.properties"})
@ComponentScan({"org.vagrs.auction.configuration"})
public class HibernateConfig {
    private Environment environment;

    private Properties hibernateProperties() {
        final Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.default_schema",
                environment.getRequiredProperty("hibernate.default_schema"));
        hibernateProperties.setProperty("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        hibernateProperties.setProperty("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        hibernateProperties.setProperty("hibernate.enable_lazy_load_no_trans",
                environment.getRequiredProperty("hibernate.enable_lazy_load_no_trans"));

        return hibernateProperties;
    }

    @Bean
    public DataSource dataSource() throws NamingException {
        return new JndiTemplate().lookup(Constants.AUCTION_JNDI_DATA_SOURCE, DataSource.class);
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() throws NamingException {
        final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("org.vagrs.auction.model");
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
