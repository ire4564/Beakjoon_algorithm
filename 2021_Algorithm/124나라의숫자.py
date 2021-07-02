#내가 짠 코드 (3진법을 사용해서 했다고까지 이해 했는데 생각처럼 잘 안됐던 것 같다.)

"""
def solution(n):
    # 3진법을 사용한다
    # 몫과 나머지를 분리시켜서 생각한다
    # 나머지가 0이 될 경우 몫에서 -1을 한다
    # 0 또는 그 이외의 숫자는 4로 변환해준다
    answer = ''

    quo = int(n / 3)
    remain = int(n % 3)

    if remain == 0:
        remain = 4
        quo = quo - 1

    if quo == 1 or quo == 2 or quo == 4:
        # 1, 2, 4 라면 그대로 저장
        answer += (str(quo) + str(remain))
    else:
        if quo == 0:
            # 혹시 몫이 0이라면 저장X
            answer += str(remain)
        # 아니라면 4로 바꿔주기
        else:
            quo = 4
            answer += (str(quo) + str(remain))

    return answer
"""

#참고해서 통과한 코드
def solution(n):
    answer = ''
    three = ['1', '2', '4']

    while n > 0:
        n -= 1
        answer = three[n % 3] + answer
        n //= 3

    return answer

print(solution(3))