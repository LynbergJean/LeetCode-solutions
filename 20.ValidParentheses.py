class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        #create the hashmap to map closing to open parenthesis
        seen = {")":"(", "}":"{", "]":"["}

        for ch in s:
            #if the closing bracket is seen 
            if ch in seen:
                #check if its in the stack and check if it it is the last one in the stack if it is then pop it 
                if stack and stack[-1] == seen[ch]:
                    stack.pop()
                else:
                    #if its not in the stack that means a closing pare theses was introduced in the sequeence before its closing pair meaning its impossible to complete the prblem
                    return False
            else:
                #if its an open parenthesis add it to the stack
                stack.append(ch)

        #check if the stack is empty if it is return true
        if not stack:
            return True

        return False

        
        