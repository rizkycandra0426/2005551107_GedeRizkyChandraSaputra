public class toyota extends merek{
    public void tampilkan(){
        String bahanbakar;
        bahanbakar="Pertamax";

        merek m = new merek();
        m.inputData("Fortuner","SUV","Hitam");
        m.tampilkandata();

        System.out.println("Jenis bahan bakar :"+bahanbakar);
    }
}