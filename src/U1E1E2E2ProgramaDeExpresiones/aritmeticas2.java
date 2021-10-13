package U1E1E2E2ProgramaDeExpresiones;

import java.util.Stack;

public class aritmeticas2 {
  public void aritmeticas2() {  
   
    //Entrada (Expresión en Postfija)
     String expr = "9 19 + 2 * 66 ^ 4 / 76 -"; // equivale a la expresion postfija
    String[] post = expr.split(" ");
   
    //Declaración de las pilas
    Stack < String > E = new Stack < String > (); //Pila entrada
    Stack < String > P = new Stack < String > (); //Pila de operandos

    //Añadir post (array) a la Pila de entrada (E)
    for (int i = post.length - 1; i >= 0; i--) {
      E.push(post[i]);
    }

    //Algoritmo de Evaluación Postfija
    String operadores = "+-*/^";
    while (!E.isEmpty()) {
      if (operadores.contains("" + E.peek())) {
        P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
      }else {
        P.push(E.pop());
      }
    }

    //Mostrar resultados:
    System.out.println("Expresion: " + expr);
    System.out.println("Resultado: " + P.peek());

  }

 private static int evaluar(String op, String n2, String n1) {
    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);
    if (op.equals("+")) return (num1 + num2);
    if (op.equals("-")) return (num1 - num2);
    if (op.equals("*")) return (num1 * num2);
    if (op.equals("/")) return (num1 / num2);
    if (op.equals("^")) return (num1 ^ num2);
    return 0;
  }
}

