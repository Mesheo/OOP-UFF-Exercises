function maiorDivisor(numero, divisores) {
    let maiorDivisor = 1;
    let q = numero;
    for(divisor of divisores){
      if ( (numero/divisor < q) && ((numero/divisor) >= 1) ){
         maiorDivisor = divisor
      }
    }
    return maiorDivisor
  }
  
  function calcularMoedas(centavos){
      console.log(`Para representar ${centavos} centavos precisamos de`)
      const moedas = [1,5,10,25,50,100]
      let resto = centavos;
      while (resto > 0){
          console.log(`Uma moeda de ${maiorDivisor(resto, moedas)} centavos`);
          resto -= maiorDivisor(resto, moedas);
      }
  }
  
  console.log(calcularMoedas(225))
  
  
  