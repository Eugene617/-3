a=int(input(""))
b=int(input(""))
for i in reversed(range(b|1, a+1, 2)):
    print(i, end=";")
