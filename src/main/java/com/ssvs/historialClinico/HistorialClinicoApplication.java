package com.ssvs.historialClinico;

import com.ssvs.historialClinico.entity.Asegurados;
import com.ssvs.historialClinico.entity.Usuarios;
import com.ssvs.historialClinico.repository.AseguradosRepository;
import com.ssvs.historialClinico.repository.UsuariosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HistorialClinicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistorialClinicoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UsuariosRepository usuariosRepository, AseguradosRepository aseguradosRepository){
		return args -> {

				List<Usuarios> usuarios = Arrays.asList(
						new Usuarios("carlos@example","asdas123","Carlos","Banzer",'M',LocalDateTime.now(),'A'),
						new Usuarios("Alicia@example","as123","Alicia","Banzer",'F',LocalDateTime.now(),'A'),
						new Usuarios("Julia@example","qweqie12","Julia","Aguilera",'F',LocalDateTime.now(),'A'),
						new Usuarios("Marcelo@example","qw10asd05","Marcelo","Alcoba",'M',LocalDateTime.now(),'A'),
						new Usuarios("Andres@example","qwerjuanyteamo","Andres","Aivoges",'M',LocalDateTime.now(),'A')
				);
				usuariosRepository.saveAll(usuarios);

			List<Asegurados> asegurados = Arrays.asList(
					new Asegurados("ORH+",LocalDateTime.now()),
					new Asegurados("O+",LocalDateTime.now()),
					new Asegurados("O-",LocalDateT'05-05-2024'ime.now()),
					new Asegurados("O+",LocalDateTime.now()),
					new Asegurados("ORH+",,LocalDateTime.now())
			);
			aseguradosRepository.saveAll(asegurados);
		};


	}
	@Bean
	ModelMapper modelMapper() {
		 return new ModelMapper();
	}
}

