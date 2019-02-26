public class PP5_1CountFlips {

    public static void main(String[] args){
        final int FLIPS = 1000;
        int heads = 0, tails = 0;

        PP5_1Coin Coin = new PP5_1Coin();

        for(int count = 1; count <= FLIPS; count++){
            Coin.flip();

            if(Coin.isHeads())
                heads++;
            else
                tails++;
        }

        System.out.println("Number of flips: " + FLIPS);
        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
    }
}
