console.log("Ele encontrou")

window.onload = carregarLista()

function carregarLista(){
    var xhr = new XMLHttpRequest()
    xhr.open("GET", "consultar", true)

    xhr.addEventListener("load", function(){
        if(xhr.status == 200){
            var proj = JSON.parse(xhr.responseText)
            proj.forEach(function(projecoes) {
                criarLista(projecoes.descricao, projecoes.valor, projecoes.ano)
            });
        }
    })
    xhr.send()
}

function criarLista(descricao, valor, data){
    var table = document.querySelector("tbody")
    
    var tr = document.createElement("tr")
    var tdDesc = document.createElement("td")
    var tdValor= document.createElement("td")
    var tdData= document.createElement("td")
    var tdBotao = document.createElement('td')
    var tdBotaoDel = document.createElement('td')
    var btnEdit = document.createElement('BUTTON');
    var btnDel = document.createElement('BUTTON');

    var edit = document.createTextNode("Editar"); 
    var del = document.createTextNode("Deletar")  

    btnEdit.appendChild(edit);
    btnDel.appendChild(del)
    btnDel.setAttribute('id', 'del')

    tdDesc.textContent = descricao
    tdValor.textContent = valor
    tdData.textContent = data
    tdBotao.appendChild(btnEdit)
    tdBotaoDel.appendChild(btnDel)
    
    tr.appendChild(tdDesc)
    tr.appendChild(tdData)
    tr.appendChild(tdValor)
    tr.appendChild(tdBotao)
    tr.appendChild(tdBotaoDel)
    table.appendChild(tr)
}