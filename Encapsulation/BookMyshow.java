class PvrMovies
{
    static private PvrMovies mticket;
    static private boolean ticketStatus = false;

    private PvrMovies()
    {
        System.out.println("Welcome to PvrMovies");
    }

    public static PvrMovies bookTicket()
    {
        if (ticketStatus == false)
        {
            mticket = new PvrMovies();
            ticketStatus = true;
        }
        return mticket;
    }
}

class BookMyshow
{
    public static void main(String[] args)
    {
        PvrMovies mTicket1 = PvrMovies.bookTicket();
        System.out.println(mTicket1);

        mTicket1 = PvrMovies.bookTicket();
        System.out.println(mTicket1);
    }
}
