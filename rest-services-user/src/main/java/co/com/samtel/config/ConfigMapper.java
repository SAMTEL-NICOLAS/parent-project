package co.com.samtel.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMapper {

	@Bean("modelMapper")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
