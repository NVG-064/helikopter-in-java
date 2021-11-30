public class HelikopterHelikopter {
    static int num = 2;
    public static void main(String[] NVG064) {
        try {
            while (true) {
                System.out.print("\033[H\033[2J"); // Clear screen

                if (num%2 == 0) System.out.println("ROFL:ROFL:LOL:");
                else System.out.println("         :LOL:ROFL:ROFL");
                System.out.println("           A");
                System.out.println("  L    /--------");
                System.out.println(" LOL====      []\\");
                System.out.println("       \\         \\");
                System.out.println("        \\---------]");
                System.out.println("           I     I");
                System.out.println("        -----------/");

                ++num;
                if (num == 2147483646) num = 2; // Reset and make it unlimited when reaching limit of int
                if ((num >= 2) && (num <= 10)) Thread.sleep(300);
                else if ((num > 10) && (num <= 20)) Thread.sleep(200);
                else if ((num > 20) && (num <= 30)) Thread.sleep(100);
                else if ((num > 30) && (num <= 40)) Thread.sleep(90);
                else if ((num > 40) && (num <= 50)) Thread.sleep(80);
                else if ((num > 50) && (num <= 60)) Thread.sleep(70);
                else Thread.sleep(60);
            }
        } catch (Exception e) {
            // Does nothing because it don't handling any Exceptions
        }
    }
}