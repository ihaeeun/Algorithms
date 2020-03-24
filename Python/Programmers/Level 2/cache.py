def solution(cacheSize, cities):
    if not cacheSize:
        return len(cities) * 5

    answer = 0
    cache = ["" for i in range(cacheSize)]

    for i in cities:
        city = i.lower()
        if city in cache:
            if cache[-1] != city:
                cache.append(cache.pop(cache.index(city)))
            answer += 1
            print(cache)
        else:
            cache.pop(0)
            cache.append(city)
            answer += 5
            print(cache)

    return answer


cacheSize = 3
# cities = ["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "jeju", "Pangyo", "Seoul"]
cities = ['jeju', 'pangyo', 'newyork', 'Newyork']
print(solution(cacheSize, cities))
