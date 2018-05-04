package praktek02;
public class TriangleAksi {
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        t1.alas = 7;
        t1.tinggi = 5;
        
        t1.cetakInfo();
        System.out.println("Luas Triangle= "+t1.hitungluas());
        t1.cetakInfo();
        t1.cetakLuas();
        
        Triangle t2 = new Triangle();
            t2.cetakInfo();
            
        Triangle t3 = new Triangle(10,15);
            t3.cetakInfo();    
    }
}
