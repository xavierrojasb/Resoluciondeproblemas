public class ProductoNoPerecedero extends Producto
{
    private int garantia;

    public ProductoNoPerecedero(int codigo,
                                String nombre,
                                double precio,
                                int cantidad,
                                int garantia)
    {
        super(codigo, nombre, precio, cantidad);

        this.garantia = garantia;
    }

    public int getGarantia()
    {
        return garantia;
    }

    public String toString()
    {
        return super.toString() +
                " Garantia: " + garantia + " meses";
    }
}