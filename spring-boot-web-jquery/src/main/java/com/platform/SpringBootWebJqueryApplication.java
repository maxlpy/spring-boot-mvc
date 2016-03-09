package com.platform;

import org.h2.server.web.WebServlet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.platform.entity.User;
//import com.platform.repository.UserRepository;
import com.platform.repository.UserRepository;

@SpringBootApplication
public class SpringBootWebJqueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebJqueryApplication.class, args);
	}
	
	/**
     * Binds the database console to allow database analysis
     * @return
     */
    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }
    
    /**
     * Load the initial elements required to run the application
     * @param organizationTypeRepository
     * @return
     */
    @Bean
    CommandLineRunner init(final UserRepository userRepository){
    	return new CommandLineRunner(){
			@Override
			public void run(String... arg0) throws Exception {
				for (int i = 0; i < 10; i++) {
					User user = new User();
					user.setFirstName("Thiago" + i);
					user.setLastName("Loureiro");
					user.setPhone("3093203920" + i);
					user.setEmail("root" + i + "@tloureiro.com");
					userRepository.save(user);
				}
			}
    	};
    }
}
