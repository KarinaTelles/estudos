let numeroSecreto = 29;
let escolha = prompt("Escolha um número entre 1 e 30");

  if(escolha==numeroSecreto){
    alert("Você acertou! " + `O número secreto é ${numeroSecreto}`);
  }
  else{
    alert("Você errou!");
  }