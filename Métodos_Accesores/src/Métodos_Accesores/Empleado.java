package Métodos_Accesores;

public class Empleado {
    private  int edad;
    private  String name;

    public void setEdad(int _edad){
        if (_edad>=18 &&_edad<=80){
            this.edad=_edad;
        }else {
            System.out.println("EDAD NO VALIDA");
        }
    }
    public int getEdad() {
        return this.edad;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getName() {
        return name;
    }


}
