package com.educativex.educativex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educativex.educativex.entities.Usuario;
import com.educativex.educativex.entities.enums.Tipo_usuario;
import com.educativex.educativex.repositories.UsuarioRepository;

@Configuration
public class ConfigTest implements CommandLineRunner{
/*A interface CommandLineRunner no Spring Boot é utilizada para executar um bloco de código ou uma tarefa específica imediatamente após a inicialização da aplicação [2, 3].
Principais utilidades:
Carga inicial de dados: Popular o banco de dados com registros padrão (como usuários administradores ou tabelas de referência) logo que o sistema sobe [1, 2].
Verificações de sistema: Validar se serviços externos, caminhos de arquivos ou conexões essenciais estão ativos antes de liberar o uso da aplicação [3, 4].
Processamento de argumentos: Capturar e ler parâmetros passados via linha de comando no momento da execução do JAR [2, 5].
temos que implementar o método run
*/
	@Autowired
	private UsuarioRepository userRep;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario(null, "Anderson", "anderson@gmail.com", "senha123", Tipo_usuario.PROFESSOR);
		userRep.save(u1);
	}

}
