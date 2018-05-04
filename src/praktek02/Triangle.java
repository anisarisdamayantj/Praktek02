package praktek02;
public class Triangle {
    double alas;
    double tinggi;

    public Triangle() {
        alas = 5;
        tinggi = 9;
    }
    
    
    
    void cetakInfo(){
        System.out.println("==========================");
        System.out.println("Alas : "+alas);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("==========================");
     
       
    }
    
    double hitungluas(){
       double Luas;
       Luas = 0.5*alas*tinggi;
       return Luas;
    }
    void cetakLuas(){
        System.out.println("Luasnya Adalah = "+hitungluas());
    }
}
