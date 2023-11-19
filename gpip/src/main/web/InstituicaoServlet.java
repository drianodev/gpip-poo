package main.web;

import main.controller.InstituicaoController;
import main.model.entity.Instituicao;
import main.model.entity.Localizacao;
import main.model.entity.Usuario;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InstituicaoServlet extends HttpServlet {

    private InstituicaoController instituicaoController = new InstituicaoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
//            Instituicao instituicao = instituicaoController.getInstituicao();
            // Cria uma instância de Instituicao para teste
            Instituicao instituicao = criarInstituicaoTeste();
            // Adicione logs para depuração
            System.out.println("Objeto instituicao Servlet: " + instituicao);

            if (instituicao != null) {
                req.setAttribute("instituicao", instituicao);
                req.getRequestDispatcher("/WEB-INF/views/instituicao.jsp").forward(req, resp);
            } else {
                System.err.println("Instituicao é nula. Verifique o método getInstituicao() em InstituicaoController.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    // Método para criar uma instância de Instituicao para teste
    private Instituicao criarInstituicaoTeste() {
        Instituicao instituicao = new Instituicao("Minha Instituicao",
                new Localizacao("rua a", "123", "bairro a", "cidade a", "ceara", "61616161"),
                new Usuario("admin@email.com", "admin", "senha"));

        return instituicao;
    }
}
