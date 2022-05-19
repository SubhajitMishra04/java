import java.util.ArrayList;
import java.util.Scanner;
// import pack.packA;

import javax.management.RuntimeErrorException;

//JAVA TEMP
////////////////////////////////////////
///////////////////////////////////////
//////////////////////////////////////
/////////////////////////////////////
////////////////////////////////////
///////////////////////////////////
//////////////////////////////////
/////////////////////////////////
////////////////////////////////
///////////////////////////////
//////////////////////////////
/////////////////////////////
////////////////////////////
///////////////////////////
//////////////////////////
/////////////////////////
////////////////////////
///////////////////////
//////////////////////
/////////////////////
////////////////////
///////////////////
//////////////////
/////////////////
////////////////
///////////////
//////////////
/////////////
////////////
///////////
//////////
/////////
////////
///////
//////
/////
////
///
//

class user {
    int user_id;
    String user_name;
    String address;
    int phone_no;

    void getuserinfo() {
    };

}

class admin {
    int admin_id;
    String admin_name;
    int phone_no;

    void getadmininfo() {
    };

}

class train extends reservation {
    int train_id;
    String train_name;
    String train_type;
    String carriage_type;
    int top_speed;
    int avg_speed;
    int carriage_capacity;
    int no_of_carriage;

    void gettraintype() {
    };

    void getcarriageno() {
    };

}

class junction {
    int jnc_id;
    String jnc_place;
    int time_taken;

    void getjunctiondetails() {
    };

}

class station {
    int station_id;
    String station_name;
    String station_address;
    int station_pin;

    void getstationinfo() {
    };

}

class reservation extends payment {
    String book_by;
    int booking_id;
    String source;
    String destination;
    int time;
    int date;

    ///////////////////////////// lab6.
    void getreservationdetails() {
    };

    String nameValidationfunc(String s) {
        s = s.strip();
        s = s.toUpperCase();

        // System.out.println(""+s);
        return s;
    };

    String concatfunc(String a, String b) {
        StringBuffer buff = new StringBuffer(a);
        StringBuffer buf = new StringBuffer(b);
        StringBuffer c = buff.append(" " + buf);
        String d = new String(c);
        System.out.println("" + c);
        return d;

    }

}

//////////////////////////// lab8
interface location {
    void locate();

    interface sublocation {
        static void locateDisplay() {
            System.out.println("\ndisplay Locate");
        }
    }
}

interface distance {
    void reach();
}

class route implements location, distance {
    int route_id;
    int no_of_stations;
    int no_of_jnc;
    String source;
    String destination;

    void getroutedetails() {
    };

    public void locate() {
        System.out.println("\nlocation func Interface");
    }

    public void reach() {
        System.out.println("\nldistance func Interface");
    }
}

/////////////////////////////////
class payment {
    int payment_id;
    int user_id;
    String payment_mode;
    int date;
    int time;

    void getpaymentstatus() {
    };

    void getpaymentdetails() {
    };

    void amountcalc() {
    };
}

class cancellation {
    int cancellation_id;
    int date;
    int time;
    int user_id;

    void getcancellationstatus() {
    };
}

class refund extends cancellation {
    int refund_id;
    int cancellation_id;
    int date;
    int time;
    int amount;

    ///////////////////////////// 7.5.
    refund() {
        super();

    }

    ///////////////////////////// 7.4.Accessing parent class variable, method and
    ///////////////////////////// constructor using super
    void getrefundstatus() {
        super.getcancellationstatus();
    };

    void refundamountcalc() {
        int id = super.user_id;
    };
}

//////////////////////////// 7.6.abstr
abstract class pantry {
    abstract void order();
}

class employee {
    String emp_type;
    int emp_id;
    int emp_age;
    String emp_gender;

    void getempdetails() {
    };

}

/////
class passengers extends reservation {
    int pssn_id;
    String pssn_name;
    int pssn_age;
    String pssn_gender;
    String pssn_address;
    int pssn_phn_no;
    String pssn_govtid_type;
    String pssn_govtid_info;

    passengers(Integer pssn_id, String pssn_name, int pssn_age,
            String pssn_gender,
            String pssn_address) {
        this.pssn_id = pssn_id;
        this.pssn_name = pssn_name;
        this.pssn_age = pssn_age;
        this.pssn_gender = pssn_gender;
        this.pssn_address = pssn_address;
    }

    passengers() {
    }

    passengers(Integer pssn_id, String pssn_name, int pssn_age,
            String pssn_gender,
            String pssn_address,
            int pssn_phn_no,
            String pssn_govtid_type,
            String pssn_govtid_info) {
        this(pssn_id, pssn_name, pssn_age, pssn_gender, pssn_address);
        this.pssn_phn_no = pssn_phn_no;
        this.pssn_govtid_type = pssn_govtid_type;
        this.pssn_govtid_info = pssn_govtid_info;
        // this.pssn_address = pssn_address;
    };

    public static void pssn_info() {
        System.out.println("\n Name: Alan ");
    }

