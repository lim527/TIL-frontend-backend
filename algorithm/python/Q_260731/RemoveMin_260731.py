#문제: 제일 작은 수 제거하기
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12935?language=python3)
#날짜: 2026-07-31

def solution(arr):
    answer =[]
    ind=0
    cnt=arr[0]
    if(len(arr)<=1):
        return [-1]
    for i in range(len(arr)):
        if(cnt>arr[i]):
            cnt=arr[i]
            ind=i
    for j in range(len(arr)):
        if(j!=ind):
            answer.append(arr[j])
    return answer

n=list(map(int,input("숫자만").split()))
print(solution(n))