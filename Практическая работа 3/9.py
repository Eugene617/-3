n=int(input())
m=int(input())
k=int(input())
def beta(n,m,k):
    if k % n == 0 or k % m == 0:
        print("Да")
    else:
        print("Нет")
beta(n,m,k)
