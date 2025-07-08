class Car:
    """An attempt to describe a car"""
    
    def __init__(self , make , model , year):
        """Initialize the attributes to represent the car"""
        self.make = make
        self.model = model
        self.year = year
        self.odometer_reading = 0
    
    def get_descriptive_name(self):
        """Return a neatly formatted descriptive name"""
        print(f'{self.year} {self.make} {self.model}')
    
    def read_odometer(self):
        """Print's a statement that show a car's mileage"""
        print(f'The car has {self.odometer_reading} miles on it.')
    def update_odometer(self , mileage):
        """
        Set odometer reading to given value
        Reject if given value is less than the previous odometer reading.
        """
        if(mileage >= self.odometer_reading):
            self.odometer_reading = mileage
        else:
            print(f"You can't roll back an odometer")
            
    
my_car = Car('audi' , 'a4' , 2025)

# Accessing the attributes
print(f'The model of the car is {my_car.model}')

# Method call
my_car.get_descriptive_name()

my_car.read_odometer()

my_car.update_odometer(33)
my_car.read_odometer()
my_car.update_odometer(23)