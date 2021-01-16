package spring;

import com.doxily.taskapp.service.ProjectServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {
    @Bean
    public ProjectServiceImpl projectRepository() {
        return new ProjectServiceImpl();
    }
}
