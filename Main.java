


public class Main {
    public static void main(String[] args) {

       System.out.println(Kata.incrementString("foo"));

    }
    public class Kata {
        public static String incrementString(String str) {
            String add = "1";

            if(str == "")
                return "1";
            int count = 0;
            char[] c = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int i = 0; i < c.length ; i++) {
                if(Character.isDigit(c[i])){
                    sb.append(c[i]);
                    count++;
                }
            }
            if(count==0 && str != "")
                return str+add;
            for (int i = 0; i <c.length -count ; i++) {
                sb2.append(c[i]);


            }
          //  System.out.println(sb2);
            //System.out.println(sb);
            int number = Integer.parseInt(String.valueOf(sb)) + 1;
           //System.out.println(String.format("%0"+count + "d",number));
            sb2.append(String.format("%0"+count + "d",number));
          //  System.out.println(sb2);
            String st = String.valueOf(sb2);


            return st;
        }
    }

}