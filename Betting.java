package GamblingGame;

public class Betting {
    int Total_Money = 100;
    int Bet = 1;
    int Total_Amount = 0;
    int No_Days =1;
    int Month_Loose_Count = 0;
    int Month_Won_Count = 0;
    int x = 0;
    int y = 0;

    void Game() {

        int Won_count = 0;
        int Loose_count = 0;

        for (No_Days=1;No_Days<=20;No_Days++) {
          while (Total_Money != 150 && Total_Money != 50) {


              double z = (int) (Math.random() * 10) % 2;
              System.out.println(z);

              if (z == 0) {
                  System.out.println("Loose the Game");
                  Total_Money = Total_Money - Bet;
                  Loose_count = Loose_count + Bet;
                  System.out.println("Total number of Game Loose : " + Loose_count);

              } else {
                  System.out.println("Won the Game");
                  Total_Money = Total_Money + Bet;
                  Won_count = Won_count + Bet;
                  System.out.println("Total number of Game Won : " + Won_count);
              }
          }
            if (Total_Money == 50)
            {
                System.out.println("Gambler Loose for the Day");
                x = Month_Loose_Count++;
            }
            else {
                System.out.println("Gambler Won for the Day ");
                y = Month_Won_Count++;
            }
              Total_Amount = Total_Amount +Total_Money;
            System.out.println("Total Amount After 20 Days : " + Total_Amount);
            System.out.println("Total number of Game Loose in a Day : " + Loose_count);
            System.out.println("Total number of Game Won in a Day : " + Won_count);
            System.out.println("Total Money is : " + Total_Money);
            System.out.println("Number of Days Won in a Month : " + y);
            System.out.println("Number of Days Lost in a Month : " + x);
        }
    }

    public static void main(String args[]) {
        Betting b = new Betting();
        b.Game();
    }
}
