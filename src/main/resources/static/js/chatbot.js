
function toggleChat() {
    let chat = document.getElementById("chat-window");
    chat.style.display = chat.style.display === "flex" ? "none" : "flex";
}

function sendMessage() {
    let input = document.getElementById("userInput");
    let msg = input.value;

    fetch("/api/chat", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({message: msg})
    })
    .then(res => res.json())
    .then(data => {
        let chatBody = document.getElementById("chat-body");

        chatBody.innerHTML += "<p><b>You:</b> " + msg + "</p>";
        chatBody.innerHTML += "<p><b>Bot:</b> " + data.reply + "</p>";

        input.value = "";
        chatBody.scrollTop = chatBody.scrollHeight;
    });
}

