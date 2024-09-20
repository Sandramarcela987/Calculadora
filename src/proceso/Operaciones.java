package proceso;

public class Operaciones {
 int numeroUno;
 int numeroDos;

    public Operaciones(int numeroUno, int numeroDos){
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;

    }

    public int opSuma() {
        return numeroUno + numeroDos;
    }

    public int opResta(){
        return numeroUno - numeroDos;

    }

    public int opMultiplicacion()
    {
        return numeroUno * numeroDos;
    }

    public int opDivision ()
    {
        return numeroUno / numeroDos;
    }

}



