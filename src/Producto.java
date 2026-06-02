public class Producto
{
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(int pCodigo,
                    String pNombre,
                    double pPrecio,
                    int pCantidad)
    {
        codigo = pCodigo;
        nombre = pNombre;
        precio = pPrecio;
        cantidad = pCantidad;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int pCantidad)
    {
        cantidad = pCantidad;
    }

    public String toString()
    {
        return "Codigo: " + codigo +
                " Nombre: " + nombre +
                " Precio: " + precio +
                " Cantidad: " + cantidad;
    }
}