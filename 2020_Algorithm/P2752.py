import sys
a = int(input())
arr = []
for x in range(a):
    arr.append(int(sys.stdin.readline()))
for i in sorted(arr):
    sys.stdout.write(str(i)+'\n')
    #sort 함수 대신 사용해서 입출력 시간을 줄였음