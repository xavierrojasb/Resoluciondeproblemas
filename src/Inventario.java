import java.util.ArrayList;

public class Inventario
{
    private ArrayList<Producto> productos;

    public Inventario()
    {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }

    public void mostrarProductos()
    {
        for(Producto producto : productos)
        {
            System.out.println(producto);
        }
    }
}