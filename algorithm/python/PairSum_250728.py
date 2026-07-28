#문제: 두 개 뽑아서 더하기
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/68644?language=python3)
#날짜: 2026-07-28

def solution(numbers):
    answer = []
    sol= set()
    for i in range(len(numbers)-1):
        for j in range(i+1,len(numbers),1):
            sol.add(numbers[i]+numbers[j])
    sol=sorted(sol)
    for x in sol:
        answer.append(x)
    return answer

numbers=list(map(int,input("배열을 입력하세요: ").split()))
result = solution(numbers)  
print(result)
