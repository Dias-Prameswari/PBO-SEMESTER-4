public  class MountainBike {
    int seatheight = 0;
    int speed = 0;
    int gear = 0;
    public void SetSeatheight(int newValue)
        {
            seatheight = seatheight + newValue;
            System.out.println("Seat Height : "+seatheight);
        }

        //method
        public void changeGear(int newValue)
        {
            gear = gear + newValue;
            System.out.println("Gear : "+gear);
        }
        public void speedUp(int increment)
        {
            speed = speed + increment;
            System.out.println("Speed : "+speed);
        }
}


