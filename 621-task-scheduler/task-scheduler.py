class Solution(object):
    def leastInterval(self, tasks, n):
        """
        :type tasks: List[str]
        :type n: int
        :rtype: int
        """
        frequency = [0] * 26
        for task in tasks:
            frequency[ord(task) - ord('A')] += 1
        frequency.sort()
        chunk = frequency[25] - 1
        idle = chunk * n

        for i in range(24, -1, -1):
            idle -= min(chunk, frequency[i])
        
        return len(tasks) + idle if idle >= 0 else len(tasks)