public class Task2 {
    private boolean flag = false;

    public boolean isPryamoug(int a, int b, int c) {
        if(isUpofTriangle(a,b,c)){
            c = c*c;
           if( c == a*a + b*b){
               flag = true;
               System.out.println("Прямоугольный  и точки являются вершинами прямоугольника");
           }
        }else{
           flag = false;
        }
       return flag;
    }

    private boolean isUpofTriangle(int a, int b, int c) {
        flag = a < b + c && a > Math.abs(b - c);
        return flag;
    }


}
