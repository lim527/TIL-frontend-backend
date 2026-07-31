#문제: 최소직사각형
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=python3)
#날짜: 2026-07-29

def solution(sizes):
    for i in range(len(sizes)):
        w, h = sizes[i]

        if h > w:
            sizes[i] = [h, w]

    w_max = max(size[0] for size in sizes)
    h_max = max(size[1] for size in sizes)

    return w_max * h_max

sizes = []

while True:
    line = input()

    if line == "":
        break

    w, h = map(int, line.split())
    sizes.append([w, h])

print(solution(sizes))

#return max(max(x) for x in sizes) * max(min(x) for x in sizes)
