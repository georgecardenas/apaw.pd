package apaw.pd.state.connection;

public class Preparado extends State{

    @Override
    public void abrir(Conexion conexion) {
        return;
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(new Cerrado());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new Parado());
    }

    @Override
    public void iniciar(Conexion conexion) {
        return;
    }

    @Override
    public void enviar(Conexion conexion, Link link, String msg) {
        link.enviar(msg);
        conexion.setState(new Esperando());
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
