public class honda extends merek{
    public void tampilkan(){
        String bahanbakar="Pertamax";

        merek m = new merek();
        m.inputData("CRV","SUV","Putih");
        m.tampilkandata();

        System.out.println("Jenis bahan bakar :"+bahanbakar);
    }
}