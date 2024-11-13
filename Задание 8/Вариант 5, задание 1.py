a=int(input())
b=int(input())
c=int(input())
d=int(input())
q=b*d
w=(a*d)-(c*b)
k=1
s=1
if q<0:
    q=abs(q)
    k*=-1
if w<0:
    w=abs(w)
    s*=-1
if k==s==-1:
    k=1
    s=1
c=q
v=w
while w!=q:
    if w>q:
        w=w-q
    else:
        q=q-w
c=(c/q)*k
v=(v/q)*s
print(int(v), '/',int(c))
