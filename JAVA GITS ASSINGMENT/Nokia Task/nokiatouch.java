import java.util.Scanner;

class Nokia {

public static void main(String[] args){

            Scanner inputCollector = new Scanner(System.in);

        String menu = """
      YOUR NOKIA PHONE - MENU MAP
   
        Press 1 -  Phone book
        press 2 -  Message
        Press 3 -  Chat  
        Press 4 -  Call Register 
        Press 5 -  Tones
        Press 6 -  Settings
        Press 7 -  Call divert
        Press 8 -  Games 
        Press 9 -  Calculator
        Press 10 - Reminders 
        Press 11 - Clock 
        Press 12 - Profiles
        Press 13 - Sim Services
        """;
    System.out.print(menu);  


//PHONE BOOK MENU

        int phoneBookChoice =  inputCollector.nextInt();

	    switch(phoneBookChoice){ 
	
		    case  1 -> {
                        System.out.println("Phone Book Menu"); 

	                    String PhoneBookMenu = """
    
                        Press 1 -   Search 
                        Press 2 -   Service Nos 
                        Press 3 -   Add name 
                        Press 4 -   Erase 
                        Press 5 -   Edit 
                        Press 6 -   Assign tone 
                        Press 7 -   Send b'card 
                        Press 8 -   Options     
                        Press 9 -   Speed dials
                        Press 10 - Voice tags
                        """; 

        System.out.print(PhoneBookMenu);

//END OF PHONEBOOK MAIN MENU

       int searchChoice = inputCollector.nextInt();

        switch(searchChoice) {


		     case 1 -> {
                       System.out.println("Search Menu");
		
	                   String SearchMenu = """
    
                                     Press 1 -   Search 
                                     Press 2 -   Service Nos 
                                     Press 3 -   Add name 
                                     Press 4 -   Erase 
                                     Press 5 -   Edit 
                                      """;

        System.out.print(SearchMenu);


        default -> System.out.println("Invalid phone book option");

//END OF PHONE BOOK MAIN MENU

        }
}

//MESSAGE MENU

            
             case 2 -> {System.out.println("Message Menu");
                 

                        String MessageMenu = """
        
                                    Press 1 - Write messages
                                    Press 2 - Inbox
                                    Press 3 - Outbox  
                                    Press 4 - PIcture messages 
                                    Press 5 - Templates
                                    Press 6 - Smileys
                                    Press 7 - Message settings
                                    """;

                System.out.print(MessageMenu);

//END OF MESSAGE MENU


//WRITE A MESSAGE
            int writeChoice = inputCollector.nextInt();

            switch (writeChoice) {

                  case 1 -> {
                            System.out.println("Write Message");

                            String WriteMessages = """
                            
                                                    Type your message...
                                                      """;     

                    System.out.print(writeMessage);
                                    
}

                default -> System.out.println("Invalid message option");

}
            }
//END OF WRITE A MESSAGE 

                 case  5 -> System.out.printf("Tones Menu"); 

		        case  6 -> System.out.printf("Settings Menu");

		        case  7 -> System.out.printf("Call divert Menu"); 

                case  8 -> System.out.printf("Games Menu"); 

		        case  9 -> System.out.printf("Calculator Menu");

		        case  10  -> System.out.printf("Reminders Menu"); 

                case  11 -> System.out.printf("Clock Menu"); 

		        case  12 -> System.out.printf("Profiles Menu");

		        case  13  -> System.out.printf("Sim Servicess Menu"); 

		default -> System.out.println("Invalid Menu Option");



    }

        }
            }      
