package praktek02;
public class Triangle {
    double alas;
    double tinggi;
    
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
}
