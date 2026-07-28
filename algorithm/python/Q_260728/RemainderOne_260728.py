#문제: 나머지가 1이 되는 수 찾기
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/87389)
# #날짜: 2026-07-28

def solution(n):
    answer = 0
    for x in range(1,n,1):
        if(n%x == 1):
            answer=x
            break
    return answer

n = int(input("숫자를 입력하세요: "))
result = solution(n)
print(result)