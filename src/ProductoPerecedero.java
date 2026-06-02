public class ProductoPerecedero extends Producto
{
    private String fechaCaducidad;

    public ProductoPerecedero(int codigo,
                              String nombre,
                              double precio,
                              int cantidad,
                              String fechaCaducidad)
    {
        super(codigo, nombre, precio, cantidad);

        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad()
    {
        return fechaCaducidad;
    }

    public String toString()
    {
        return super.toString() +
                " Fecha Caducidad: " + fechaCaducidad;
    }
}