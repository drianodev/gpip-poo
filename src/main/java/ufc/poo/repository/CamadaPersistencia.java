package ufc.poo.repository;

import ufc.poo.model.entity.Instituicao;
import ufc.poo.model.entity.Localizacao;
import ufc.poo.model.entity.Usuario;

import java.util.List;

public class CamadaPersistencia {

    public static void main(String[] args) {
        LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        InstituicaoRepository instituicaoRepository = new InstituicaoRepository();

        // Criar objetos para persistir
        Localizacao localizacao = new Localizacao("Rua Principal",
                "123", "Centro", "Cidade A", "Estado A", "12345-678");
        Usuario usuario = new Usuario("usuario@email.com", "Usuário 1", "123");
        Instituicao instituicao = new Instituicao("Instituição A", localizacao, usuario);

        // Salvar
        localizacaoRepository.salvarLocalizcao(localizacao);
        usuarioRepository.salvarUsuario(usuario);
        instituicaoRepository.salvarInstituicao(instituicao);

        // Listar todas as instituições
        List<Instituicao> instituicoes = instituicaoRepository.listarTodas();
        System.out.println("Lista de Instituições:");
        for (Instituicao inst : instituicoes) {
            System.out.println("ID: " + inst.getId() + ", Nome: " + inst.getNomeInstituicao());
        }

        // Fechar a conexão
        localizacaoRepository.fecharConexao();
        usuarioRepository.fecharConexao();
        instituicaoRepository.fecharConexao();
    }
}
