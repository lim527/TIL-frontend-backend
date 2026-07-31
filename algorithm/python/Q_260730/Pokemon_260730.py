#문제: 폰켓몬
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=python3)
#날짜: 2026-07-30

def solution(nums):
    answer = len(nums)//2
    arr=[]
    for n in nums:
        if(n not in arr):
            arr.append(n)
            
    if(len(arr)<answer):
        answer=len(arr)
    return answer

num=list(map(int,input("배열을 입력하세요:").split()))
print(solution(num))