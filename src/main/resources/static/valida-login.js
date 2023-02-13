const usuarios = [
    {
        login: 'admin',
        pass: 'admin',
    },
    {
        login: 'cliente',
        pass: '123456',
    },

]

let button = document.getElementById('btnLogar')

button.addEventListener('click', function logar(){

    let login = document.getElementById('login').value
    let senha = document.getElementById('senha').value
    let validaLogin = false
    let link

    for(let i in usuarios){

        if(login == usuarios[i].login && senha == usuarios[i].pass){
            validaLogin = true
            if(i == 0){
                link = "gerenciar/index.html";
            }
            if(i == 1){
                link = "index.html";
            }
            break
        }else{
            validaLogin = false
        }

    }

    if(validaLogin == true){
        alert('Sucesso')
        location.href = link;
    }else{
        alert('Usuario ou senha incorretos')
    }

})