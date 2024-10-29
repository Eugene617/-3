a=int(input())
b=int(input())
c=int(input())
def beta(a,b,c):
    if a==b and a==c and b==c:
        print(3)
    elif a==b or a==c or b==c:
        print(2)
    else: 
        print(0)
beta(a,b,c)
