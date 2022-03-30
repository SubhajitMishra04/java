
//JAVA

class user 
{
    int user_id;
    String user_name;
    String address;
    int phone_no;
  
   void getuserinfo(){};
   
}

class admin 
{
    int admin_id;
    String admin_name;
    int phone_no;

    void getadmininfo(){};

}

class train 
{
    int train_id;
    String train_name;
    String train_type;
    String carriage_type;
    int top_speed;
    int avg_speed;
    int carriage_capacity;
    int no_of_carriage;

    void gettraintype(){};
    void getcarriageno(){};

}

class junction 
{
    int jnc_id;
    String jnc_place;
    int time_taken;

    void getjunctiondetails(){};

}

class station 
{
    int station_id;
    String station_name;
    String station_address;
    int station_pin;

    void getstationinfo(){};

}

class reservation 
{
    String book_by;
    int booking_id;
    String source;
    String destination;
    int time;
    int date;

    void getreservationdetails(){};

}

class route {
    int route_id;
    int no_of_stations;
    int no_of_jnc;
    String source;
    String destination;

    void getroutedetails(){};
}

class payment {
    int payment_id;
    int user_id;
    String payment_mode;
    int date;
    int time;

    void getpaymentstatus(){};
    void getpaymentdetails(){};
    void amountcalc(){};
}

class cancellation {
    int cancellation_id;
    int date;
    int time;
    int user_id;

    void getcancellationstatus(){};
}

class refund extends cancellation {
    int refund_id;
    int cancellation_id;
    int date;
    int time;
    int amount;

    void getrefundstatus(){};
    void refundamountcalc(){};
}

class employee {
    String emp_type;
    int emp_id;
    int emp_age;
    String emp_gender;

    void getempdetails(){};

}

class passengers
{
    int pssn_id;
    String pssn_name;
    int pssn_age;
    String pssn_gender;
    String pssn_address;
    int pssn_phn_no;
    String pssn_govtid_type;
    String pssn_govtid_info;
    passengers(Integer pssn_id,String pssn_name,int pssn_age,
    String pssn_gender,
    String pssn_address)
    {
        this.pssn_id=pssn_id;
        this.pssn_name=pssn_name;
        this.pssn_age=pssn_age;
        this.pssn_gender=pssn_gender;
        this.pssn_address = pssn_address;
    }
    passengers()
    {

    }

     passengers(Integer pssn_id,String pssn_name,int pssn_age,
    String pssn_gender,
    String pssn_address,
    int pssn_phn_no,
    String pssn_govtid_type,
    String pssn_govtid_info ){
     this(pssn_id,pssn_name,pssn_age,pssn_gender,pssn_address);
     this.pssn_phn_no=pssn_phn_no;
     this.pssn_govtid_type=pssn_govtid_type;
     this.pssn_govtid_info=pssn_govtid_info;
    // this.pssn_address = pssn_address;
    };
}

class journey
{
    String depart_stn;
    String arrival_stn;
    int depart_time;
    int arrival_time;

    void getjourneydetails(){};
    void getjourneylength(){};
    void getjourneyduration(){};
}
class main
{
public static void main(String[] args) 
    {
        System.out.println("\n Hello \n");
        
        passengers passengers1=new passengers(1,"Peter",21,"male","brooklyn",23456562,"liscence","BR12547");
        passengers passengers2=passengers1;
        passengers passengers3 =new passengers();
        passengers3.pssn_id=passengers2.pssn_id;
        passengers3.pssn_age=passengers2.pssn_age;
        passengers3.pssn_name=passengers2.pssn_name;
        passengers3.pssn_gender=passengers2.pssn_gender;
        passengers3.pssn_address=passengers2.pssn_address;
        payment d=new payment();
        journey j=new journey();
        route a=new route();
        train q=new train();

    }
}













