package Session6;

public class While2Class {
    
    static void main() {
        
        boolean amBenzina =true;
        int litri = 60;
        int kilometri = 0;
        
        while (amBenzina){
            System.out.println("merg cu masina si mai am "+ litri + "litrii in rezervor si sunt la kilometru :" + kilometri);
            final int i = kilometri++;

            if ((kilometri % 100) == 0) {
                litri = litri -6;
                
                        
                        
            }
        }
    }
    
    
}
