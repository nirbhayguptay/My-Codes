class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) 
    {
        Calendar d1 = Calendar.getInstance();
        d1.set(year,month-1,day);
        String weekday[]=new String[7];
        weekday[0] = "SUNDAY";
        weekday[1] = "MONDAY";
        weekday[2] = "TUESDAY";
        weekday[3] = "WEDNESDAY";
        weekday[4] = "THURSDAY";
        weekday[5] = "FRIDAY";
        weekday[6] = "SATURDAY";

         
        return weekday[d1.get(d1.DAY_OF_WEEK)-1];

    }
    

}