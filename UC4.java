public class OOPSBannerApp {
  public static void main(String[] args) {
    string[] lines = new String[7];

lines[0] = system.out.println(String.join("   ***   ","   ***   ","*********","  ****** "));
lines[1] = system.out.println(String.join(" **   ** "," **   ** ","*       *"," **      "));
lines[2] = system.out.println(String.join("**     **","**     **","*       *","**       "));
lines[3] = system.out.println(String.join("**     **","**     **","*********","  ****** "));
lines[4] = system.out.println(String.join("**     **","**     **","*        ","      ** "));
lines[5] = system.out.println(String.join(" **   ** "," **   ** ","*        ","       **"));
lines[6] = system.out.println(String.join("   ***   ","   ***   ","*        ","  ****** "));

for (String line : lines) {
  System.out.println(line);
}
}
}
