const form = document.getElementById("formProduto");

form.addEventListener("submit", async function(event) {

    event.preventDefault();

    const produto = {
        nome: document.getElementById("nome").value,
        preco: Number(document.getElementById("preco").value),
        categoria: document.getElementById("categoria").value,
        descricao: document.getElementById("descricao").value,
        imagem: document.getElementById("imagem").value
    };

    try {

        const resposta = await fetch("http://localhost:8080/api/produtos", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(produto)
        });

        if (!resposta.ok) {
            throw new Error("Erro ao cadastrar produto");
        }

        alert("Produto cadastrado com sucesso!");

        form.reset();

    } catch (erro) {

        console.error(erro);
        alert("Erro ao cadastrar produto.");

    }
});