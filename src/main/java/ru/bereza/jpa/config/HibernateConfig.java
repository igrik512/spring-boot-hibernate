package ru.bereza.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 *
 */
@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class HibernateConfig {

}
