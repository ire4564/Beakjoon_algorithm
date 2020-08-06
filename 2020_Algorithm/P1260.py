def dfs(v):
    print(v, end=' ')
    visit[v] = 1
    for i in range(1, n+1):
        if visit[i] == 0 and arr[v][i] == 1:
            #방문하지 않은 것이고, 간선이 연결되어있다면
            dfs(i)
            #재귀 사용
def bfs(v):
    queue = [v]
    visit[v] = 0 #이전에 1로 사용했으니까 반대로 0
    while(queue): #queue가 빌 때까지
        v = queue[0]
        print(v, end=' ')
        del queue[0]
        for i in range(1, n+1):
            if arr[v][i] == 1 and visit[i] == 1:
                queue.append(i)
                visit[i] = 0

n, m, v = map(int, input().split())
arr = [[0]*(n+1) for i in range(n+1)] #n+1개의 정점, 이차원 배열 생성
visit = [0 for i in range(n+1)] #방문 했다는 뜻

for x in range(m):
    #숫자 두 개를 입력받아서 이어주기를 표시
    v1, v2 = map(int, input().split())

    arr[v1][v2] = 1
    arr[v2][v1] = 1

dfs(v)
print()
bfs(v)
