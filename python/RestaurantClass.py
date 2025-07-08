class Restaurant:
    """An attempt to describe a restaurant"""
    def __init__(self , restaurant_name , cuisine_type ):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type
    
    # Creating a method to describe a restaurant
    def describe_restaurant(self):
        description = (
            f"{self.restaurant_name} is a warm and elegant restaurant offering exquisite {self.cuisine_type} cuisine.\n"
            f"Each dish is prepared using fresh, seasonal ingredients, blending traditional and modern flavors.\n"
            f"The cozy ambiance and attentive service make it ideal for both casual meals and special occasions."
        )
        print(description)
    
    # creating a method to show restaurant is open
    def restaurant_open(self):
        print(f'{self.restaurant_name} is open now.')
        
# Creating an instances
my_restaurant = Restaurant( "Four Season" , "Asian Food")

# Accessing attribute
print(f'{my_restaurant.restaurant_name} is the best restaurant in Bangladesh.')
print(f'{my_restaurant.restaurant_name} is {my_restaurant.cuisine_type} cuisine.\n')

# Call method 
my_restaurant.describe_restaurant()
my_restaurant.restaurant_open()

        