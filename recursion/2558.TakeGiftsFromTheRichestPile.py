class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        #UPI
        #create a max heap and get the top elements k times 
        #do i insert the sqrt root back into the heap ?? that is my question

       

        #how to turn a heap into a max heap?
        #negate all the elements in the array and create a heap and the smallest element in the arry will be the larges if we negati ti agin
        for i in range(len(gifts)):
            gifts[i] = -gifts[i]

        #it is now negated now what
        heapq.heapify(gifts)
        #get the min of the heap and f
        for i in range(k):
            temp = -heapq.heappop(gifts)

            #i forgot that the elements in the list are now -
            temp = math.isqrt(temp)

            #now were pushing pos nums in to a min heap which messes it up
            heapq.heappush(gifts,-temp)

        total = 0
        #the things is totaled
        for i in gifts:
            total += (-i)


        return total



