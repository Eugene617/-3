n=int(input())
a=999999999999999999999999
if n>=2:
    for i in range(2, n+1):
        if n%i==0:
            if a>i:
                a=i
print(a)
