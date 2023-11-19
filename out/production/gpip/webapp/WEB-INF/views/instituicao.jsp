<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ page import="main.model.entity.Instituicao" %>
<!DOCTYPE html>
<html>
<head>
    <title>Detalhes da Instituição</title>
</head>
<body>
    <h1>Detalhes da Instituição</h1>

    <%
    // Certifique-se de que instituicao não seja nulo antes de acessar seus atributos
    Instituicao instituicao = (Instituicao) request.getAttribute("instituicao");
    if (instituicao != null) {
    %>
        <p>ID: <%= instituicao.getId() %></p>
        <p>Nome: <%= instituicao.getNomeInstituicao() %></p>
        <p>Localização: <%= instituicao.getLocalizacao() %></p>
        <p>Usuário: <%= instituicao.getUsuario().getNome() %></p>
    <%
    } else {
        // Adicione um log ou mensagem para indicar que instituicao é nulo
        System.err.println("A instância de instituicao é nula na página JSP.");
    }
    %>
</body>
</html>
