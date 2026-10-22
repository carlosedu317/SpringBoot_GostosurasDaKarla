const formulario = document.getElementById("formCadastro");

formulario.addEventListener("submit", function(event) {

    event.preventDefault();

    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;
    const confirmarSenha = document.getElementById("confirmarSenha").value;
    const tipoUsuario = document.getElementById("tipo").value;

    if (senha !== confirmarSenha) {
        alert("As senhas não são iguais!");
        return;
    }

    fetch("http://localhost:8080/api/usuarios", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            nome: nome,
            email: email,
            senha: senha,
            tipoUsuario: tipoUsuario
        })
    })
    .then(response => {

        if (!response.ok) {
            throw new Error("Erro ao cadastrar usuário");
        }

        return response.json();
    })
    .then(data => {

        console.log(data);

        alert("Usuário cadastrado com sucesso!");

    })
    .catch(error => {

        console.error(error);

        alert("Erro ao cadastrar usuário.");

    });

});