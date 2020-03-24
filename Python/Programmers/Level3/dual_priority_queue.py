import heapq


def max_heap(h):
    max_h = []
    for i in h:
        heapq.heappush(max_h, (-i, i))
    # heapq.heappop(max_h)
    return [i[1] for i in max_h]


def solution(operations):
    h = []
    for i in operations:
        # print(i)
        l = i.split()
        if l[0] == 'I':
            heapq.heappush(h, int(l[1]))
            print(h)
        else:
            if h:
                if int(l[1]) < 0:
                    heapq.heappop(h)
                    print(h)
                else:
                    h = max_heap(h)[1:]
                    heapq.heapify(h)
                    print(h)

    return [0,0] if not h else [max_heap(h)[0], h[0]]



operations = ["I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1",
              "I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1"]
# operations = ["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"]
print(solution(operations))
