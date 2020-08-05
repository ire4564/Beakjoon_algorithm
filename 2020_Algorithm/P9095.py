count = int(input())
arr = []

list = [1, 2, 4]
for i in range(4, 11):
    arr.append(sum(list[-3:]))

for i in range(count):
    arr.append(int(input()))

for i in range(count):
    print(list[arr[i]-1])