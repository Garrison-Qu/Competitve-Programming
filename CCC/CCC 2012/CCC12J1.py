limit = int(input())
speed = int(input())
diff = speed - limit

if diff >= 31:
    print("You are speeding and your fine is $500.")
elif diff >= 21:
    print("You are speeding and your fine is $270.")
elif diff >= 1:
    print("You are speeding and your fine is $100.")
else:
    print("Congratulations, you are within the speed limit!")