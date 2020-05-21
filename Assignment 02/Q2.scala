object Q2 extends App{

    def attendees(ticket_price:Int):Int={
        return 120+ ((15-ticket_price)/5)*20;
    }

    def cost_per_show(attendees_pershow:Int,ticket_price:Int):Int={
        return 500 + attendees_pershow*3;
    }

    def income(attendees_pershow:Int,ticket_price:Int):Int={
        return attendees_pershow*ticket_price;
    }

    def profit(ticket_price:Int):Int={
        return income(attendees(ticket_price),ticket_price)-cost_per_show(attendees(ticket_price),ticket_price);
    }

    print("Ticket Price:");val ticket_price = scala.io.StdIn.readInt();
    printf("Profit for the ticket price Rs.%d = %d\n",ticket_price,profit(ticket_price));


}