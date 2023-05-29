class ParkingSystem {

    int[] parking = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        parking[0]=big;
        parking[1]=medium;
        parking[2]=small;
    }
    
    public boolean addCar(int carType) {
        return (parking[carType-1]-->0);
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
