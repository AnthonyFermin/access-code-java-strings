package nyc.c4q.AnthonyFermin.Unit0.Lesson1.VariablesAndTypes;

public class VariablesAndNames
{
    public static void main( String[] args )
    {
        //Initializes variables with the Int type
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        //Initializes variables with the double type
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        //assigns values to variables
        cars = 100;
        space_in_a_car = 4.0;
        drivers = 90;
        passengers = 30;

        //performing some basic arithmetic
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        //dividing the Int value 30 with Int value 90 and returning Int value 0, it then converts to a Double as 0.0
        average_passengers_per_car = passengers / cars_driven;

        //printing out values
        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}