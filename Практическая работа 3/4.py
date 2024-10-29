def beta(a, b, l, N):
    return (N - 1) * b + N * a + l
a=int(input())
b=int(input())
l=int(input())
N=int(input())
print(beta(a, b, l, N))
