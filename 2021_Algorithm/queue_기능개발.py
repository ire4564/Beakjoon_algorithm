import queue

def solution(progresses, speeds):
    queue = []
    answer = []
    count = 0

    # 큐에 삽입 (인덱스 접근 가능)
    for i in progresses:
        queue.append(100 - i)

    while len(queue) != 0:
        #queue가 빌 때까지 반복
        for x in range(0, len(queue)):
            queue[x] = queue[x] - speeds[x]

        while len(queue) != 0 :
            if queue[0] > 0:
                #양수이면 그만
                break
            else:
                # 0이거나 음수이면
                queue.pop(0)
                speeds.pop(0)
                count += 1

        if count != 0:
            answer.append(count)
            count = 0

    return answer

pro_test = [93, 30, 55]
speed_test = [1, 30, 5]
print(solution(pro_test, speed_test))