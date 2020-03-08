window.onload = carregarLista()

function carregarLista(){
    var xhr = new XMLHttpRequest()
    xhr.open("GET", "consultar", true)
    xhr.addEventListener("load", function(){
        if(xhr.status == 200){
            var proj = JSON.parse(xhr.responseText)
            proj.forEach(function(projecoes) {
                criarLista(projecoes.descricao, projecoes.valor, projecoes.ano, projecoes.id)
            })
        }
    })
    xhr.send()
}

function criarLista(descricao, valor, data, id){
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
    btnDel.setAttribute('id', id)
    btnDel.classList.add('del')

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

    adcionarListener(tdBotao)
    adcionarListener(tdBotaoDel)

    table.appendChild(tr)  
}

function adcionarListener(elemento){
    elemento.addEventListener('click', function(e){
      var ids =  e.target.id

      EnviarId(ids)
    })
}

function EnviarId(id){
    var xhr1 = new XMLHttpRequest()
    xhr1.open("POST", "deletar", true)
    xhr1.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8")
    xhr1.addEventListener("load", function(){
        if(xhr1.status == 200){
            var resp = JSON.parse(xhr1.responseText)
            console.log(resp)
        }else{
            console.log(xhr1.status)
            console.log(xhr1.responseText)
        }
    })
    var str = "id=" + id
    xhr1.send(str)
}