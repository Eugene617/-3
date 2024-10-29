N=int(input())
a=1
b=0
for i in range(1, N+1):
    if a*2<=N:
        a*=2
        b+=1
print(a, b)
