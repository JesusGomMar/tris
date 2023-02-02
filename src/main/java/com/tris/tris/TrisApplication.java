package com.tris.tris;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.tris.tris.comunes.dto.UsuarioDto;

@MappedTypes(UsuarioDto.class)
@MapperScan("com.tris.tris.mappers")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class TrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrisApplication.class, args);
	}

}
