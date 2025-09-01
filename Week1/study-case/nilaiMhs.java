class nilaiMhs{
  int x;
  int y;
  public nilaiMhs(int a,int b){
    x=a; y=b;
  }
  int hitung(int z){
    return (x+y+z)/3;
  }
}
public class mainn{
  public static void main(String args[]){
    nilaiMhs nm = new nilaiMhs(80,70);
    int r=nm.hitung(90);
    System.out.println("hasil:"+r);
  }
}