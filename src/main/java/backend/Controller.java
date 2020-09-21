package backend;

public class Controller<and> {

        public static Object evaluate;
        private static long ball;
        private static boolean isGallHit;
        private static double ballgoaldistance;
        int score;
        String status;
        private Position Position;



        public Controller(){

        }
        public void count(){
        }
        public static boolean evaluate(){
                if (ballgoaldistance<1){
                        isGallHit = true;
                }
                return false;
        }
        public void decision(){

        }
    }


