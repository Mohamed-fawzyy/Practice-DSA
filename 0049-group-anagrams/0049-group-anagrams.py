class Solution(object):
    def groupAnagrams(self, strs):
        if strs is None or len(strs) == 1:
            return [strs]
        
        # i make tye type list to save the keys and val as a list and also to avoid the keyerorr
        #bec when we add a new value to a key doesnt exist it hadle it by make it a new key
        anagram_groups = defaultdict(list)

        #If the key already exists append the original word to that list and if not creat a new list.
        for s in strs:
            key = ''.join(sorted(s))
            anagram_groups[key].append(s)
        
        # Convert the values of the defaultdict to a list to get the groups
        return list(anagram_groups.values())
        
        
        