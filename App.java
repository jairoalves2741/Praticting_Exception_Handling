public class App {
    public static void main(String[] args) {
        int[] numero1 = new int[] { 10, 20, 30, 40 }; // posições: 0, 1, 2, 3
        int[] numero2 = new int[] { 2, 0, 4 }; // posições: 0, 1, 2
        // ===============================================================================
        // O FOR vai servir para rodar os arrays ,
        // mas vai parar na posição 4 de cada array
        // Assim que vai acontecer o erro e entrar em TRY CATCH
        // coloquei o for do lado de fora par que quando o ERROR caia no catch o FOR
        // continue executando os arrays
        for (int i = 0; i < 4; i++) {
            /*
             * 10/2 = 5
             * 20/3 = 6
             * 30/4 = 7
             * 40/5 = 8
             * 50/6 = ???
             */
            // ====================================================================================
            try {
                // Ele vai tentar o codigo que estiver aqui dentro, caso de erro
                // ele joga para o catch
                int resultado = numero1[i] / numero2[i];

                // printf formata a exibição assim : numero1 / numero2 = resultado
                System.out.printf("%d / %d = %d \n", numero1[i], numero2[i], resultado);
                // ====================================================================================
            } catch (ArithmeticException error) {
                // catch ArithmeticException é um erro de aritimetica, ou seja
                // o array numero1, não realizou a opração com o array numero2,
                // porque a divisão era por 0
                // ====================================================================================

                System.out.println("Erro de execucao:" + error.getMessage());
            } catch (ArrayIndexOutOfBoundsException error) {
                // catch ArrayIndexOutOfBoundsException é um erro de compatibilidade com o array
                // o array numero1, não achou o numero para executar a operação no array numero2

                System.out.println(error.getMessage());
            }
        }

    }
}