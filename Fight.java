public class GameFight {
    public static void main(String[] args) {
        int playerTotalHp=80;
        int botTotalHp=80;
        Player player1 = new Player();
        Bot bot1 =new Bot ();
        int botHit= bot1.botHitInHead();
        int botHit2= bot1.botHitInChest();
        int botHit3= bot1.botHitInLeg();
        int hit1 = player1.playerHitInHead();
        int hit2 = player1.playerHitInChest();
        int hit3 = player1.playerHitInLeg();

        System.out.println("Hello!!! Welcome to Fight battle. Try to beat BOT!");
        do {
            System.out.println("Please select your hit to the bot");
            System.out.println("1. In head. 2. In chest. 3. In leg");
            Scanner scan = new Scanner(System.in);
            int player = scan.nextInt();
            //PLAYER FIRST HIT IN HEAD
            if (player == 1) {
                int max = 3;
                int min = 1;
                int range1 = max - min + 1;
                int rand3 = (int)(Math.random() * range1) + min;
                if (rand3==1){
                    System.out.println("Bot stopped your hit in head");
                } else if (rand3!=1){
                    System.out.println("Your hit in head. Your damage is " + hit1 + ". " + "Bot total HP left " + (botTotalHp - hit1));
                    botTotalHp=botTotalHp - hit1;
                    if (botTotalHp<=0){
                        System.out.println("Well done bot is defeated!");
                     return;
                    }
                }
               System.out.println("Now BOT will attack!");
                System.out.println("Please select Block");
                System.out.println("1. Block Head. 2. Block chest 3. BLock Leg.");
                int player2 = scan.nextInt();
                // BOT HIT With block in HEAD
                if (player2==1) {
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("Well done you stopped BOT hit in head");
                    } else if (rand4 == 2) {
                        System.out.println("BOT hit in chest.  Damage is " + botHit2 + ". " + "YOUR HP left " + (playerTotalHp - botHit2));
                        playerTotalHp = playerTotalHp - botHit2;

                    } else if (rand4 == 3) {
                        System.out.println("BOT hit in Leg.  Damage is " + botHit3 + ". " + "YOUR HP left " + (playerTotalHp - botHit3));
                        playerTotalHp = playerTotalHp - botHit3;
                    } if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;
                    }
                    // BOT HIT WITH BLOCK in CHEST
                } else if (player2==2){
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("BOT hit in Head.  Damage is " + botHit + ". " + "YOUR HP left " + (playerTotalHp - botHit));
                        playerTotalHp = playerTotalHp - botHit;
                    } else if (rand4 == 2) {
                        System.out.println("Well done you stopped BOT hit in chest");
                    } else if (rand4 == 3) {
                        System.out.println("BOT hit in Leg.  Damage is " + botHit3 + ". " + "YOUR HP left " + (playerTotalHp - botHit3));
                        playerTotalHp = playerTotalHp - botHit3;
                    } if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                    //BOT HIT and block LEG
                } else if (player2==3){
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("BOT hit in head.  Damage is " + botHit + ". " + "YOUR HP left " + (playerTotalHp - botHit));
                        playerTotalHp = playerTotalHp - botHit;
                    } else if (rand4 == 2) {
                        System.out.println("BOT hit in chest.  Damage is " + botHit2 + ". " + "YOUR HP left " + (playerTotalHp - botHit2));
                        playerTotalHp = playerTotalHp - botHit2;
                    } else if (rand4 == 3) {
                        System.out.println("Well done you stopped BOT hit in leg");
                    }if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                }

            // HIT IN CHEST
            } else if (player == 2) {
                int max = 3;
                int min = 1;
                int range1 = max - min + 1;
                int rand3 = (int)(Math.random() * range1) + min;
                if (rand3==2){
                    System.out.println("Bot stopped your hit chest");
                } else if (rand3!=2){
                    System.out.println("Your hit in chest. Your damage is " + hit2 + ". " + "Bot total HP left " + (botTotalHp - hit2));
                    botTotalHp=botTotalHp - hit2;
                    if (botTotalHp<=0){
                        System.out.println("Well done bot is defeated!");
                        return;
                    }
                }
                System.out.println("Now BOT will attack!");
                System.out.println("Please select Block");
                System.out.println("1. Block Head. 2. Block chest 3. BLock Leg.");
                int player2 = scan.nextInt();
                // BOT HIT With block in HEAD
                if (player2==1) {
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("Well done you stopped BOT hit in head");
                    } else if (rand4 == 2) {
                        System.out.println("BOT hit in chest.  Damage is " + botHit2 + ". " + "YOUR HP left " + (playerTotalHp - botHit2));
                        playerTotalHp = playerTotalHp - botHit2;
                    } else if (rand4 == 3) {
                        System.out.println("BOT hit in Leg.  Damage is " + botHit3 + ". " + "YOUR HP left " + (playerTotalHp - botHit3));
                        playerTotalHp = playerTotalHp - botHit3;
                    } if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                    // BOT HIT WITH BLOCK in CHEST
                } else if (player2==2){
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("BOT hit in Head.  Damage is " + botHit + ". " + "YOUR HP left " + (playerTotalHp - botHit));
                        playerTotalHp = playerTotalHp - botHit;
                    } else if (rand4 == 2) {
                        System.out.println("Well done you stopped BOT hit in chest");
                    } else if (rand4 == 3) {
                        System.out.println("BOT hit in Leg.  Damage is " + botHit3 + ". " + "YOUR HP left " + (playerTotalHp - botHit3));
                        playerTotalHp = playerTotalHp - botHit3;
                    }if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                    //BOT HIT and block LEG
                } else if (player2==3) {
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("BOT hit in head.  Damage is " + botHit + ". " + "YOUR HP left " + (playerTotalHp - botHit));
                        playerTotalHp = playerTotalHp - botHit;
                    } else if (rand4 == 2) {
                        System.out.println("BOT hit in chest.  Damage is " + botHit2 + ". " + "YOUR HP left " + (playerTotalHp - botHit2));
                        playerTotalHp = playerTotalHp - botHit2;
                    } else if (rand4 == 3) {
                        System.out.println("Well done you stopped BOT hit in leg");
                    }if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                }
            }
            //HIT in LEG!
            else if (player == 3) {
                int max = 3;
                int min = 1;
                int range1 = max - min + 1;
                int rand3 = (int) (Math.random() * range1) + min;
                if (rand3 == 3) {
                    System.out.println("Bot stopped your hit in leg");
                } else if (rand3 != 3) {
                    System.out.println("Your hit in leg. Your damage is " + hit3 + ". " + "Bot total HP left " + (botTotalHp - hit3));
                    botTotalHp = botTotalHp - hit3;
                    if (botTotalHp<=0){
                        System.out.println("Well done bot is defeated!");
                        return;
                    }
                }
                System.out.println("Now BOT will attack!");
                System.out.println("Please select Block");
                System.out.println("1. Block Head. 2. Block chest 3. BLock Leg.");
                int player2 = scan.nextInt();
                // BOT HIT With block in HEAD
                if (player2 == 1) {
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("Well done you stopped BOT hit in head");
                    } else if (rand4 == 2) {
                        System.out.println("BOT hit in chest.  Damage is " + botHit2 + ". " + "YOUR HP left " + (playerTotalHp - botHit2));
                        playerTotalHp = playerTotalHp - botHit2;
                    } else if (rand4 == 3) {
                        System.out.println("BOT hit in Leg.  Damage is " + botHit3 + ". " + "YOUR HP left " + (playerTotalHp - botHit3));
                        playerTotalHp = playerTotalHp - botHit3;
                    }if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                    // BOT HIT WITH BLOCK in CHEST
                } else if (player2 == 2) {
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("BOT hit in Head.  Damage is " + botHit + ". " + "YOUR HP left " + (playerTotalHp - botHit));
                        playerTotalHp = playerTotalHp - botHit;
                    } else if (rand4 == 2) {
                        System.out.println("Well done you stopped BOT hit in chest");
                    } else if (rand4 == 3) {
                        System.out.println("BOT hit in Leg.  Damage is " + botHit3 + ". " + "YOUR HP left " + (playerTotalHp - botHit3));
                        playerTotalHp = playerTotalHp - botHit3;
                    }if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                    //BOT HIT and block LEG
                } else if (player2 == 3) {
                    int max1 = 3;
                    int min1 = 1;
                    int range2 = max - min + 1;
                    int rand4 = (int) (Math.random() * range1) + min;
                    if (rand4 == 1) {
                        System.out.println("BOT hit in head.  Damage is " + botHit + ". " + "YOUR HP left " + (playerTotalHp - botHit));
                        playerTotalHp = playerTotalHp - botHit;
                    } else if (rand4 == 2) {
                        System.out.println("BOT hit in chest.  Damage is " + botHit2 + ". " + "YOUR HP left " + (playerTotalHp - botHit2));
                        playerTotalHp = playerTotalHp - botHit2;
                    } else if (rand4 == 3) {
                        System.out.println("Well done you stopped BOT hit in leg");
                    }if (playerTotalHp<=0){
                        System.out.println("You LOOSE!");
                        return;}
                }
            }
        } while (botTotalHp>=0);
        if (botTotalHp>playerTotalHp){
            System.out.println("YOU loose, BOT WINS!");
        }
        if (botTotalHp<playerTotalHp){
            System.out.println("YOU WIN!");
        }

    }
}

class Player{

    public int playerHitInHead(){
        int max = 18;
        int min = 7;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
    public int playerHitInChest(){
        int max = 15;
        int min = 8;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
    public int playerHitInLeg(){
        int max = 13;
        int min = 10;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
}
}
class Bot{

    public int botHitInHead(){
        int max = 18;
        int min = 7;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
    public int botHitInChest(){
        int max = 15;
        int min = 8;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
    public int botHitInLeg(){
        int max = 13;
        int min = 10;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
}

