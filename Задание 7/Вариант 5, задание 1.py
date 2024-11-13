a=[1,2,2,3,3,5,5,2,1,1]
for i in range(len(a)-1):
    if a[i]==a[i+1] and a[i]%2>0:
        print(a[i],a[i+1])
