n=int(input())
a=[]
while n>0:
    for i in range(1, n+1):
        a+=[i]
        print(*a, sep=" ")
        n-=1
