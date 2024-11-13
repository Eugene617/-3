a=int(input())
def dellll(n):
    c=[]
    for i in range(1, n+1):
        if n%i==0:
            c.append(str(i))
    c=' '.join(map(str, c))
    print(c)
dellll(a)
