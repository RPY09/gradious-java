package Arrays;
public class Coins {
    public static void main(String[] args) {
         int coins[] = { 2, 5, 7 };
    int deno = 12;
    int cnt[] = { 0 };
    coinsDeno(deno, 0, coins, cnt); 
    System.out.println(cnt[0]);
    }
     static void coinsDeno(
      int amount,
      int coinInd,
      int coins[], int cnt[]) // 3 or 6
  {
    // when the amt becomes zero sucess bc inc and return
    if (amount == 0) {
      cnt[0]++;
      return;
    }
    // when the amt < 0 ie -ve unsuccess return
    if (amount < 0) {
      return;
    }

    // expolore the possiblities
    for (int ci = coinInd; ci < coins.length; ci++) {
      coinsDeno(amount - coins[ci], ci, coins, cnt);
    }
    return;
  }
}
