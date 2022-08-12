public class dragoncave1 {
    public static void main(String[] args){
        System.out.println("You are in a land full of dragons. In front of you, you see two caves. \n" +
                "In one cave, the dragon is friendly and will share his tressure with you. \n" +
                "the other dragon is greedy and hingry and will eat you on sight.\n" +
                "Which cave will you go into? \n" +
                "1 or 2");
        Scanner sc = new Scanner(System.in);
        int variable;
        System.out.println("Please enter the variable value");

        variable=sc.nextInt();
        switch(variable)
        {
            switch (new Scanner(system.in).nextInt()){
                case 1:
                    System.out.println("You approach the cave... \n" +
                            "It is dark and spooky... \n" +
                            "A large dragon jumps out infront of you! He opens his jaws and... \n" +
                            "Gobbles you down in one bite!");
                    break;
                case 2:
                    System.out.println("You approach the cave... \n" +
                            "It is dark and spooky... \n" +
                            "A large dragon jumps out infront of you! He opens his jaws and... \n" +
                            "Shares all of his treasure!");
                    break;
                default:
                    System.out.println("Invaild entry, please enter 1 or 2");
            }

        }
    }
