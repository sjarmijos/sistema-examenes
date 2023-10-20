package com.sistema.examenes;


import com.sistema.examenes.entidades.Rol;
import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.UsuarioRol;
import com.sistema.examenes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {
	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Usuario usuario = new Usuario();
		usuario.setNombre("Percy");
		usuario.setApellido("Armijos");
		usuario.setUsername("poarmijos");
		usuario.setPassword(bCryptPasswordEncoder.encode("12345"));
		usuario.setEmail("poarmijos@gmail.com");
		usuario.setTelefono("0994512783");
		usuario.setPerfil("foto.png");
		usuario.setEnabled(false);

		Rol rol = new Rol();
		rol.setRolID(1L);
		rol.setNombre("NORMAL");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol= new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);

		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());*/
	}
}
