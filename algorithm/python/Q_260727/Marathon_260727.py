#문제: 완주하지 못한 선수
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/42576)
# #날짜: 2026-07-27

def solution(participant, completion):
    answer = ''
    participant.sort()
    completion.sort()
    for i in range(len(completion)):
        if participant[i] != completion[i]:
            return participant[i]
    return participant[-1]

participant=list(map(str,input("참가자 입력: ").split()))
completion=list(map(str,input("완주자 입력: ").split()))
print(solution(participant, completion))