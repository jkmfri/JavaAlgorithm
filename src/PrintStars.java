public class PrintStars {
  public static void main(String args[]){

    practice10();

  }

  private static void practice1(){
    /**
     * 1.
     * *****
     * *****
     * *****
     * *****
     * *****
     */
    System.out.println("==========================================");
    System.out.println("Practice 1.");
    System.out.println("==========================================");
    int practice1 = 4;
    for( int i=0; i < practice1; i++ ){
      for( int j=0; j < practice1; j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void practice2(){
    /**
     * 2.
     * *
     * **
     * ***
     * ****
     * *****
     */
    System.out.println("==========================================");
    System.out.println("Practice 2.");
    System.out.println("==========================================");
    int practice2 = 5;
    for( int i=0; i < practice2; i++ ){
      for( int j=0; j < practice2+1; j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void practice3(){
    /**
     * 3.
     * *****
     *  ****
     *   ***
     *    **
     *     *
     */
    System.out.println("==========================================");
    System.out.println("Practice 3.");
    System.out.println("==========================================");
    int practice3 = 5;
    for( int i=0; i < practice3; i++ ){

      for( int b=0; b < i; b++ ){
        System.out.print(" ");
      }

      for( int s=0; s < practice3-i; s++ ){
        System.out.print("*");
      }

      System.out.println();
    }
  }

  private static void practice4(){
    /**
     * 4.
     * *****
     * ******
     * *******
     * ********
     * *********
     * **********
     */
    System.out.println("==========================================");
    System.out.println("Practice 4.");
    System.out.println("==========================================");
    int practice4 = 5;
    for( int i=0; i < practice4; i++ ){
      for( int j=0; j < practice4; j++ ){
        System.out.print("*");
      }
      for( int k=0; k < i; k++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void practice5(){
    /**
     * 5.
     *     *
     *    *
     *   *
     *  *
     * *
     */
    System.out.println("==========================================");
    System.out.println("Practice 5.");
    System.out.println("==========================================");
    int practice5 = 5;
    for( int i=0; i < practice5; i++ ){
      for( int b=0; b < practice5-i; b++ ){
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }

  private static void practice6(){
    /**
     * 6.
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     */
    System.out.println("==========================================");
    System.out.println("Practice 6.");
    System.out.println("==========================================");
    int practice6 = 5;
    for( int i=0; i < practice6; i++ ){
      StringBuilder starLine = new StringBuilder();
      for( int b=practice6; b > i; b--){
        starLine.append(" ");
      }
      for( int j=0; j < i+1; j++){
        starLine.append("*");
      }
      for( int s=i+1; s > 1; s--){
        starLine.append("*");
      }
      System.out.println(starLine);
    }
  }

  private static void practice7(){
    /**
     * 7.
     * *****
     *  ****
     *   ***
     *    **
     *     *
     *    **
     *   ***
     *  ****
     * *****
     */
    System.out.println("==========================================");
    System.out.println("Practice 7.");
    System.out.println("==========================================");
    int practice7 = 5;
    for( int i=0; i < practice7; i++){
      StringBuilder starLine = new StringBuilder();
      for( int j=0; j < i+1; j++){
        starLine.append(" ");
      }
      for( int s=practice7; s > i; s--){
        starLine.append("*");
      }
      System.out.println(starLine);
    }

    for( int i=1; i < practice7; i++){
      StringBuilder starLine = new StringBuilder();
      for( int s=practice7; s > i; s--){
        starLine.append(" ");
      }
      for( int j=0; j < i+1; j++){
        starLine.append("*");
      }
      System.out.println(starLine);
    }
  }

  private static void practice8(){
    /**
     * 8.
     * *****
     *  ***
     *   *
     *  ***
     * *****
     */
    int count = 5;
    for( int i = 0; i < count; i++ ){
      if( i % 2 == 1 ) continue;
      for( int s = 0; s < i/2; s++ ){
        System.out.print(" ");
      }
      for( int s = count; s > i; s-- ){
        System.out.print("*");
      }
      System.out.println();
    }
    for( int i = 0; i < count; i++ ){
      if( i % 2 != 1 ) continue;
      for( int s = 0; s < i%3; s++ ){
        System.out.print(" ");
      }
      for( int s = 0; s < i+2; s++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void practice9(){
    /**
     * 9.
     * *   *
     * ** **
     * *****
     * ** **
     * *   *
     */
    int count = 5;
    for(int i = 1; i < count-1; i++ ) {

      for(int j = 0; j < i; j++ ) {
        System.out.print("*");
      }

      for(int j = i; j < count-i; j++ ) {
        System.out.print(" ");
      }

      for(int j = 0; j < i; j++ ) {
        if( j > 1 ) continue;
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i = 1; i < count-1; i++ ) {
      for(int j = count; j > i+2; j-- ) {
        System.out.print("*");
      }

      for(int j = 1; j < i*2; j++ ) {
        System.out.print(" ");
      }

      for(int j = 1; j < (count-1)-i ; j++ ) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  static void practice10(){
    /**
     * 10.
     * 1*   *
     * 2 * *
     * 3  *
     * 4 * *
     * 5*   *
     */
    int count = 5;
    for( int i = 0; i < count; i++ ){
      for( int j = 0; j < count; j++ ){
        if( i == j || (i+j == count-1)){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}