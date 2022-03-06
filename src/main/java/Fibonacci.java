public class Fibonacci {
    /*
        En matemáticas, la sucesión o serie de Fibonacci es la siguiente sucesión infinita de números naturales:
            0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597...
        La sucesión comienza con los números 0 y 1; a partir de estos, «cada término es la suma de los dos anteriores», es la relación de recurrencia que la define.

     */
    public int compute(int fibo) {//Fibo se refiere al termino "n" de la sucesion.
        int result = 0;

        if (fibo < 0) {
            throw new RuntimeException("numero negativo");//comentario
        }

        if (fibo == 0) {
            return 0;
        } else if (fibo == 1) {
            return 1;
        } else {
            result = compute(fibo - 1) + compute(fibo - 2);
        }
        return result;
    }
}
