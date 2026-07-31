#문제: 소수 찾기
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12921)
#날짜: 2026-07-30

def solution(n):
    answer = 0
    
    for i in range(2, n+1):
        for j in range(2, int(i**0.5)+1):
            if i % j == 0:
                break
        else:
            answer += 1
            
    return answer

n=int(input("숫자 입력:"))
print(solution(n))

# 36의 약수 1 × 36 ,2 × 18,3 × 12,4 × 9 ,6 × 6
# 즉 약수는 루트 i까지만 확인하면 됨