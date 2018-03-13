package net.kang;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import net.kang.domain.Music;
import net.kang.repository.MusicRepository;

@EnableAutoConfiguration(exclude = {JpaRepositoriesAutoConfiguration.class})
@EnableMongoRepositories(basePackages = "net.kang.repository")
@EntityScan(basePackages = "net.kang.domain")
@ComponentScan(basePackages = "net.kang")
@SpringBootApplication
public class Example01Application {
	public static void main(String[] args) {
		SpringApplication.run(Example01Application.class, args);
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.data.db-main")
	public DataSource mainDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.data.db-log")
	public DataSource contractDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
    CommandLineRunner init(MusicRepository musicRepository) {

        return args -> {

            List<Music> musicList=musicRepository.findAll();
            for(Music m : musicList) {
            	System.out.println(m);
            }

        };

    }
}
