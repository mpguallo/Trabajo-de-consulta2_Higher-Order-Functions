// Implementación del método de Simpson 1/3
def integracion(funcion: Double => Double, a: Double, b: Double): Double = {
  val puntoMedio = (a + b) / 2
  val f1 = funcion(a) // Evaluación en el límite inferior
  val f2 = funcion(b) // Evaluación en el límite superior
  val fMedio = funcion(puntoMedio) // Evaluación en el punto medio
  ((b - a) * (f1 + 4 * fMedio + f2)) / 6
}

// Cálculo del error absoluto
def calcularError(valorEsperado: Double, valorObtenido: Double): Double = {
  (valorEsperado - valorObtenido).abs
}


// Caso 1: Integral de -x^2 + 8x - 12 en el intervalo [3, 5]
val resultado1 = integracion(x => -Math.pow(x, 2) + 8 * x - 12, 3, 5)
val error1 = calcularError(7.33, resultado1)
println(s"Resultado 1: $resultado1, Error 1: $error1")

// Caso 2: Integral de 3x^2 en el intervalo [0, 2]
val resultado2 = integracion(x => 3 * Math.pow(x, 2), 0, 2)
val error2 = calcularError(8.0, resultado2)
println(s"Resultado 2: $resultado2, Error 2: $error2")

// Caso 3: Integral de x + 2x^2 - x^3 + 5x^4 en el intervalo [-1, 1]
val resultado3 = integracion(x => x + 2 * Math.pow(x, 2) - Math.pow(x, 3) + 5 * Math.pow(x, 4), -1, 1)
val error3 = calcularError(3.333, resultado3)
println(s"Resultado 3: $resultado3, Error 3: $error3")

// Caso 4: Integral de (2x+1)/(x^2+x) en el intervalo [1, 2]
val resultado4 = integracion(x => (2 * x + 1) / (Math.pow(x, 2) + x), 1, 2)
val error4 = calcularError(1.09861, resultado4)
println(s"Resultado 4: $resultado4, Error 4: $error4")

// Caso 5: Integral de e^x en el intervalo [0, 1]
val resultado5 = integracion(x => Math.exp(x), 0, 1)
val error5 = calcularError(1.71828, resultado5)
println(s"Resultado 5: $resultado5, Error 5: $error5")

// Caso 6: Integral de 1/sqrt(x-1) en el intervalo [2, 3]
val resultado6 = integracion(x => 1 / Math.sqrt(x - 1), 2, 3)
val error6 = calcularError(0.828427, resultado6)
println(s"Resultado 6: $resultado6, Error 6: $error6")

// Caso 7: Integral de 1/(1+x^2) en el intervalo [0, 1]
val resultado7 = integracion(x => 1 / (1 + Math.pow(x, 2)), 0, 1)
val error7 = calcularError(0.785398, resultado7)
println(s"Resultado 7: $resultado7, Error 7: $error7")
