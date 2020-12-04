package main;

import java.util.Scanner;
public class Driver {
    public static void main(String[] args)
    { // partial driver
        System.out.println("\tSelect GP-1 or GP-2");
        System.out.println("1. GP-1");
        System.out.println("2. GP-2");
        Scanner in = new Scanner(System.in);
        char option = in.next().charAt(0);
        if(option=='1'){
            GP1 gp1 = new GP1();
            AbstractFactory abstractFactory1 = new ConcreteFactory1();
            gp1.Initialize(abstractFactory1);

            System.out.print("GasPump-1");
            System.out.print("\n");
            System.out.print("MENU of Operations");
            System.out.print("\n");
            System.out.print("          0. Activate(int)");
            System.out.print("\n");
            System.out.print("          1. Start()");
            System.out.print("\n");
            System.out.print("          2. PayCredit");
            System.out.print("\n");
            System.out.print("          3. Reject()");
            System.out.print("\n");
            System.out.print("          4. Cancel()");
            System.out.print("\n");
            System.out.print("          5. Approved()");
            System.out.print("\n");
            System.out.print("          6. PayCash(int)");
            System.out.print("\n");
            System.out.print("          7. StartPump()");
            System.out.print("\n");
            System.out.print("          8. PumpLiter()");
            System.out.print("\n");
            System.out.print("          9. StopPump()");
            System.out.print("\n");
            System.out.print("          q. Quit the program");
            System.out.print("\n");

            System.out.print("  Please make a note of these operations");
            System.out.print("\n");
            System.out.print("           GasPump-1 Execution");
            System.out.print("\n");
            char ch='1';
            Scanner sc = new Scanner(System.in);
            while (ch !='q')
            {
                System.out.print("  Select Operation: ");
                System.out.print("\n");
                System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-PumpLiter, 9-StopPump, q-quit");
                System.out.print("\n");
                ch=sc.next().charAt(0);
                switch (ch)
                {
                    case '0':
                    { //Activate()
                        int a;
                        System.out.print("  Operation:  Activate(int a)");
                        System.out.print("\n");
                        System.out.print("  Enter value of the parameter a:");
                        System.out.print("\n");
                        a = sc.nextInt();
                        gp1.Activate(a);
                        break;
                    }

                    case '1':
                    { //Start
                        System.out.print("  Operation:  Start()");
                        System.out.print("\n");
                        gp1.Start();
                        break;
                    }

                    case '2':
                    { //PayCredit
                        System.out.print("  Operation:  PayCredit()");
                        System.out.print("\n");
                        gp1.PayCredit();
                        break;
                    }

                    case '3':
                    { //Reject
                        System.out.print("  Operation:  Reject()");
                        System.out.print("\n");
                        gp1.Reject();
                        break;
                    }

                    case '4':
                    { //Cancel
                        System.out.print("  Operation:  Cancel()");
                        System.out.print("\n");
                        gp1.Cancel();
                        break;
                    }

                    case '5':
                    { //Approved
                        System.out.print("  Operation:  Approved()");
                        System.out.print("\n");
                        gp1.Approved();
                        break;
                    }

                    case '6':
                    { //PayCash
                        System.out.print("  Operation:  PayCash(int c)");
                        System.out.print("\n");
                        System.out.print("  Enter value of the parameter c:");
                        System.out.print("\n");
                        int c =  sc.nextInt();
                        gp1.PayCash(c);
                        break;
                    }

                    case '7':
                    { //StartPump
                        System.out.print("  Operation:  StartPump()");
                        System.out.print("\n");
                        gp1.StartPump();
                        break;
                    }


                    case '8':
                    { //PumpLiter
                        System.out.print("  Operation:  PumpLiter()");
                        System.out.print("\n");
                        gp1.PumpLiter();
                        break;
                    }

                    case '9':
                    { //StopPump
                        System.out.print("  Operation:  StopPump()");
                        System.out.print("\n");
                        gp1.StopPump();
                        break;
                    }
                } // endswitch

            } //endwhile
        }
        else if(option=='2'){

            AbstractFactory abstractFactory2 = new ConcreteFactory2();
            GP2 gp2 = new GP2();
            gp2.Initialize(abstractFactory2);

            System.out.print("GasPump-2");
            System.out.print("\n");
            System.out.print("MENU of Operations");
            System.out.print("\n");
            System.out.print("          0. Activate(float,float,float)");
            System.out.print("\n");
            System.out.print("          1. Start()");
            System.out.print("\n");
            System.out.print("          2. PayCredit()");
            System.out.print("\n");
            System.out.print("          3. Reject()");
            System.out.print("\n");
            System.out.print("          4. PayDebit(string)");
            System.out.print("\n");
            System.out.print("          5. Pin(string)");
            System.out.print("\n");
            System.out.print("          6. Cancel()");
            System.out.print("\n");
            System.out.print("          7. Approved()");
            System.out.print("\n");
            System.out.print("          8. Diesel()");
            System.out.print("\n");
            System.out.print("          9. Regular()");
            System.out.print("\n");
            System.out.print("          a. Super()");
            System.out.print("\n");
            System.out.print("          b. StartPump()");
            System.out.print("\n");
            System.out.print("          c. PumpGallon()");
            System.out.print("\n");
            System.out.print("          d. StopPump()");
            System.out.print("\n");
            System.out.print("          e. FullTank()");
            System.out.print("\n");
            System.out.print("          q. Quit the program");
            System.out.print("\n");

            System.out.print("  Please make a note of these operations");
            System.out.print("\n");
            System.out.print("           GasPump-2 Execution");
            System.out.print("\n");

            char ch='1';
            Scanner sc = new Scanner(System.in);
            while (ch !='q')
            {
                System.out.print("  Select Operation: ");
                System.out.print("\n");
                System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-PayDebit,5-Pin,6-Cancel,7-Approved,8-Diesel,9-Regular,a-Super,b-StartPump,c-PumpGallon,d-StopPump,e-FullTank,q-quit");
                System.out.print("\n");
                ch=sc.next().charAt(0);
                switch (ch)
                {
                    case '0':
                    { //Activate()
                        System.out.print("  Operation:  Activate(float,float,float");
                        System.out.print("\n");
                        System.out.print("  Enter value of the parameter a:");
                        System.out.print("\n");
                        float a = sc.nextFloat();
                        System.out.print("  Enter value of the parameter b:");
                        System.out.print("\n");
                        float b = sc.nextFloat();
                        System.out.print("  Enter value of the parameter c:");
                        System.out.print("\n");
                        float c = sc.nextFloat();
                        gp2.Activate(a,b,c);
                        break;
                    }

                    case '1':
                    { //Start
                        System.out.print("  Operation:  Start()");
                        System.out.print("\n");
                        gp2.Start();
                        break;
                    }

                    case '2':
                    { //PayCredit
                        System.out.print("  Operation:  PayCredit()");
                        System.out.print("\n");
                        gp2.PayCredit();
                        break;
                    }

                    case '3':
                    { //Reject
                        System.out.print("  Operation:  Reject()");
                        System.out.print("\n");
                        gp2.Reject();
                        break;
                    }
                    case '4':
                    { //PayDebit
                        System.out.print("  Operation:  PayDebit(p)");
                        System.out.print("  Enter Debit Pin");
                        System.out.print("\n");
                        String p = sc.next();
                        System.out.print("\n");
                        gp2.PayDebit(p);
                        break;
                    }
                    case '5':
                    { //Pin
                        System.out.print("  Operation:  Pin(x)");
                        System.out.print("  Enter Pin");
                        System.out.print("\n");
                        String x = sc.next();
                        System.out.print("\n");
                        gp2.Pin(x);
                        break;
                    }

                    case '6':
                    { //Cancel
                        System.out.print("  Operation:  Cancel()");
                        System.out.print("\n");
                        gp2.Cancel();
                        break;
                    }

                    case '7':
                    { //Approved
                        System.out.print("  Operation:  Approved()");
                        System.out.print("\n");
                        gp2.Approved();
                        break;
                    }

                    case '8':
                    { //Diesel
                        System.out.println("Diesel");
                        System.out.print("\n");
                        gp2.Diesel();
                        break;
                    }
                    case '9':
                    { //Regular
                        System.out.println("Regular");
                        System.out.print("\n");
                        gp2.Regular();
                        break;
                    }
                    case 'a':
                    { //Super
                        System.out.println("Super");
                        System.out.print("\n");
                        gp2.Super();
                        break;
                    }

                    case 'b':
                    { //StartPump
                        System.out.print("  Operation:  StartPump()");
                        System.out.print("\n");
                        gp2.StartPump();
                        break;
                    }


                    case 'c':
                    { //PumpGallon
                        System.out.print("  Operation:  PumpGallon()");
                        System.out.print("\n");
                        gp2.PumpGallon();
                        break;
                    }

                    case 'd':
                    { //StopPump
                        System.out.print("  Operation:  StopPump()");
                        System.out.print("\n");
                        gp2.StopPump();
                        break;
                    }
                    case 'e':
                    { //FullTank
                        System.out.print("  Operation:  FullTank()");
                        System.out.print("\n");
                        gp2.FullTank();
                        break;
                    }
                } // endswitch
            } //endwhile
        }
        else{
            System.out.println("Please enter 1 or 2. Exiting");
            in.nextLine();
        }
    }
}

