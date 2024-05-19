def longestPalindrome(self, s: str) -> int:
        frequency = [0] * 128
        
        for c in s:
            frequency[ord(c)] += 1

        length = 0
        odd_found = False

        for count in frequency:
            length += count // 2 * 2

            if count % 2 == 1:
                odd_found = True

        return length + 1 if odd_found else length