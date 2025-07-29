a=int(input("Enter Number:"))
b=int(input("Enter Number:"))

if(a>b):
    print("Invalid range")
else:
    for i in range (a,b+1):
        if((i%4==0 and i%100!=0) or (i%400==0)):
            print(i)