<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="styles/reset.css">
    <link rel="stylesheet" type="text/css" href="styles/index.css">
    
</head>
<body>
    <div class="header">
            <img src="img/icon-projection.png" alt="">
        <h1>Projeção de receitas e resultados</h1>
    </div>

    <div class="title-form-cad">
       <p>Cadastrar nova projeção</p> 
    </div>
    <div class="form">
    <form action="cadastrarReceita" method="post">
        <div class="elements">
        <label for="desc">Descrição:</label>
            <input type="text" name="desc" id="desc" placeholder="Ex: Crédito">
        </div>

        <div class="elements">
        <label for="data">Ano da Expectativa:</label>
            <input type="text" name="ano" id="data" placeholder="ex: 2020">
        </div>

        <div class="elements botao">
        <button>Cadastrar</button>
        </div>
        </form>
</div>

<div class="proj-feitas">
    <div class="title-form-cad">
        <p>Projeções criadas</p>
    </div>
    <table id="tabelaProj">
        <thead>
        <tr>
            <td>Descrição</td>
            <td>Projeção para</td>
            <td>Valor projetado</td>
            <td>Editar</td>
            <td>deletar</td>
        </tr>
        
    </thead>
    <tbody>
     
    </tbody>
    </table>
</div>
<script type="text/javascript" src="js/main.js"></script>

</body>
</html>