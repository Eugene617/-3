n=int(input())
a=1
b=1
for i in range(1, n):
    a,b=b,a+b
    print(b, end=" ")
    
  