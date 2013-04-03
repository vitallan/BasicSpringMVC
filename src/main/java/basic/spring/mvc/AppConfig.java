package basic.spring.mvc;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import basic.string.mvc.config.utils.ProjectPropertyConfigurer;

@Configuration
public class AppConfig {
	
	private static Logger log = Logger.getLogger(AppConfig.class);

	@Bean
	public static final ProjectPropertyConfigurer propertyConfigurer() {
		ProjectPropertyConfigurer config = new ProjectPropertyConfigurer();
		config.setIgnoreResourceNotFound(false);
		Resource location = new ClassPathResource("project.properties");
		config.setLocation(location);
		log.info("Configs loaded");
		return config;
	}
	
	@Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/Pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        log.info("View resolver loaded");
        return resolver;
    }

}
