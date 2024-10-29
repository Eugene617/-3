a=9999999999999999999
b=0
c=999999999999999
d=-99999999999999999999999
while a!=0:
    c=a
    a=int(input())
    if c==a:
        b+=1
        if d<b:
            d=b
    elif c!=p:
        b=1
print(d)
