public class Garaje {

    private Vehiculo[] espacios;

    private Garaje(  int numEspacios){
        espacios = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo vehiculo){
        for (int i = 0; i< espacios.length; i++) {
            if(espacios == null){
                espacios[i] = vehiculo;
                return true;
            }
        }
        return false;
    }

    public boolean estacionar(){
        
    }


}
