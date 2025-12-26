public class Direction_ShortestPath {
    public static void main(String[] args) {
        String str = "NS";

        int y=0,x=0;

        for(int i=0;i<str.length();i++){
            char div = str.charAt(i);

            if(div == 'N'){
                y++;
            }

              if(div == 'E'){
                x++;
            }
              if(div == 'S'){
                y--;
            }
              if(div == 'W'){
                x--;
            }

        }

        int X2=x*x;
        int Y2 =y*y;

        float ans = X2+Y2;
        float distance = (float)Math.sqrt(ans);


        System.out.println(distance);
    }
}