    public static void pssn_info(int a) {
        System.out.println(" Age : " + a);
    }

    static class Inner {
        void msg() {
            System.out.println("\n Nested\n ");
        }
    }

}

///////////////////////////// 10
class journey extends Thread {
    String depart_stn;
    String arrival_stn;
    int depart_time;
    int arrival_time;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int j = i;
            System.out.println("\nTrain Arrival At PL" + (i + 1));
            // if(j==3)
            // {
            // throw new RuntimeException();
            // }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    void getjourneylength() {
    };

    void getjourneyduration() {
    };
}

class journey2 implements Runnable {
    public void run() {
        System.out.println("\nTrain is running");
    };
}

///////////////// 9
class NestingDemo {
    {

        // main try-block
        try {
            // try-block2
            try {
                // try-block3
                try {
                    int arr[] = { 1, 2, 3, 4 };
                    /*
                     * I'm trying to display the value of
                     * an element which doesn't exist. The
                     * code should throw an exception
                     */
                    System.out.println(arr[10]);
                } catch (ArithmeticException e) {
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
            } catch (ArithmeticException e) {
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        } catch (ArithmeticException e3) {
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        } catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }

}

//////
class railway {
    static {
        System.out.println("\n Welcome to Indian Railways");
    }

    public static void main(String args[]) {
        Scanner name = new Scanner(System.in);
        int b = 1;
        int choice;
        // System.out.println("Enter the user number : ");
        // while(b==1) {
        // choice = name.nextInt();
        // if(choice>args.length)
        // {
        // System.out.println("Wrong user input\n please reenter the user number");
        // b=1;
        // }
        // else if(choice < args.length)
        // {
        // System.out.println("Welcome "+args[choice]+"!!");
        // b=0;
        // }
        // }

        System.out.println(
                "\n Select option\n\n1.User\n\n2.Train\n\n3.Routes\n\n4.Exit\n\n5.LAB_6\n\n6.Lab_8\n\n7.Lab_9\n\n8.Lab_10\n\n9.Lab_11\n\n10.Exit");

        passengers passengers1 = new passengers(1, "Peter", 21, "male", "brooklyn", 23456562, "liscence", "BR12547");

        passengers passengers2 = passengers1;

        passengers passengers3 = new passengers();
        passengers3.pssn_id = passengers2.pssn_id;
        passengers3.pssn_age = passengers2.pssn_age;
        passengers3.pssn_name = passengers2.pssn_name;
        passengers3.pssn_gender = passengers2.pssn_gender;
        passengers3.pssn_address = passengers2.pssn_address;
        payment d = new payment();
        journey j = new journey();
        route a = new route();
        train q = new train();

        passengers.pssn_info();
        passengers.pssn_info(20);

        passengers.Inner obj = new passengers.Inner();
        obj.msg();

        route rt1 = new route();

        while (true) {

            System.out.println("\nEnter Choice : ");
            int ch = name.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nUnder Construction");
                    break;
                case 2:
                    System.out.println("\nUnder Construction");
                    break;
                case 3:
                    System.out.println("\nUnder Construction");
                    break;
                case 4:
                    System.out.println("\nUnder Construction");
                    break;
                case 5: {
                    System.out.println("\nEnter First Name : ");
                    String FirstnameValidateCheck = name.next();
                    System.out.println("\nEnter Second Name : ");
                    String SecondnameValidateCheck = name.next();

                    reservation nameCheck = new reservation();
                    FirstnameValidateCheck = nameCheck.nameValidationfunc(FirstnameValidateCheck);
                    SecondnameValidateCheck = nameCheck.nameValidationfunc(SecondnameValidateCheck);

                    String FullName = nameCheck.concatfunc(FirstnameValidateCheck, SecondnameValidateCheck);
                }
                    break;
                case 6: {
                    rt1.locate();
                    rt1.reach();
                }
                    break;
                case 7: {
                    NestingDemo nd1 = new NestingDemo();
                }
                    break;
                case 8: {
                    journey2 j1 = new journey2();
                    Thread th1 = new Thread(j1);

                    journey jj1 = new journey();
                    jj1.setPriority(Thread.MAX_PRIORITY);

                    th1.start();
                    jj1.start();

                    try {
                        jj1.join();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    try {
                        th1.join();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
                    break;

                case 9: {
                    int n = 5;

                    // Declaring the ArrayList with
                    // initial size n
                    ArrayList<Integer> arrli = new ArrayList<Integer>(n);

                    // Appending new elements at
                    // the end of the list
                    for (int i = 1; i <= n; i++)
                        arrli.add(i);

                    // Printing elements
                    System.out.println(arrli);

                    // Remove element at index 3
                    arrli.remove(3);

                    // Displaying the ArrayList
                    // after deletion
                    System.out.println(arrli);

                    // Printing elements one by one
                    for (int i = 0; i < arrli.size(); i++)
                        System.out.print(arrli.get(i) + " ");
                }
                    break;
                case 10:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid Input");

            }

        }

        //////

        ///////
    }

}
