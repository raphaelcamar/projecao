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
				<label for="desc">Descrição</label>
				<select id="desc" name="desc">
                    <option value="Conta poupança">Conta Poupança</option>
                    <option value="Conta Corrente">Conta Corrente</option>
                    <option value="Renda de Cartão">Renda de Cartão</option>
                    <option value="Crédito">Crédito</option>
                    <option value="Administração de fundo">Administração de fundo</option>
                    <option value="Tarifa Interbancária">Tarifa Interbancária</option>
                  </select>
			</div>

			<div class="elements">
				<label for="data">Ano da Expectativa:</label> <input type="text"
					name="ano" id="data" placeholder="ex: 2020">
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

		<div class="edit invisible">
			<p class="title-form-cad">Editar Projeção</p>
			<form action="editarInfos" method="post">

				<label for="desc">Descrição:</label> <input type="text" name="desc"
					id="descEdit"> <label for="anoEdit">Projeção para:</label>
				<input type="text" name="ano" id="anoEdit"> <label
					for="valorEdit">Valor projetado(M):</label> <input type="number"
					name="valor" id="valorEdit"> <input type="hidden" name="id">

				<button id="att">Atualizar</button>
			</form>
		</div>
	</div>
	<table id="tabelaProj">
		<thead>
			<tr>
				<td>Descrição</td>
				<td>Projeção para</td>
				<td>Valor projetado(M)</td>
				<td>Editar</td>
				<td>deletar</td>
			</tr>

		</thead>
		<tbody>

		</tbody>
	</table>
	<div class="anm-load inativo">
		<div class="loader loader--style1" title="0">
			<svg version="1.1" id="loader-1" xmlns="http://www.w3.org/2000/svg"
				xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
				width="40px" height="40px" viewBox="0 0 40 40"
				enable-background="new 0 0 40 40" xml:space="preserve">
                <path opacity="0.2" fill="#000"
					d="M20.201,5.169c-8.254,0-14.946,6.692-14.946,14.946c0,8.255,6.692,14.946,14.946,14.946
                  s14.946-6.691,14.946-14.946C35.146,11.861,28.455,5.169,20.201,5.169z M20.201,31.749c-6.425,0-11.634-5.208-11.634-11.634
                  c0-6.425,5.209-11.634,11.634-11.634c6.425,0,11.633,5.209,11.633,11.634C31.834,26.541,26.626,31.749,20.201,31.749z" />
                <path fill="#000"
					d="M26.013,10.047l1.654-2.866c-2.198-1.272-4.743-2.012-7.466-2.012h0v3.312h0
                  C22.32,8.481,24.301,9.057,26.013,10.047z">
                  <animateTransform attributeType="xml"
					attributeName="transform" type="rotate" from="0 20 20"
					to="360 20 20" dur="0.5s" repeatCount="indefinite" />
                  </path>
                </svg>
		</div>
		<p>Aguarde enquanto estamos recuperando os dados para visualização...</p>
	</div>

	<script type="text/javascript" src="js/main.js"></script>

</body>
</html>