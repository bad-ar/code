class Users:
    # An attempts to create a user class , which describe a user profile
    
    def __init__(self , first_name , last_name , age , skill):
        self.first_name = first_name
        self.last_name = last_name
        self.age = age
        self.skill = skill
        self.login_attempts = 0
        
    def describe_user(self):
        print(f"Your name is {self.first_name} {self.last_name}")
        print(f"You are {self.age} years old.")
        print(f"You have skill in {self.skill}")
    def greet_user(self):
        print(f"{self.first_name} {self.last_name} is a good person.He is very dedicated to his work.")
        
    # method to increment login attempt
    def increment_login_attempts(self):
        self.login_attempts +=1
    # method to reset login attempts
    def reset_login_attempts(self):
        self.login_attempts = 0
        

user1 = Users("Badar" , "Uddin" , 21 , "Python")
# call method
user1.describe_user()

print(f"Login attempts: {user1.login_attempts}")
user1.increment_login_attempts()
print(f"Login attempts: {user1.login_attempts}")
user1.reset_login_attempts()
print(f"Login attempts: {user1.login_attempts}")
