#문제: 배열 두배 만들기
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/120809)
#날짜: 2026-07-29

def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        answer.append(2*numbers[i])
    return answer

numbers=list(map(int,input("배열을 입력하세요: ").split()))
result = solution(numbers)  
print(result)

#def solution(numbers):
# return [num*2 for num in numbers]