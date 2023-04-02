import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  int valor = 1;
  int somaPares = 0;
  int produtoImpares = 1;
  Scanner ler = new Scanner(System.in);

  while (valor > 0) {
    System.out.println("Digite um número inteiro positivo: ");
    valor = ler.nextInt();
    if (valor > 0) {
      if ((valor % 2) == 0) {
          somaPares = somaPares + valor;
      } else {
        produtoImpares = produtoImpares * valor;
      }
  
    }
  }
    System.out.println("A soma dos numeros pares é: " + somaPares);
    System.out.println("O produto dos numeros impares é: " + produtoImpares);
  }
}