<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../styles/alterarReceitas.css">
    <title>Document</title>
</head>
<body>
        <h1>Alterar tipo da receita</h1>
    <div class="content">  
    <form action="alterarTipo" method="post">
        <input type="text" name="descricao" placeholder="ex: Crédito">
        <input type="text" name="valor" placeholder="ex: 646464,14">
        <input type="date" name="data">
        <button>Alterar</button>
    </form>
</div>
<h1>AlterarTipo</h1>
<div class="content">
    <form action="alterarProjecao" method="post">
        <input type="number" name="valor" placeholder="digite o valor para ser alterado">
        <input type="text" name="data" placeholder="digite a data a ser alterada">
        <input type="text" name="data" placeholder="digite a descricao para ser">
        <button>Alterar</button>
    </form>
   
</div>
</body>
</html>