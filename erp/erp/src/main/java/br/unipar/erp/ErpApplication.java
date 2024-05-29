package br.unipar.erp;

import br.unipar.erp.data.entity.Usuario;
import br.unipar.erp.data.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ErpApplication implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(ErpApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNome("Spring JPA");
        usuario.setSenha("123456");
        usuario.setUsuario("springjpa");
        usuario.setDataNascimento(LocalDate.of(1993, 6, 20));

        usuarioRepository.save(usuario);
    }
}
