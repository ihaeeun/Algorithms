# class Node(object):
#     def __init__(self, data):
#         self.data = data
#         self.left = self.right = None

# def recu(n, arr):
#     i=0
#     if n<1:return
#     recu(2*n, arr)
#     # i+=1
#     arr[n]+=i+1
#     return arr
#     # i+=1
#     recu(2*n+1, arr)
#     n-=1


for t in range(int(input())):
    n=int(input())
    arr=[[0,0] for i in range(n+1)]

    for j in range(1, n+1):
        if j<=n//2:
            arr[j] = [j*2]+[j*2+1]
        # if arr[j][1]
    # print(recu(n, arr))
    # recu(1, arr)