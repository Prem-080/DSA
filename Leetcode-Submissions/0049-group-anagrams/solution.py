class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        store = {}
        for s in strs:
            _s = "".join(sorted(s))

            if _s in store:
                store[_s].append(s)
            else:
                store[_s] = [s]

        return list(store.values())
