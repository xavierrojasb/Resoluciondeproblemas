public class Main
{
    public static void main(String[] args)
    {
        Inventario inventario = new Inventario();

        ProductoPerecedero p1 =
                new ProductoPerecedero(
                        1,
                        "Leche",
                        1.20,
                        50,
                        "10/12/2026");

        ProductoPerecedero p2 =
                new ProductoPerecedero(
                        2,
                        "Yogurt",
                        0.90,
                        30,
                        "15/12/2026");

        ProductoNoPerecedero p3 =
                new ProductoNoPerecedero(
                        3,
                        "Martillo",
                        12.50,
                        20,
                        12);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        System.out.println("PRODUCTOS REGISTRADOS");

        inventario.mostrarProductos();
    }
}
