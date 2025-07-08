# Book: Python Crash Course
class Dog:
    """A simple attempt to model a dog class"""
    def __init__(self , name , age):
        self.name = name
        self.age = age
    """Creating a method to print a dog is sitting"""
    def sit(self):
        print(f'The {self.name} is now sitting')
    
    """Creating a method to print a dog is roll over"""
    def roll_over(self):
        print(f'The {self.name} rolled over')
    

my_dog = Dog("Wilie" , 6)

# Accessing attribute
print(f'My dog name is {my_dog.name}')
print(f'My dog is {my_dog.age} years old')

# Call method 
my_dog.sit()
my_dog.roll_over()

# Let's create another dog class

your_dog = Dog('Lucy' , 4)

# Accessing attribute
print(f'\nYour dog name is {your_dog.name}')
print(f'Your dog is {your_dog.age} years old')

# Call method 
my_dog.sit()
my_dog.roll_over()


